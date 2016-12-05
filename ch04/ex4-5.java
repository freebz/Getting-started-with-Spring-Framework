// 예제 4-5: EventSenderSelectorServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;

import org.springframework.core.io.ClassPathResource;
import sample.spring.chapter04.bankapp.Constants;

public class EventSenderSelectorServiceImpl {
    public EventSenderSelectorServiceImpl(String configFile) throws Exception {
	ClassPathResource resource = new ClassPathResource(configFile);
	OutputStream os = new FileOutputStream(resource.getFile());

	Properties properties = new Properties();
	properties
	    .setProperty(Constants.EVENT_SENDER_CLASS_PROPERTY,
		 "sample.spring.chapter04.bankapp.event.DatabaseEventSender");
	properties.store(os, null);
	.....
    }
}
