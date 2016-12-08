// 예제 10-1: HelloWorldController 클래스

package sample.spring.chapter10.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
.....
public class HelloWorldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest reqeust,
           HttpServletResponse response) throws Exception {
	Map<String, String> modelData = new HashMap<String, String>();
	modelData.put("msg", "Hello World !!");
	return new ModelAndView("helloworld", modelData);
    }
}
