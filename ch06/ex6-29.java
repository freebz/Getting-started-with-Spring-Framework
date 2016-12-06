// 예제 6-29: FixedDepositServiceImpl 클래스 - FixedDepositDetails 객체의 유효성 확인

package sample.spring.chapter06.bankapp.service;

import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Validator;
.....
@Service(value="FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {

    @Autowired
    private Validator validator;

    @Autowired
    @Qualifier(value="myFixedDepositDao")
    private FixedDepositDao myFixedDepositDao;

    @Override
    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) throws Exception {
	BeanPropertyBindingResult bindingResult =
	    new BeanPropertyBindingResult(fixedDepositDetails, "Errors");
	validator.validate(fixedDepositDetails, bindingResult);

	if(bindingResult.getErrorCount() > 0) {
	    logger.error("Errors were found while validating FixedDepositDetails instance");
	} else {
	    myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
	    logger.info("Created fixed deposit");
	}
    }
}
