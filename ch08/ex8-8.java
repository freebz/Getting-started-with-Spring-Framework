// 예제 8-8: JmsTemplate을 이용해 동적 JMS 토픽 대상으로 메시지 전송

-------------------- applicationContext.xml --------------------

<bean class="org.springframework.jms.core.JmsTemplate" id="jmsTemplate">
    <property name="connectionFactory" ref="cachingConnectionFactory" />
    <property name="defaultDestination" ref="fixedDepositDestination" />
    <property name="pubSubDomain" value="true" />
</bean>

-------------------- 동적 토픽 생성 --------------------

    jmsTemplate.send("dynamicTopic", new MessageCreator() {
	public Message createMessage(Session session) throws JMSException {
	    session.createTopic("dynamicTopic");
	    ObjectMessage objectMessage = session.createObjectMessage();
	    objectMessage.setObject(someObject);
	    return objectMessage;
	}
    });
