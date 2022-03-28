package polymorphisimDemo;

public class Main {

	public static void main(String[] args) {
		/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
		for(BaseLogger logger:loggers) {
			logger.Log(" :mesaj");
		}*/
		CustemerManager custemerManger=new CustemerManager(new FileLogger());
		custemerManger.add();
	}

}
