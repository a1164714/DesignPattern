package DynamicProxy.cglib;

public class Client {
	public static void main(String[] args) {
		SearcherProxy proxy = new SearcherProxy();
		Searcher searcher = (Searcher)proxy.getInstance(new RealSearcher());
		searcher.search();
	}
}
