// 예제 10-13: 여러 요청 매개변수의 이름-값 쌍을 params 특성 값으로 지정

    @RequestMapping(params = { "x=a", "y=b" })
    public void perform() { ..... }
