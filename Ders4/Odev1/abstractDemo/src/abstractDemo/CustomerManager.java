package abstractDemo;

public class CustomerManager {
	private BaseDatabaseManager baseBatabaseManager;
	public CustomerManager(BaseDatabaseManager baseBatabaseManager) {
		super();
		this.baseBatabaseManager = baseBatabaseManager;
	}
	public void getCustomers() {
		baseBatabaseManager.getData();
	}
}
