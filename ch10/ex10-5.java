// 예제 10-5: ServletContextAware 및 ServletConfigAware 사용

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

public class ABean implements ServletContextAware, ServletConfigAware {
    private ServletContext servletContext;
    private ServletConfig servletConfig;

    @Override
    public void setServletContext(ServletContext servletContext) {
	this.servletContext = servletContext;
    }

    @Override
    public void setServletConfig(ServletConfig servletConfig) {
	this.servletConfig = servletConfig;
    }

    public void doSomething() {
	//-- ServletContext 및 ServletConfig 객체 사용
    }
}
