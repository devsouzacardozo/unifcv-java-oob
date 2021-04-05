package unifcv.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
              
		//filaString();
		atividade();
	}
	  public static void filaString() {
		  Queue<String> fila = new LinkedList<>();
		  
		  //Offer // add - Adicionam elementos na fila
		  // Diferen�a � o comportamento quando a fila est� cheia!!
		  
		  fila.add("Gilmar");
		  fila.add("Ana");
		  fila.offer("Bia");
		  fila.add("Anderson");
		  fila.add("Marcela");
		  fila.offer("Jo�o");
		  
		  int sequencia = 0;
		  System.out.println("teste de fila");
		  sequencia = sequencia+1;
		  // Peek // Element - buscar primeiro elemneto da fila
		  // a diferen�a � o comportamento quando a fila esta vazia, no caso Peek ele trata a excess�o
		  // j� o element gera umm erro de excess�o.

		  System.out.println("Tamanho da Fila Inicial: "+fila.size());
		  
		  System.out.println("Primeira da fila "+sequencia+": "+fila.peek()); //Pega o PRimeiro da fila

		  System.out.println("Limpando o Primento da fila "+sequencia+": "+fila.remove());
		  sequencia = sequencia+1;
		  System.out.println("Primeira da fila: "+sequencia+": "+fila.peek()); //Pega o PRimeiro da fila
		  //
		  System.out.println("Excess�o "+sequencia+": "+fila.element());
		  
		  System.out.println("Tamanho da Fila final: "+fila.size());
		  String nome = fila.peek();
		  if (nome == "Ana") {
			  System.out.println("Poss� Sim");  
		  }
		  System.out.println(fila.isEmpty());
		  System.out.println("fila pool: "+fila.poll());
		  

		  System.out.println("fila pool pr�ximo: "+fila.poll()); // Metodo Pool limpa da fila e informa o Nome.
		  fila.clear();
		  
		  fila.contains("Ana");
		  
		  System.out.println("Tamanho final: "+fila.size());
		  
		  
	  }
	  public static void atividade() {
		  //Crie uma estrutura de Fila para ser utilizada no sistema m�dico onde voc� foi contratado
		  // haver� o atendimento convencional e o priorit�rio
		  
		  //o Paciente chega no atendimento vai no terminal e escolhe entre 2 
		  // op�oes, nesse momento o sistema imprime um ticket com o numero
		  // do atendimento.
		  
		  //criem o atendimento --pra exibir quem exibir quem est� sendo atendido.
		  
		  Queue<String> filaNormal = new LinkedList<>();
		  Queue<String> filaPrioritario = new LinkedList<>();
		  
		  int normal = 0;
		  int prioritario = 0;
		  String senha = "senha: ";
		  int atendimento = 0;
		  int qtNornal = 0;
		  int qtPrioritaria = 0;
		  
		  filaNormal.add("Jo�o");
		  filaPrioritario.add("Paulo");
		  filaNormal.add("Jeferson");
		  filaPrioritario.add("Jo�o");
		  filaNormal.add("Anderson");
		  filaNormal.add("Ronaldo");
		  filaPrioritario.add("Adalgisa");


		  System.out.println("Quantidade Normal: "+filaNormal.size());
		  System.out.println("Quantidade Prioritario: "+ filaPrioritario.size());
		  
		  qtNornal = filaNormal.size();
		  qtPrioritaria = filaPrioritario.size();
		  
		  if(qtNornal <= qtPrioritaria) {
			  normal = normal+1;
			  System.out.println("Normal -> Senha: "+normal+": "+filaNormal.poll());
			  
		  }else {
			  prioritario = prioritario+1;
			  System.out.println("Priorit�rio -> Senha: "+prioritario+": "+filaPrioritario.poll());
		  }
		  System.out.println("Quantidade Prioritario: "+filaPrioritario.size());
		  System.out.println("Quantidade Normal: "+filaNormal.size());
		  
		  qtNornal = filaNormal.size();
		  qtPrioritaria = filaPrioritario.size();
		  if(qtNornal <= qtPrioritaria) {
			  normal = normal+1;
			  System.out.println("Normal -> Senha: "+normal+": "+filaNormal.poll());
			  
		  }else {
			  prioritario = prioritario+1;
			  System.out.println("Priorit�rio Senha: "+prioritario+": "+filaPrioritario.poll());
		  }
		  System.out.println("Quantidade Prioritario: "+filaPrioritario.size());
		  System.out.println("Quantidade Normal: "+filaNormal.size());
		  
		  qtNornal = filaNormal.size();
		  qtPrioritaria = filaPrioritario.size();
		  if(qtNornal <= qtPrioritaria) {
			  normal = normal+1;
			  System.out.println("Normal -> Senha: "+normal+": "+filaNormal.poll());
			  
		  }else {
			  prioritario = prioritario+1;
			  System.out.println("Priorit�rio -> Senha: "+prioritario+": "+filaPrioritario.poll());
		  }
		  System.out.println("Quantidade Prioritario: "+filaPrioritario.size());
		  System.out.println("Quantidade Normal: "+filaNormal.size());
		  
		  filaNormal.add("Pedro Andr�");
		  filaNormal.add("FabioGermano");
		  filaPrioritario.add("Irene Porfirio");
		  
		  qtNornal = filaNormal.size();
		  qtPrioritaria = filaPrioritario.size();
		  if(qtNornal <= qtPrioritaria) {
			  normal = normal+1;
			  System.out.println("Normal -> Senha: "+normal+": "+filaNormal.poll());
			  
		  }else {
			  prioritario = prioritario+1;
			  System.out.println("Priorit�rio -> Senha: "+prioritario+": "+filaPrioritario.poll());
		  }
		  System.out.println("Quantidade Prioritario: "+filaPrioritario.size());
		  System.out.println("Quantidade Normal: "+filaNormal.size());
		  
		  qtNornal = filaNormal.size();
		  qtPrioritaria = filaPrioritario.size();
		  if(qtNornal <= qtPrioritaria) {
			  normal = normal+1;
			  System.out.println("Senha: "+normal+": "+filaNormal.poll());
			  
		  }else {
			  prioritario = prioritario+1;
			  System.out.println("Senha: "+prioritario+": "+filaPrioritario.poll());
		  }
		  System.out.println("Quantidade Prioritario: "+filaPrioritario.size());
		  System.out.println("Quantidade Normal: "+filaNormal.size());
	  }

}
