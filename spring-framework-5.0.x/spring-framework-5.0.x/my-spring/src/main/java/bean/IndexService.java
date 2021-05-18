package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//@Service
@Component
public class IndexService implements InitializingBean {
	@Autowired
	MainService mainService;

	public IndexService() {
		System.out.println("indexService() 构造器");
	}
	@PostConstruct
	public void say(){
		System.out.println("indexService say init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("IndexService InitializingBean接口 afterPropertiesSet");
	}
}
