// 예제 11-23: 여러 모델 특성과 그에 해당하는 BindingResult 객체

@RequestMapping
public String doSomething(
    @ModelAttribute(value = "a") AObject aObj, BindingResult bindingResultA,
    @ModelAttribute(value = "b") AObject bObj, BindingResult bindingResultB,) {
    .....
}
