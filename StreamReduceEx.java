import java.util.Arrays;
import java.util.List;

public class StreamReduceEx {

	public static void main(String[] args) {
		ExCollections c = new ExCollections();
		c.persons.stream().reduce((p1, p2) -> p1.age > p2.age ? p1:p2).ifPresent(System.out::println);

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
	
	@Override
	public String toString() {
		return name;
	}
}
