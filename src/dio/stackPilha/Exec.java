package dio.stackPilha;

import java.util.Stack;

public class Exec {

	public static void main(String[] args) {
		
		
		Stack<Carro> stackCarro = new Stack<>();
		
		stackCarro.add(new Carro("Ford"));
		stackCarro.add(new Carro("Fiat"));
		stackCarro.add(new Carro("Volkswagen"));

	}

}
