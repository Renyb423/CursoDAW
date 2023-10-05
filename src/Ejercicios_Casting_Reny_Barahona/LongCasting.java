package Ejercicios_Casting_Reny_Barahona;

public class LongCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long numLong = 80;
		
		// Casting explícito
		byte numByte = (byte) numLong;
		
		// Casting explícito
		short numShort = (short) numLong;
		
		// Casting explícito
		int numInt = (int) numLong;
				
		// Casting implícito
		float numFloat = numLong;
		
		// Casting  implícito
		double numDouble = numLong;
		
		// Casting explícito
		char caracter = (char) numLong;
		
		//boolean no se puede hacer casting 
		//boolean flag = numLong;
		
		
		System.out.println("El resultado en byte es explícito :"+numByte);
		System.out.println("El resultado en short es explícito  :"+numShort);
		System.out.println("El resultado en Int es explícito :"+numInt);
		System.out.println("El resultado en Float es implícito :"+numFloat);
		System.out.println("El resultado en double es implícito :"+numDouble);
		System.out.println("El resultado en double es explícito :"+caracter);
		
}
}
