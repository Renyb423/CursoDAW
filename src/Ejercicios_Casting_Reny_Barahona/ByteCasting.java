package Ejercicios_Casting_Reny_Barahona;

public class ByteCasting {
// prueba git
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte numByte = 65;
		
		// Casting implícito
		short numShort = numByte;
		
		// Casting implícito
		int numInt = numByte;
		
		// Casting implícito
		long numLong = numByte;
		
		// Casting implícito
		float numFloat = numByte;
		
		// Casting  implícito
		double numDouble = numByte;
		
		// Casting explícito
		char caracter = (char) numByte;
		
		//boolean no se puede hacer casting 
		//boolean flag = numByte;
		
		
		System.out.println("El resultado en short es implícito  :"+numShort);
		System.out.println("El resultado en Int es implícito :"+numInt);
		System.out.println("El resultado en long es implícito :"+numLong);
		System.out.println("El resultado en Float es implícito :"+numFloat);
		System.out.println("El resultado en double es implícito :"+numDouble);
		System.out.println("El resultado en char es explícito :"+caracter);
	
	}

}
