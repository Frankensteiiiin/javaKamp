package interfaceAbstractDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager custemerManager=new StarbucksCustomerManager(new CustomerCheckManager()) ;
		Date date=new Date();
		custemerManager.Save(new Customer(5,"ebru","kosker",date,"737792898929"));

	}

}
