// 예제 12-10: @RequestStatus 어노테이션 사용

import org.springframework.web.bind.annotation.ResponseStatus;

public class SomeController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public SomeObject doSomething() {
	.....
    }
}
