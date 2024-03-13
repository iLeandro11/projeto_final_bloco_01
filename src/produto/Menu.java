package produto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("                                             ");
			System.out.println("               PRODUTODS ITERATOR            ");
			System.out.println("                                             ");
			System.out.println("---------------------------------------------");
			System.out.println("                                             ");
			System.out.println("               1 - Criar Produto             ");
			System.out.println("               2 - Listar Todos os Produtos  ");
			System.out.println("               3 - Atualizar o Produto       ");
			System.out.println("               4 - Deletar o Produto         ");
			System.out.println("                                             ");
			System.out.println("---------------------------------------------");
			System.out.println("Insira a opção desejada:                     ");
			System.out.println("                                             ");

			opcao = leia.nextInt();
			leia.close();

			switch (opcao) {
			case 1:
				System.out.println("Criar Produto\n\n");

				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");

				break;
			case 3:
				System.out.println("Atualizar o Produto\n\n");

				break;
			case 4:
				System.out.println("Deletar o Produto\n\n");
				
				break;
			default: 
				System.out.println("\nOpção Inválida\n");
				break;

			}

		}

	}

}
