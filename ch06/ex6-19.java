// 예제 6-19: Sample 클래스 - SpEL 식을 사용하는 @Value 어노테이션

package sample.spring.chapter06.beans;

import org.springframework.beans.factory.annotation.Value;

@Component(value="sample")
public class Sample {
    @Value("#{configuration.environment}")
    private String environment;
    .....
    @Value("#{configuration.getCountry()}")
    private String currency;

    @Value("#{configuration.state}")
    private String state;
    .....
}
