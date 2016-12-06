// 예제 6-30: FixedDepositServiceImplJsr303 클래스 - FixedDepositDetails 객체의 유효성 확인

package sample.spring.chapter06.bankapp.service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

@Service(value = "FixedDepositServiceJsr303")
public class FixedDepositServiceJsr303Impl implements FixedDepositService {
     .....
    @Autowired
    private Validator validator;

    @Autowired
    @Qualifier(value="myFixedDepositDao")
    private FixedDepositDao myFixedDepositDao;

    @Override
    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) throws Exception {
	Set<ConstraintViolation<FixedDepositDetails>> violations =
	    validator.validate(fixedDepositDetails);

	Iterator<ConstraintViolation<FixedDepositDetails>> itr = violations.iterator();

	if (itr.hasNext()) {
	    logger.error("Errors were found while validating FixedDepositDetails instance");
	} else {
	    myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
	    logger.info("Created fixed deposit");
	}
    }
}
