package processor;

import config.MyConfiger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class GlobalBean implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof MyConfiger){
			return null;
		}
		System.out.println(beanName+" BeanPostProcessor接口  postProcessBeforeInitialization");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof MyConfiger){
			return null;
		}
		System.out.println(beanName+" BeanPostProcessor接口  postProcessAfterInitialization");
		return null;
	}
}
