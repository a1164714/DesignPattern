package StaticProxy;

public class RealSearcher implements Searcher{

	@Override
	public void search() {
		System.out.println("search");
	}

}
