package DynamicProxy.jdk;

public class Client {
	public static void main(String[] args) {
		SearcherProxy proxy = new SearcherProxy();
		Searcher searcher = (Searcher)proxy.bind(new RealSearcher());
		searcher.search();
	}
}
