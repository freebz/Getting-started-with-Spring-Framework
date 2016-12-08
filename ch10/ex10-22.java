// 예제 10-22: ! 및 != 연산자를 이용한 headers 특성 값 지정

    @RequestMapping(headers = { "Content-Type != application/json", "!Cache-Control", "From"})
    public void perform() { ..... }
