// 예제 8-31: @CachePut 어노테이션

package sample.spring.chapter08.bankapp.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
.....
@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
    .....
    @CachePut(value={"FixedDeposit"}, key="#FixedDepositId")
    public FixedDepositDetails getFixedDeposit(int FixedDepositId) {
	logger.info("getFixedDeposit method invoked with FixedDepositId " + FixedDepositId);
	return myFixedDepositDao.getFixedDeposit(FixedDepositId);
    }

    @Cacheable(value={"FixedDeposit"}, key="#FixedDeposit")
    public FixedDepositDetails getFixedDepositFromCache(int FixedDepositId) {
	logger.info("getFixedDepositFromCache method invoked with FixedDepositId "
		    + FixedDepositId);
	throw new RuntimeException("This method throws exception because "
            + "FixedDepositDetails object must com form the cache");
    }
    .....
}
