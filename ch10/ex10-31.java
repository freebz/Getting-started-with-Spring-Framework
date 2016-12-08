// 예제 10-31: @RequestParam의 required 특성

    @RequestMapping(.....)
    public String perform(@RequestParam(value = "myparam", required = false)  String param) { ..... }
