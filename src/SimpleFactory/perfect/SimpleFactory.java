package SimpleFactory.perfect;

public class SimpleFactory {
	public static Chart getChart(String type){
		Chart chart = null;
		if (type.equals("pie")) {
			chart = new PieChart();
		}else if (type.equals("line")) {
			chart = new LineChart();
		}else if(type.equals("histogram")){
			chart = new HistogramChart();
		}
		return chart;
	}
}
