package processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class GlobalBeanFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition indexService = (GenericBeanDefinition) beanFactory.getBeanDefinition("indexService");
//		System.out.println(indexService.getAutowireMode());
//		System.out.println("---------------------------");
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName+"----------BeanFactoryPostProcessor");
		}
	}
}
