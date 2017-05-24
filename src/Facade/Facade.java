package Facade;

public class Facade {
	private FileRead reader;
	private FileWrite writer;
	private CiperMachine cipher;
	public Facade(){
		reader = new FileRead();
		writer = new FileWrite();
		cipher = new CiperMachine();
	}
	
	public void FileEncrypt(String fileNameSrc, String fileNameDes){
		 String plainStr = reader.read(fileNameSrc);  
         String encryptStr = cipher.encrypt(plainStr);  
         writer.write(encryptStr, fileNameDes);
	}
}
