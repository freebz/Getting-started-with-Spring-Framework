// 예제 5-23: ApplicationConfigurer의 hasPrototypeDependency 메서드

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.RuntimeBeanReference;

public class ApplicationConfigurer implements BeanFactoryPostProcessor {
    .....
    private boolean hasPrototypeDependency(ConfigurableListableBeanFactory beanFactory,
        BeanDefinition beanDefinition) {
	boolean isPrototype = false;
	MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
	PropertyValue[] propertyValues = mutablePropertyValues.getPropertyValues();
	for (int j = 0; j < propertyValues.length; j++) {
	    if (propertyValues[j].getValue() instanceof RuntimeBeanReference) {
		String dependencyBeanName = ((RuntimeBeanReference) propertyValues[j]
		    .getValue()).getBeanName();
		BeanDefinition dependencyBeanDef = beanFactory
		    .getBeanDefinition(dependencyBeanName);
		if (dependencyBeanDef.isPrototype()) {
		    isPrototype = true;
		    break;
		}
	    }
	}
	return isPrototype;
    }	
}
