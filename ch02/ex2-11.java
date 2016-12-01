// 예제 2-11: EmailMessageSender 클래스 및 해당 빈 정의

public class EmailMessageSender {
    private String host;
    private String username;
    private String password;
    //.....
    public void setHost(String host) {
	this.host = host;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public void setPassword(String password) {
	this.password = password;
    }
    //.....
}

<bean id="emailMessageSender" class="EmailMessageSender">
    <property name="host" value="smtp.gmail.com"/>
    <property name="username" value="myusername"/>
    <property name="password" value="mypassword"/>
</bean>
