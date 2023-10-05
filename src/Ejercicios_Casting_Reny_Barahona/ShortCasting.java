package Ejercicios_Casting_Reny_Barahona;

public class ShortCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short numShort = 70;
		
		// Casting explícito
		byte numByte = (byte) numShort;
		
		// Casting implícito	
		int numInt = numShort;
		
		// Casting implícito
		long numLong = numShort;
		
		// Casting implícito
		float numFloat = numShort;
		
		// Casting implícito
		double numDouble = numShort;
		
		// Casting explícito
		char caracter = (char) numShort;
		
		//boolean no se puede hacer casting 
		//boolean flag = numShort;
		
		
		
		
		System.out.println("El resultado en byte es explícito :"+numByte);
		System.out.println("El resultado en Int es implícito :"+numInt);
		System.out.println("El resultado en long es implícito :"+numLong);
		System.out.println("El resultado en Float es implícito :"+numFloat);
		System.out.println("El resultado en double es implícito :"+numDouble);
		System.out.println("El resultado en char es explícito :"+caracter);
		
	}

}
