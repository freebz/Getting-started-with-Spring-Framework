// 예제 12-6: HttpHeaders 사용

import org.springframework.http.HttpHeaders;
.....
    @RequestMapping(method = RequestMethod.GET)
    public HttpEntity<String> doSomething() {
	HttpHeaders responseHeaders = new HttpHeaders();
	responseHeaders.set("some-header", "some-value");
	
	return new HttpEntity<String>("Hello world !", responseHeaders);
    }
.....
