package curso.java.inicio;

public class StringEquals {

	public static void main(String[] args) {
		String a = "1";
		String b = "Hola";
		System.out.println(b.hashCode());
		String c = new String("Hola");
		System.out.println(c.hashCode());
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(b==c);	
		System.out.println(b.equals(c));

	}

}
