// 예제 10-21: Content-Type 헤더 값이 text/plain인 경우 perform 메서드가 호출된다.

    @RequestMapping(headers = "Content-Type=text/plain")
    public void perform() { ..... }
