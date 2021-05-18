package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
//@Component
public class A implements InitializingBean, BeanNameAware, BeanFactoryAware {

	public A() {
		System.out.println("A 构造器");
	}

	@PostConstruct
	public void init(){
		System.out.println("A init @PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 接口 afterPropertiesSet");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware 接口 setBeanName");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware 接口 setBeanFactory");
	}
}
