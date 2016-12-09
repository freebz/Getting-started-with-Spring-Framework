// 예제 12-11: @ExceptionHandler 어노테이션 사용

package sample.spring.chapter12.web;

import sample.spring.chapter12.exception.ValidationException;
.....
public class FixedDepositController {
    .....
    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleException(Exception ex) {
	logger.info("handling ValidationException " + ex.getMessage());
	return ex.getMessage();
    }
}
