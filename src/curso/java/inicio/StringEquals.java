package curso.java.inicio;

public class StringEquals {

	public static void main(String[] args) {
		String a = "1";
		String b = "Hola";
		String c = new String("Hola");
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a==c);	
		System.out.println(a.equals(c));

	}

}
