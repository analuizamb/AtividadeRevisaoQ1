package atividade1;


public class Programa {
	public static void main(String[] args) {
		Pedido p1 = new Pedido(11, 22042021, 111, 1111, "Alguem", 11111, "Ana", "Um notebook", 111111, "Notebook", "Computador port�til", 1, 3500);
	}

	System.out.println("O pedido " + p1.getIdentificacao() + " do produto " + p1.getNome() + " est� na nota fiscal de n�mero: " + p1.getNumero() + " emitida por: " + p1.getNomeEmissor() + " para o(a)cliente: " + p1.getNomeCliente());
}
