import bean.IndexService;
import config.MyConfiger;
import inner.InnerClass;
import inner.OuterClass;
import inner.SortInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
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
