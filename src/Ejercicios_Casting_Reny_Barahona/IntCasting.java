package Ejercicios_Casting_Reny_Barahona;

public class IntCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numInt = 75;
		
		// Casting explícito
		byte numByte = (byte)numInt;
		
		// Casting explícito
		short numShort = (short)numInt;
		
		// Casting implícito
		long numLong = numInt;
		
		// Casting implícito
		float numFloat = numInt;
		
		// Casting implícito
		double numDouble = numInt;
		
		// Casting explícito
		char caracter = (char) numInt;
		
		//boolean no se puede hacer casting 
		//boolean flag = numInt;
		
		
		System.out.println("El resultado en byte es explícito :"+numByte);
		System.out.println("El resultado en short es explícito :"+numShort);
		System.out.println("El resultado en long es implícito :"+numLong);
		System.out.println("El resultado en Float es implícito :"+numFloat);
		System.out.println("El resultado en double es implícito :"+numDouble);
		System.out.println("El resultado en char es explícito :"+caracter);
	}

}
