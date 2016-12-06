// 예제 5-22: ApplicationConfigurer 클래스 - BeanFactoryPostProcessor 구현

package sample.spring.chapter05.bankapp.postprocessor;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ApplicationConfigurer implements BeanFactoryPostProcessor {

    public ApplicationConfigurer() {
	logger.info("Created ApplicationConfigurer instance");
    }

    @Override
    public void postProcessBeanFactory(
        ConfigurableListableBeanFactory beanFactory) throws BeansException {
	String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

	// -- 모든 빈 정의를 얻는다.
	for (int i = 0; i < beanDefinitionNames.length; i++) {
	    String beanName = beanDefinitionNames[i];
	    BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
	    beanDefinition.setAutowireCandidate(false);

	    // -- 빈의 의존성을 얻는다.
	    if (beanDefinition.isSingleton()) {
		if (hasPrototypeDependency(beanFactory, beanDefinition)) {
		    logger.error("Singleton-scoped " + beanName
				 + " bean is dependent on a prototype-scoped bean.");
		}
	    }
	}
    }
    .....
}
