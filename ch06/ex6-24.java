// 예제 6-24: FixedDepositValidator 클래스 - 스프링의 Validator 인터페이스 구현

package sample.spring.chapter06.bankapp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FixedDepositValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
	return FixedDepositDetails.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
	FixedDepositDetails fixedDepositDetails = (FixedDepositDetails) target;
	if (fixedDepositDetails.getDepositAmount() == 0) {
	    errors.reject("zeroDepositAmount");
	}
    }
}
