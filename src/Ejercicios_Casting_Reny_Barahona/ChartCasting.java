package Ejercicios_Casting_Reny_Barahona;


public class ChartCasting {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char caracter = 'Z' ;
		
		// casting explícito
		byte numByte =  (byte) caracter;
		
		// casting explicito
		short numShort =  (short) caracter;
		
		// Casting implícito
		int numInt = caracter;
		
		// Casting implícito
		long numLong = caracter;
		
		// Casting implícito
		float numFloat = caracter;
		
		// Casting implícito
		double numDouble = caracter;
		
		//boolean no se puede hacer casting 
		//boolean flag = caracter;
		
		System.out.println("El resultado en byte es explícito :"+numByte);
		System.out.println("El resultado en short es explícito  :"+numShort);
		System.out.println("El resultado en Int es implícito :"+numInt);
		System.out.println("El resultado en long es implícito :"+numLong);
		System.out.println("El resultado en Float es implícito :"+numFloat);
		System.out.println("El resultado en double es implícito :"+numDouble);
		
		
	}

}
