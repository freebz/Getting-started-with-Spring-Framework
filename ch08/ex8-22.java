// 예제 8-22: ThreadPoolTaskScheduler 구성 및 사용

-------------------- ThreadPoolTaskScheduler 구성 --------------------

    <bean id="myScheduler"
        class="org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler">
        <property name="poolSize" value="5"/>
    </bean>

-------------------- ThreadPoolTaskScheduler 사용 --------------------

import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.PeriodicTrigger;

@Compoenet
public class Sample {
    @Autowired
    @Qualifier("myScheduler")
    private TaskExecutor taskScheduler;

    public void executeTask(Runnable task) {
	taskScheduler.schedule(task, new PeriodicTrigger(5000));
    }
}
