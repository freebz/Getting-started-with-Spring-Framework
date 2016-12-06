// 예제 6-21: Sample 클래스 - 메서드와 메서드 매개변수 단계에 @Value 어노테이션 사용

package sample.spring.chapter06.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component(value="sample")
public class Sample {
    .....
    private String[] splitName;
    private String city;

    @Autowired
    public void splitName(@Value("#{configuration.splitName('FirstName LastName')}")
			  String[] splitName) {
	this.splitName = splitName;
    }

    @Autowired
    @Value("#{configuration.getCity()}")
    public void city(String city) {
	this.city = city;
    }
    .....
}
