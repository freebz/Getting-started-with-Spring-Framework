// 예제 6-25: FixedDepositServiceImpl 클래스 - FixedDepositDetails 객체의 유효성 확인

package sample.spring.chapter06.bankapp.service;

import org.springframework.validation.BeanPropertyBindingResult;
import sample.spring.chapter06.bankapp.validator.FixedDepositValidator;

@Service(value="FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {

    @Autowired
    @Qualifier(value="myFixedDepositDao")
    private FixedDepositDao fixedDepositDao;

    @Override
    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) throws Exception {
	BeanPropertyBindingResult bindResult =
	    new BeanPropertyBindingResult(fixedDepositDetails, "Errors");
	FixedDepositValidator validator = new FixedDepositValidator();
	validator.validate(fixedDepositDetails, bindingResult);

	if(bindingResult.getErrorCount() > 0) {
	    logger.error("Errors were found while validating FixedDepositDetails instance");
	} else {
	    myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
	    logger.info("created fixed deposit");
	}
    }
}
