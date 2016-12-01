// 예제 2-18. EmailMessageSender 클래스 및 해당 빈 정의

public class EmailMessageSender {
    private String host;
    private String username;
    private String password;
    //.....
    public EmailMessageSender(String host, String username, String password) {
	this.host = host;
	this.username = username;
	this.password = password;
    }
    //.....
}

<bean id="emailMessageSender" class="EmailMessageSender">
    <constructor-arg index="0" value="smtp.gmail.com"/>
    <constructor-arg index="1" value="myusername"/>
    <constructor-arg index="2" value="mypassword"/>
</bean>
