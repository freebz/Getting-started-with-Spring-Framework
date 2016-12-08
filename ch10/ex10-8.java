// 예제 10-8: SomeController 클래스 - @RequestMapping 사용

@Controller
@RequestMapping("/type_Level_Url")
public class SomeController {

    @RequestMapping("/methodA_Url")
    public ModelAndView methodA() {.....}

    @RequestMapping("/methodB_Url")
    public ModelAndView methodB() {.....}
}
