package StaticProxy;

public class SearcherProxy implements Searcher {

	private RealSearcher searcher = new RealSearcher();

	public void search() {
		searchBefore();
		searcher.search();
		searchAfter();
	}

	private void searchBefore() {
		System.out.println("searchBefore");
	}

	private void searchAfter() {
		System.out.println("searchAfter");
	}
}
