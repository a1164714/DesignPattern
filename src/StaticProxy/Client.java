package StaticProxy;

public class Client {
	public static void main(String[] args) {
		Searcher searcher = new SearcherProxy();
		searcher.search();
	}
}
