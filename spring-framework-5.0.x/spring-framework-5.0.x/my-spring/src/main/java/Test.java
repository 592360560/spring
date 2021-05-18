import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = System.currentTimeMillis() / 1000 + "";
		sb.append(s.substring(7));
//		String substring = s.substring(7);
//		System.out.println(s);
		System.out.println(sb.toString());

//		System.out.println(LocalDate.now().format("yyyyMMdd").toString());
		System.out.println(System.currentTimeMillis()/1000);

		System.out.println("----------------------------------");
		System.out.println(System.currentTimeMillis());
//		System.out.println(LocalDateTime.now().toString());
		System.out.println("----------------------------------");
	}
}
