package Facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {
	public String read(String fileNameSrc) {
		try {
			FileReader reader = new FileReader(new File(fileNameSrc));
			char[] cs = new char[1024];
			int len = -1;
			System.out.println("获取明文：");
			while ((len = reader.read(cs))!=-1) {
				System.out.println(cs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileNameSrc;
	}
}
