package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
@Component
public class MainService implements InitializingBean {
	@Autowired
	IndexService indexService;

	public MainService() {
		System.out.println("MainService() 构造器--");
	}

	@PostConstruct
	public void say(){
		System.out.println("MainService say init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MainService InitializingBean接口 afterPropertiesSet");
	}
}
