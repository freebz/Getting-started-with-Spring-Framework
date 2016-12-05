// 예제 4-6: FixedDepositServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;

import org.springframework.core.io.ClassPathResource;
import sample.spring.chapter04.bankapp.Constants;

public class FixedDepositServiceImpl implements FixedDepositService {
    private FixedDepositDao fixedDepositDao;
    private EventSender eventSender;
    
    public FixedDepositServiceImpl(String configFile) throws Exception {
	ClassPathResource resource = new ClassPathResource(configFile);

	if (configProperties.exists()) {
	    InputStream inStream = configProperties.getInputStream();
	    Properties properties = new Properties();
	    properties.load(inStream);

	    String eventSenderClassString =
		properties.getProperty(Constants.EVENT_SENDER_CLASS_PROPERTY);

	    if (eventSenderClassString != null) {
		Class<?> eventSenderClass = Class.forName(eventSenderClass);
		eventSender = (EventSender) eventSenderClass.newInstance();
		logger.info("Created EventSender class");
	    } else {
		logger.info("appConfig.properties file doesn't contain the information " +
			    "about EventSender class");
	    }
	}
    }

    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) throws Exception {
	.....
	eventSender.sendEvent(event);
    }
}
