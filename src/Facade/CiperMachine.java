package Facade;

public class CiperMachine {
	public String encrypt(String plainText) {
		System.out.println("���ݼ��ܣ�������ת��Ϊ���ģ�");
		StringBuffer es = new StringBuffer();
		char[] chars = plainText.toCharArray();
		for (char ch : chars) {
			es.append(ch % 7);
		}
		System.out.println(es.toString());
		return es.toString();
	}
}




