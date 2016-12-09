// 예제 11-24: FixedDepositDetailsValidator - 스프링 Validator 인터페이스 사용

package sample.spring.chapter11.web;

import org.springframework.validation.*;
import sample.spring.chapter11.domain.FixedDepositDetails;

public class FixedDepositDetailsValidator implements Validator {

    public boolean supports(Class<?> clazz) {
	return FixedDepositDetails.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
	FixedDepositDetails fixedDepositDetails = (FixedDepositDetails) target;
	long depositAmount = fixedDepositDetails.getDepositAmount();
	.....
	if (depositAmount < 1000) {
	    errors.rejectValue("depositAmount", "error.depositAmount.less",
                    "must be greater than or equal to 1000");
	}
	if (email == null || "".equalsIgnoreCase(email)) {
	    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","error.email.blank",
                    "must not be blank");
	}
	.....
    }
}
