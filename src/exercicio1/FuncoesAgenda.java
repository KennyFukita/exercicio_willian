package exercicio1;

import java.util.ArrayList;

public class FuncoesAgenda {
	private ArrayList<Contato> agendaContatos;
	
	public FuncoesAgenda(){
		agendaContatos = new ArrayList<Contato>();
	}
	
	public ArrayList<Contato> getAgendaContatos() {
		return agendaContatos;
	}
	
	public void setAgendaContatos(ArrayList<Contato> agendaContatos) {
		this.agendaContatos = agendaContatos;
	}

	public void inserirContato(Contato contato) {
		agendaContatos.add(contato);
	}
	
	public void buscarContatoPeloNome(String nome) {
		boolean achou = false;
		for(int i = 0; i < agendaContatos.size(); i++) {
			Contato cTemp = agendaContatos.get(i);
			if(nome.equals(cTemp.getNome())) {
				System.out.println("Usuário encontrado!");
				System.out.println("Nome: " + cTemp.getNome());
				System.out.println("Número: " + cTemp.getNumero());
				System.out.println("Email: " + cTemp.getEmail());
				System.out.println("\n");
				achou = true;
				break;
			}
		}
		if(achou == false) {
			System.out.println("Usuário não encontrado!\n");
		}
	}
	
	public void retiraContato(int id) {
		agendaContatos.remove(id);
	}
	
	public void mostrarContatos() {
		int i = 0;
		System.out.println("Contatos cadastrados");
		for(Contato a : agendaContatos) {
			System.out.println("["+ i +"]" + a);
			i++;
		}
		
	}
	
	public int size() {
		return agendaContatos.size();
	}
}
