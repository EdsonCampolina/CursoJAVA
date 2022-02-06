import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Edson");
		list.add("Joao");
		list.add("Maria");
		list.add("Pedro");
		list.add(2, "Joana");
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println(list.size());

		list.remove("Pedro");
		list.remove(3);
		list.add("Edson");
		list.remove("Edson");
		list.add("Joaquim");
		list.add("Jamelo");
		list.removeIf(x -> x.charAt(0) == 'J');
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("");
		list.add("Edson");
		list.add("Joaquim");
		list.add("Jamelo");
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("Index of Edson " + list.indexOf("Edson"));
		System.out.println("Index of Jonas " + list.indexOf("Jonas"));

		System.out.println();
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String name : result) {
			System.out.println(name);
		}
		System.out.println();

		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Name = " +  name);
		
		String nullName = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
		System.out.println("nullName = " +  nullName);
	}

}
