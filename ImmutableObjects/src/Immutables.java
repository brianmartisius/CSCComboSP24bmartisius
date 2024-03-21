
public class Immutables {

	public static void main(String[] args) {
		String name = "Alan Turing";
		//int[] combo = null;
		System.out.println(name.length());
		
		
		name = name.toUpperCase();
		System.out.println(name);
		
		String text = "Computer science is fun!";
		System.out.println(text);
		
		text = text.replace("Computer Science", "CS");
		System.out.println(text);
		
		
		Integer i = 5;
		System.out.println(i.equals(5));
		
		String str = "123";
		System.out.println(str + 4);
		int num = Integer.parseInt(str);
		System.out.println(num + 4);

	}

}
