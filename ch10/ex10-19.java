// 예제 10-19: Content-Type 헤더 값이 application/json 또는 text/plain인 경우 perform 메서드가 호출된다.

    @RequestMapping(consumes = { "application/json", "text/plain" })
    public void perform() { ..... }
