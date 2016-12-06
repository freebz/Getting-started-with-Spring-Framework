// 예제 5-15: DependencyResolutionBeanPostProcessor 클래스

package sample.spring.chapter05.bankapp.postprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import sample.spring.chapter05.bankapp.common.MyApplicationContext;

public class DependencyResolutionBeanPostProcessor implements BeanPostProcessor,
    Ordered {
    private MyApplicationContext myApplicationContext;
    private int order;

    public void setMyApplicationContext(MyApplicationContext myApplicationContext) {
	this.myApplicationContext = myApplicationContext;
    }

    public void setOrder(int order) {
	this.order = order;
    }

    @Override
    public int getOrder() {
	return order;
    }

    @Override
    public void postProcessBeforeInitialization(Object bean, String beanName)
	throws BeansException {
	if (bean instanceof DependencyResolver) {
	    ((DependencyResolver) bean).resolveDependency(myApplicationContext);
	}
	return bean;
    }

    @Override
    public void postProcessAfterInitialization(Object bean, String beanName)
	throws BeansException {
	return bean;
    }
}
