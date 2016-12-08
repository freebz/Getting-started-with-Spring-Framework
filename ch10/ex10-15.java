// 예제 10-15: 요청 매개변수 x가 없는 경우 perform 메서드가 호출된다.

    @RequestMapping(params = "!x")
    public void perform() { ..... }
