package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	@Autowired
	IndexService indexService;

	public MainService() {
		System.out.println("new MainService()");
	}
}
