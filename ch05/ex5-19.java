// 예제 5-19: EventSenderFactoryBean 클래스

package sample.spring.chapter05.bankapp.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class EventSenderFactoryBean implements FactoryBean<EventSender>, InitializingBean {
    .....
    @Override
    public EventSender getObject() throws Exception {
	logger.info("getObject method of EventSenderFactoryBean invoked");
	return new EventSender();
    }

    @Override
    public Class<?> getObjectType() {
	return EventSender.class;
    }

    @Override
    public boolean isSingleton() {
	return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
	logger.info("afterPropertiesSet method of EventSenderFactoryBean invoked");
    }
}
