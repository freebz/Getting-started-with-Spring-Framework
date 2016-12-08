// 예제 10-11: 여러 HTTP 방식을 method 특성으로 지정

@Controller
@RequestMapping(value="/sample")
public class MyController {

    @RequestMapping(value = "/action", method = { RequestMethod.GET, RequestMethod.POST })
    public MedelAndView action() { ..... }
    .....
}
