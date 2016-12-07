// 예제 7-18: @Transactional의 value 특성

-------------------- SomeServiceImpl 클래스 --------------------

@Service
public class SomeServiceImpl implements SomeService {
    .....
    @Transactional(value = "tx1")
    public int methodA() {.....}

    @Transactional(value = "tx2")
    public int methodB() {.....}
}

-------------------- 애플리케이션 컨텍스트 XML 파일 --------------------

<tx:annotation-driven />

<bean id="tx1"
    class="org.springframework.orm.hibernate4.HibernateTransactionManager">
    <property name="sessionFactory1" ref="sessionFactory1"/>
</bean>

<bean id="tx2"
    class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource" />
</bean>
