package SimpleFactory.perfect;

public class Client {
	public static void main(String[] args) {
		Chart chart;  
        String type = XMLUtil.getChartType(); //��ȡ�����ļ��еĲ���  
        chart =SimpleFactory.getChart(type); //������Ʒ����  
        chart.display();  
	}
}
