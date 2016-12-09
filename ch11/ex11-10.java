// 예제 11-10: @ModelAttribute 어노테이션이 지정된 인자가 Model 객체에 없는 경우

@Controller
@RequestMapping(value = "/some")
public class SomeController {
    .....
    @RequestMapping("/do")
    public void doSomething(@ModelAttribute("myObj") MyObject myObject) {
	logger.info(myObject);
	.....
    }
}
