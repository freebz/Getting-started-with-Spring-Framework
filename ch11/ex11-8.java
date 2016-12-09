// 예제 11-8: @RequestMapping 및 @ModelAttribute 어노테이션이 모두 지정된 메서드는 요청을 처리하기 위해 한 번만 호출된다.

@RequestMapping("/mycontroller")
public class MyController {

    @RequestMapping("/perform")
    @ModelAttribute
    public String perform() { ..... }

    @ModelAttribute(value = "a")
    public A getA() { ..... }

    @ModelAttribute(value = "b")
    public B getB() { ..... }
}
