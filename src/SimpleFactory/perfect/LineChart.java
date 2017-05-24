package SimpleFactory.perfect;

public class LineChart implements Chart{
	public LineChart() {
		System.out.println("create LineChart");
	}
	public void display() {
		System.out.println("display LineChart");
	}
}