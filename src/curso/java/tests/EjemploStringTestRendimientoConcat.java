package curso.java.tests;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        int [] numRepeticiones = {500,1000,10000,100000};
        String [] pruebas = {"concat", "+","stringbuffer" };
        
        for (int repeticiones : numRepeticiones) {
			for (String prueba : pruebas) {
        		ejecutaPrueba(repeticiones,prueba);
			}
		}
        
        System.exit(0);
    }
    static void ejecutaPrueba (int repeticiones, String prueba) {
    	String a = "a";
        String b = "b";
        String c = a;
    	
        System.out.println("================== Prueba "+prueba+" para "+ repeticiones + " repeticiones");
    	long inicio = System.currentTimeMillis();
        System.out.println("Empieza: " + inicio);
        
        if (prueba.equals("concat")) {
	        for(int i = 0; i < repeticiones; i++){
	            c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
	        }
        }else if (prueba.equals("+")) {
        	for(int i = 0; i < repeticiones; i++){
	            c += a + b + "\n"; // 500 => 19, 1000 => 21ms, 10000 => 68, 100000 => 1976ms
	        }
        }else if (prueba.equals("stringbuffer")) {
        	StringBuffer sb = new StringBuffer(a);
        	for(int i = 0; i < repeticiones; i++){
	            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
	        }
        	String resultado = sb.toString();
        	System.out.println(resultado);
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println("Total: " + (fin - inicio));
        //System.out.println("c = " + c);
        //System.out.println("sb = " + sb.toString());
    }
    
    
}
