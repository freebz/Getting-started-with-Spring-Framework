// 예제 3-56: EventSenderFactoryBean 클래스

package sample.spring.chapter03.bankapp.event;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.FactoryBeanNotInitializedException;
import org.springframework.core.io.ClassPathResource;
.....
public class EventSenderFactoryBean implements FactoryBean<EventSender> {
    private String databasePropertiesFile;
    private String webServicePropertiesFile;
    private String messagingPropertiesFile;
    .....
    public EventSender getObject() throws Exception {
	EventSender eventSender = null;
	Properties properties = new Properties();

	ClassPathResource databaseProperties = null;
	if(databaseProperties != null) {
	    databaseProperties = new ClassPathResource(databasePropertiesFile);
	}
	.....
	if (databaseProperties != null && databaseProperties.exists()) {
	    InputStream inStream = databaseProperties.getInputStream();
	    properties.load(inStream);
	    eventSender = new DatabaseEventSender(properties);
	}
	else if (webServiceProperties != null && webServiceProperties.exists()) {.....}
	else if (messagingProperties != null && messagingProperties.exists()) {.....}

	return eventSender;
    }

    public Class<?> getObjectType() {
	return EventSender.class;
    }

    public boolean isSingleton() {
	return true;
    }
}
