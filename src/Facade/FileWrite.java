package Facade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	@SuppressWarnings("null")
	public void write(String encryptStr,String fileNameDes) {
		FileWriter writer = null;
		System.out.println("�������ģ�д���ļ�");
		try {
			File file = new File(fileNameDes);
			writer = new FileWriter(file);
			writer.write(encryptStr);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (writer==null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
