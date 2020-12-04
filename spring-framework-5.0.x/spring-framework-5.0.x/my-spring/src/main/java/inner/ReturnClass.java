package inner;

public class ReturnClass implements SortInterface{
	@Override
	public Object sayNum() {
		System.out.println("ReturnClass sayNum");
		return new ReturnClass();
	}
}
