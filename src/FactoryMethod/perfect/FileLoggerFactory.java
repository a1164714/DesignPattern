package FactoryMethod.perfect;

//�ļ���־��¼�������ࣺ���幤��
class FileLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		// �����ļ���־��¼������
		Logger logger =  new FileLogger();
		// �����ļ�������ʡ��
		return logger;
	}
}