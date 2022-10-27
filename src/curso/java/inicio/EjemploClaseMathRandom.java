package curso.java.inicio;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
//
//    	for(int i=0;i<=10;i++) {
//    		tirarDado(6);
//    	}
    	
//        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
//
//       
//        double random = Math.random();
//        System.out.println("random = " + random);
//        random *= colores.length;
//
//        System.out.println("random = " + random);
//        System.out.println("random = " + Math.ceil(random));
//        
//        System.out.println("floor = " + Math.floor(Math.PI));
//        System.out.println("ceil = " + Math.ceil(Math.PI));
//
//        System.out.println("colores = " + colores[(int) random]);
        
        Random randomObj = new Random();
        int random = randomObj.nextInt(20);
        System.out.println("random = " + random);
        int randomInt = 15 + random;
        System.out.println("randomInt = " + randomInt);
//
//        randomInt = randomObj.nextInt(colores.length);
//        System.out.println("randomInt = " + randomInt);
//        System.out.println("colores = " + colores[randomInt]);
    }
    
    static void tirarDado (int numCaras) {
    	double random = Math.random();
    	int tirada = (int)Math.ceil((numCaras * random));
    	System.out.println(tirada);
    }
}
