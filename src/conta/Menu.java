package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
			
	int opcao;	
	Scanner leia = new Scanner(System.in);
	
	while (true){
		System.out.println("***********************************************");
		System.out.println("                                               ");
		System.out.println("               Banco do Brazil                 ");
		System.out.println("                                               ");
		System.out.println("***********************************************");
		System.out.println("                                               ");
		System.out.println("          1 - Criar conta                      ");
		System.out.println("          2 - Listar todas as Contas           ");
		System.out.println("          3 - Buscar Conta  por Número         ");
		System.out.println("          4 - Atualizar Dados da Conta         ");
		System.out.println("          5 - Apagar Conta                     ");
		System.out.println("          6 - Sacar                            ");
		System.out.println("          7 - Depositar                        ");
		System.out.println("          8 - Transferir valores entre Conta   ");
		System.out.println("          9 - Sair                             ");
		System.out.println("                                               ");
		System.out.println("***********************************************");
		System.out.println("Entre com a opção desejada:                    ");
		System.out.println("                                               ");
		
		opcao = leia.nextInt();
		
		if(opcao == 9) {
			System.out.println("\nBanco do Brazil - O seu Futuro começa aqui!");
			leia.close();
			System.exit(0);
		}
		switch (opcao) {
		case 1:
			System.out.println("Criar Conta \n\n");
			
			break;
		case 2:
			System.out.println("Listar todas as Contas \n\n");
			
			break;
		case 3:
			System.out.println("Consultar dados da Conta - por número\n\n");
			
			break;
		case 4:
			System.out.println("Atualizar dados da conta\n\n");
			
			break;
		case 5:
			System.out.println("Apagar a Conta\n\n");
			
			break;
		case 6:
			System.out.println("Saque\n\n");
			
			break;
		case 7:
			System.out.println("Depósito\n\n");
			
			break;
		case 8:
			System.out.println("Transfrência entre Contas\n\n");
			
			break;
		default:
			System.out.println("\nOpção Inválida\n");
			break;
		}
	}
	
	}
}
