// 예제 11-3: HttpServletRequest 형식의 인자를 받는, @ModelAttribute 어노테이션이 지정된 메서드

    @ModelAttribute(value = "myObject")
    public SomeObject doSomething(HttpServletRequest request) { ..... }
