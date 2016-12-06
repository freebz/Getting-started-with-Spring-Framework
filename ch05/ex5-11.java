// 예제 5-11: InstanceValidationBeanPostProcessor 클래스

package sample.spring.chapter05.bankapp.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPOstProcessor;
import org.springframework.core.Ordered;

public class InstanceValidationBeanPostProcessor implements BeanPOstProcessor, Ordered {
    private static Logger logger = Logger.getLogger(InstanceValidationBeanPostProcessor.class);
    private int order;

    public InstanceValidationBeanPostProcessor() {
	logger.info("Created InstanceValidationBeanPostProcessor instance");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
	throws BeansException {
	logger.info("postProcessBeforeInitialization method invoked");
	return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
	throws BeansException {
	logger.info("postProcessAfterInitialization method invoked");
	if (bean instanceof InstanceValidator) {
	    ((InstanceValidator) bean).validateInstance();
	}
	return bean;
    }

    public void setOrder(int order) {
	this.order = order;
    }

    @Override
    public int getOrder() {
	return order;
    }
}
