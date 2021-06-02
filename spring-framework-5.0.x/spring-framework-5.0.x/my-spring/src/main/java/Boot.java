import bean.C;
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
		ac.register(MyConfiger.class);
		ac.refresh();
		C bean = ac.getBean(C.class);
		System.out.println("bean = " + bean);
	}

}
