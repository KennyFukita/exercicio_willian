package exercicio1;

import java.util.Scanner;

public class Teste {
	private static FuncoesAgenda agendaContatos;
	private static Scanner sc = new Scanner(System.in);
	
	private static void cadastrarContato() {
		String nome, numero, email;
		Contato c;	
		System.out.println("-> Cadastrar Contato");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Número: ");
		numero = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		c = new Contato(nome, numero, email);
		agendaContatos.inserirContato(c);
		System.out.println("\n");
	}
	
	private static void buscaPorNome() {
		String nome;
		System.out.print("Informe o nome para busca: ");
		nome = sc.nextLine();
		agendaContatos.buscarContatoPeloNome(nome);
	}
		
	private static void removerContato() {
		int id;
		agendaContatos.mostrarContatos();
		System.out.println("Selecione o ID da pessoa que deseja remover: ");
		id = sc.nextInt();
		sc.nextLine();
		agendaContatos.retiraContato(id);
	}
	
//////////////////////////////////////////////////////////////////////////////////////	
		public static void main(String[] args) {
			agendaContatos = new FuncoesAgenda();
			//testes
			cadastrarContato();//cadastra o primeiro contato
			cadastrarContato();//cadastra o segundo contato
			buscaPorNome();//buscar algum dos contatos cadastrados
			buscaPorNome();//buscar algum contato inexistente
			removerContato();//remover algum dos contatos cadastrados
			buscaPorNome();//verificar se o contato removido está presente na agenda
		}

}
