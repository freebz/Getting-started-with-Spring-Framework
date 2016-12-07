// 예제 8-21: ThreadPoolTaskExecutor를 사용한 작업 실행

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

@Compoenet
public class Sample {
    @Autowired
    private TaskExecutor taskExecutor;

    public void executeTask(Runnable task) {
	taskExecutor.execute(task);
    }
}
