import config.MyConfiger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Boot {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiger.class);
	}
}
