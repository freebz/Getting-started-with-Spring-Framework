// 예제 2-28: 지연 초기화되는 싱글턴 범위 빈

public class ABean {
    private BBean bBean;

    public void setBBean(BBean bBean) {
	this.bBean = bBean;
    }
    .....
}

<bean id="aBean" class="ABean" lazy-init="true">
    <property name="bBean" value="bBean" />
</bean>

<bean id="bBean" class="BBean"/>
