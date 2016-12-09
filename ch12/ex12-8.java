// 예제 12-8: @ResponseBody 어노테이션 사용

import org.springframework.web.bind.annotation.ResponseBody;
.....
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String doSomething() {
	return "Hello world !";
    }
.....
