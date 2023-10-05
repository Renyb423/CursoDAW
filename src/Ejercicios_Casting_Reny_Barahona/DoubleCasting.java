package Ejercicios_Casting_Reny_Barahona;

public class DoubleCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double numDouble = 85;
		 

		// Casting  explícito
		byte numByte = (byte) numDouble;
		
		// Casting explícito
		short numShort = (short) numDouble;
		
		// Casting explícito
		int numInt = (int) numDouble;
		
		// Casting explícito
		long numLong = (long) numDouble;
		
		// Casting explícito
		float numFloat = (float) numDouble;
		
		// Casting explícito
		char caracter = (char) numDouble;
		
		//boolean no se puede hacer casting 
		//boolean flag = numDouble;
		
		System.out.println("El resultado en byte es explícito :"+numByte);
		System.out.println("El resultado en short es explícito  :"+numShort);
		System.out.println("El resultado en Int es explícito :"+numInt);
		System.out.println("El resultado en long es explícito :"+numLong);
		System.out.println("El resultado en Float es explícito :"+numFloat);
		System.out.println("El resultado en char es explícito :"+caracter);
	
	}

}
