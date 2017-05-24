package DynamicProxy.jdk;

public class RealSearcher implements Searcher{

	@Override
	public void search() {
		System.out.println("search");
	}

}
