package FactoryMethod.perfect;

public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		factory = (LoggerFactory) XMLUtil.getBean(); // getBean()�ķ�������ΪObject����Ҫ����ǿ������ת��
		logger = factory.createLogger();
		logger.writeLog();
	}
}
