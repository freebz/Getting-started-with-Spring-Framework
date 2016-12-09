// 예제 12-7: HttpServletResponse에서 응답 설정

import org.springframework.http.HttpServletResponse;
.....
    @RequestMapping(method = RequestMethod.GET)
    public void doSomething(HttpServletResponse response) throws IOException {
	response.setHeader("some-header", "some-value");
	response.setStatus(200);
	response.getWriter().write("Hello world !");
    }
.....
