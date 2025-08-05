import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceEx {

	public static void main(String[] args) {
		Collections c = new Collections();
		System.out.print("Eldest Person: ");
		Optional<Person> eldest = c.persons.stream().reduce((p1, p2) -> p1.age < p2.age ? p1:p2);
		eldest.ifPresent(System.out::println);
		
		int sumOfAges = c.persons.stream().mapToInt(Person :: getAge).sum();
		System.out.println("Sum of Agges :" + sumOfAges);
		
		System.out.print(c.persons.stream().count());
	
	}

}

class Collections {
	
	List<Person> persons = Arrays.asList(
			new Person("Gyanendra", 40), 
			new Person("Anurag", 39), 
			new Person("Anup", 29), 
			new Person("Pankaj", 38));

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name +" " + age;
	}
}
