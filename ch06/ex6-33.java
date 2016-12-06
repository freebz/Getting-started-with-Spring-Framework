// 예제 6-33: BankAppConfiguration 클래스 - BeanFactoryPostProcessor 및 BeanPostProcessor 빈

package sample.spring.chapter06.bankapp;

import org.springframework.context.annotation.Bean;

@Configuration
public class BankAppConfiguration {
    .....
    @Bean
    public ExampleBeanPostProcessor exampleBeanPostPorcessor() {
	return new ExampleBeanPostProcessor();
    }

    @Bean
    public static void BeanNamePrinterBeanFactoryPostProcessor applicationConfiguration() {
	return new BeanNamePrinterBeanFactoryPostProcessor();
    }
}
