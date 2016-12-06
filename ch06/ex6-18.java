// 예제 6-18: @Value 어노테이션 사용

package sample.spring.chapter06.beans;

import org.springframework.beans.factory.annotation.Value;

@Component(value="sample")
public class Sample {
    @Value("Some currency")
    private String currency;
    .....
}
