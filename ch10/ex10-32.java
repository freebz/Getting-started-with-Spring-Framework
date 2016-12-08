// 예제 10-32: @RequestParam의 defaultValue 특성

    @RequestMapping(.....)
    public String perform(@RequestParam(value = "location", defaultValue = "earth") String param) { ..... }
