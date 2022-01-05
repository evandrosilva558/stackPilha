package dio.stackPilha;

import java.util.Stack;

public class Exec {

	public static void main(String[] args) {
		
		// Stack pilha onde o ultimo adicionado e o primeiro a sair.
		Stack<Carro> stackCarro = new Stack<>();
		
		// objetos adicionados a pilha com metodo push.
		stackCarro.push(new Carro("Ford"));
		stackCarro.push(new Carro("Fiat"));
		stackCarro.push(new Carro("Volkswagen"));
		
		// imprimindo a pilha de Carros.
		System.out.println(stackCarro);
		
		// tirado um objeto do topo da pilha com metodo pop.
		System.out.println(stackCarro.pop());
		
		// pega o ultimo objeto da pilha com metodo peek mais nao retira = Carro [marca=Fiat].
		System.out.println(stackCarro.peek());
		
		System.out.println(stackCarro);
		
		// retorna se a pilha esta vazia com metodo empt = false.
		System.out.println(stackCarro.empty());
	}

}
