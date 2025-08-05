import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {

	public static void main(String[] args) {
		System.out.println("Test pass");
		List<String> mylist = new ArrayList<String>();
		mylist.add("GK");
		mylist.add("PK");
		mylist.add("MH");
		mylist.add("KT");
		mylist.add("TY");
		mylist.add("OK");
		
		System.out.println("mylist : " +mylist);
		
		Predicate<String> allK = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				if (t.endsWith("K"))
					return true;
				else
					return false;
			}
		};
		
		List<String> klist = mylist.stream().filter(allK).collect(Collectors.toList());
		System.out.println("klist : " +klist);
		

	}

}
