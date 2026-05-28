public class TiposDadosVariaveis {

	public static void main(String[] args) {
		
		int x = 10; //Declaração de uma variável do tipo int
		double d = x; //Variável double recebe um tipo int
		long l = x; //Variável long recebe um tipo int
		float f = x; //Variável float recebe um tipo int
		
		short s = 20; //Declaração de uma variável do tipo short
		x = s; //Variável int recebe um tipo short
		
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble; //Casting (força a conversão de double para int)
		System.out.println(valorInt);
		
	}

}
