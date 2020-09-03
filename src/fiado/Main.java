package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int fiado = 0;
		
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe o telefone do cliente: ");
		String telefone = scanner.nextLine();
		
		System.out.print("Informe o número de compras fiadas do cliente: ");
		int nmrDeComprasFiadas = Integer.valueOf(scanner.nextLine());
		
		Consumidor consumidor = new Consumidor(nome, telefone, nmrDeComprasFiadas);
		
		for(int i = 0; i < nmrDeComprasFiadas; i++) {
			do{	
				System.out.print("Informe o valor da compra: ");
				fiado = Integer.valueOf(scanner.nextLine());
			}while(checkIfZero(fiado));
			
			consumidor.registrarFiado(fiado);
		}
		
		
		int total = consumidor.getFiados();
		
		if(total > 100) {
			System.out.println("Cliente: " + consumidor.getNome() +" Seu telefone: " + consumidor.getTelefone() + " Ele(a) deve: " + total + " R$" + " e ganhou brinde");	
		}else {
			System.out.println("Cliente: " + consumidor.getNome() +" Seu telefone: " + consumidor.getTelefone() + " Ele(a) deve: " + total + " R$");
		}
	}
	
	public static boolean checkIfZero(int fiado){
		if(fiado > 0) {
			return false;
		}
		System.out.println("Valor inválido tente um valor superior a zero");
		return true;	
	}
	
	
}


