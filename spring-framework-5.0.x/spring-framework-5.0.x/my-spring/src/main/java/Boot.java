import bean.IndexService;
import config.MyConfiger;
import inner.InnerClass;
import inner.OuterClass;
import inner.SortInterface;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.ObjectUtils;

import java.util.Map;

public class Boot {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames) {
//			BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
//			System.out.println(beanDefinition.isLazyInit());
//		}
		ac.register(MyConfiger.class);
		ac.refresh();
//		Boot bo = new Boot();
//		bo.test();

	}

//	public InnerClass test(){
//		OuterClass outerClass = new OuterClass();
//		String name ="name";
//		Object id = outerClass.print(name,() -> {
//			  return doSomething();
//		});
//		return null;
//	}
//
//	public SortInterface doSomething(){
//		System.out.println("do");
//		return new InnerClass();
//	}
}
