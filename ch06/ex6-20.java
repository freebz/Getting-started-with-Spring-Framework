// 예제 6-20: Configuration 컴포넌트 클래스

package sample.spring.chapter06.beans;

import org.springframework.stereotype.Component;

@Component(value="configuration")
public class Configuration {
    public static String environment = "DEV";

    public String getCountry() {
	return "Some country";
    }

    public String getState() {
	return "Some state";
    }

    public String[] splitName(String name) {
	return name.split(" ");
    }

    public String getCity() {
	return "Some city";
    }
}
