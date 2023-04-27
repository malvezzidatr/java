package classe;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		System.out.println(p1.precoComDesconto());
		
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		System.out.println(p2.precoComDesconto());
		
		Double p1PrecoFinal = p1.precoComDesconto();
		Double p2PrecoFinal = p2.precoComDesconto();
		Double mediaCarrinho = (p1PrecoFinal + p2PrecoFinal) / 2;
		
		System.out.println(p1.nome);
		System.out.println(p1PrecoFinal);
		System.out.println(p2.nome);
		System.out.println(p2PrecoFinal);
		System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);
	}
}
