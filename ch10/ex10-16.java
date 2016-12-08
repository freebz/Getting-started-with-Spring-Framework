// 예제 10-16: 요청 매개변수 x 값이 a가 아닐 경우 perform 메서드가 호출된다.

    @RequestMapping(params = "x != a")
    public void perform() { ..... }
