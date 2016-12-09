// 예제 11-4: 요청 매개변수를 @ModelAttribute 어노테이션이 지정된 메서드로 전달

    @ModelAttribute(value = "myObject")
    public SomeObject doSomething(@RequestParam("someArg") String myarg) { ..... }
