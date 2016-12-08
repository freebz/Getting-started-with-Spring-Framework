// 예제 10-38: @ExceptionHandler 메서드가 처리하는 예외 형식 지정

@Controller
.....
public class MyController {
    .....
    @ExceptionHandler(value = {IOException.class, FileNotFoundException.class})
    public String myExceptionHandler() {
	return "someError";
    }

    @ExceptionHandler(value = TimeoutException.class)
    public String myOtherExceptionHandler() {
	return "otherError";
    }
}
