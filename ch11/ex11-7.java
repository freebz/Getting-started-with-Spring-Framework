// 예제 11-7: @RequestMapping 어노테이션이 지정된 메서드는 모든 @ModelAttribute 어노테이션이 지정된 메서드가 호출된 후 호출된다.

@RequestMapping("/mycontroller")
public class MyController {

    @RequestMapping("/perform")
    public String perform() { ..... }

    @ModelAttribute(value = "a")
    public A getA() { ..... }

    @ModelAttribute(value = "b")
    public B getB() { ..... }
}
