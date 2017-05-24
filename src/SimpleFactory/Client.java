package SimpleFactory;

public class Client {
	public static void main(String[] args) {
		Chart chart = SimpleFactory.getChart("line");
		chart.display();
	}
}
