package polymorphisimDemo;

public class CustemerManager {
	private BaseLogger logger;
	public CustemerManager(BaseLogger logger) {
		this.logger=logger;
	}
	public void add() {
		System.out.println("m��teri eklendi");
		this.logger.Log(": log mesaj");
	}
}
