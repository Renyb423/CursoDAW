package Ejercicios_Casting_Reny_Barahona;

public class FloatCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numFloat = 82;
		
		// Casting explícito
		 byte numByte = (byte) numFloat;
		
		// Casting explícito
		short numShort = (short) numFloat;
		
		// Casting explícito
		int numInt = (int) numFloat;
		
		// Casting explícito
		long numLong = (long) numFloat;
		
		// Casting  implícito
		double numDouble = numFloat;
		
		// Casting explícito
		char caracter = (char) numFloat;
		
		//boolean no se puede hacer casting 
		//boolean flag = numFloat;
		
		
		System.out.println("El resultado en byte es explícito :"+numByte);
		System.out.println("El resultado en short es explícito  :"+numShort);
		System.out.println("El resultado en Int es explícito :"+numInt);
		System.out.println("El resultado en long es explícito :"+numLong);
		System.out.println("El resultado en double es implícito :"+numDouble);
		System.out.println("El resultado en char es explícito :"+caracter);
		//System.out.println("resultado en boolean es :"+caracter);
	}
}
