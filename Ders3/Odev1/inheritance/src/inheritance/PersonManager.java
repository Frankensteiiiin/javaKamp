package inheritance;

public class PersonManager {
	public void list(Person person) {
		System.out.println(person.firstName+" listelendi");
	}
	public void add(Person person) {
		System.out.println(person.firstName+" eklendi");
	}
}
