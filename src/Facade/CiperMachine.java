package Facade;

public class CiperMachine {
	public String encrypt(String plainText) {
		System.out.println("数据加密，将明文转换为密文：");
		StringBuffer es = new StringBuffer();
		char[] chars = plainText.toCharArray();
		for (char ch : chars) {
			es.append(ch % 7);
		}
		System.out.println(es.toString());
		return es.toString();
	}
}




