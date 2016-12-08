// 예제 10-17: Content-Type 헤더 값이 application/json인 경우 perform 메서드가 호출된다.

    @RequestMapping(consumes = "application/json")
    public void perform() { ..... }
