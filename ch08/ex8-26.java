// 예제 8-26: @Scheduled 어노테이션 사용

import org.springframework.scheduling.annotation.Scheduled;

@Compoenet
public class Sample {
    @Scheduled(cron="0 0 9-17 * * MON-FRI")
    public void doA() { ..... }

    @Scheduled(fixedRate = 5000)
    public void doB() { ..... }
}
