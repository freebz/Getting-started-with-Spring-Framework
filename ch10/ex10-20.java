// 예제 10-20: Accept 헤더 값이 application/json인 경우 perform 메서드가 호출된다.

    @RequestMapping(produces = "application/json")
    public void perform() { ..... }
