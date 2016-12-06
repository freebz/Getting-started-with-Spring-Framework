// 예제 6-31: BankAppConfiguration 클래스 - @Configuration 및 @Bean 어노테이션

package sample.spring.chapter06.bankapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
.....
@Configuration
public class BankAppConfiguration {
     .....
    @Bean(name = "customerRegistrationService")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CustomerRegistrationService customerRegistrationService() {
	return new CustomerRegistrationServiceImpl();
    }
    .....
}
