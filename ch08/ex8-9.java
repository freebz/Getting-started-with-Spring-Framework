// 예제 8-9: JmsTemplate의 convertAndSend 메서드 사용

    jmsTemplate.convertAndSend("aDestination", "Hello, World!!",
        new MessagePostProcessor() {
	    public Message postProcesseMessage(Message message) throws JMSException {
		message.setBooleanProperty("printOnConsole", true);
		return message;
	    }
	});
