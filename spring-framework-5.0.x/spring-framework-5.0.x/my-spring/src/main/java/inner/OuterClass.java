package inner;

import bean.IndexService;

public class OuterClass {

	public IndexService print(String name, SortInterface sort){
		System.out.println("out class say");
		System.out.println(name);
		IndexService id = new IndexService();
//		Object o = sort.sayNum();
//		System.out.println(o);
		return id;
	}
}
