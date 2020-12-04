package inner;

import bean.MainService;

public class InnerClass implements SortInterface{

	public InnerClass() {
		System.out.println("new InnerClass()");
	}

	@Override
	public Object sayNum() {
		System.out.println("innerClass sayNum");
		return new ReturnClass();
	}


}
