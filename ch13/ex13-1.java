// 예제 13-1: MyRequestHandlerInterceptor

package sample.spring.chapter13.web;

import org.springframework.web.servlet.HandlerInterceptor;

public class MyRequestHandlerInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
	logger.info("HTTP method --> " + request.getMethod());
	Enumeration<String> requestNames = request.getParameterNames();
	.....
	return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler, ModelAndView modelAndView) throws Exception {
	logger.info("Status code --> " + response.getStatus());
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
	logger.info("Request processing complete");
    }
}
