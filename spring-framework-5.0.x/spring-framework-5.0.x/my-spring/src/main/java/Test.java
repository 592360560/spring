import annotation.MyAutowired;
import bean.C;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		C c = new C();
		Class<? extends C> clazz = c.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			Annotation[] annotations = field.getAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation.annotationType().equals(MyAutowired.class)){
					Class<?> type = field.getType();
					Object fieldClass = type.newInstance();
					field.set(c,fieldClass);
				}
			}
		}
		String s = c.toString();
		System.out.println("s = " + s);
	}
}
