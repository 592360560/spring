package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	@Autowired
	MainService mainService;

	public IndexService() {
		System.out.println("new indexService()");
	}
}
