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
		  // Diferença é o comportamento quando a fila está cheia!!
		  
		  fila.add("Gilmar");
		  fila.add("Ana");
		  fila.offer("Bia");
		  fila.add("Anderson");
		  fila.add("Marcela");
		  fila.offer("João");
		  
		  int sequencia = 0;
		  System.out.println("teste de fila");
		  sequencia = sequencia+1;
		  // Peek // Element - buscar primeiro elemneto da fila
		  // a diferença é o comportamento quando a fila esta vazia, no caso Peek ele trata a excessão
		  // já o element gera umm erro de excessão.

		  System.out.println("Tamanho da Fila Inicial: "+fila.size());
		  
		  System.out.println("Primeira da fila "+sequencia+": "+fila.peek()); //Pega o PRimeiro da fila

		  System.out.println("Limpando o Primento da fila "+sequencia+": "+fila.remove());
		  sequencia = sequencia+1;
		  System.out.println("Primeira da fila: "+sequencia+": "+fila.peek()); //Pega o PRimeiro da fila
		  //
		  System.out.println("Excessão "+sequencia+": "+fila.element());
		  
		  System.out.println("Tamanho da Fila final: "+fila.size());
		  String nome = fila.peek();
		  if (nome == "Ana") {
			  System.out.println("Possí Sim");  
		  }
		  System.out.println(fila.isEmpty());
		  System.out.println("fila pool: "+fila.poll());
		  

		  System.out.println("fila pool próximo: "+fila.poll()); // Metodo Pool limpa da fila e informa o Nome.
		  fila.clear();
		  
		  fila.contains("Ana");
		  
		  System.out.println("Tamanho final: "+fila.size());
		  
		  
	  }
	  public static void atividade() {
		  //Crie uma estrutura de Fila para ser utilizada no sistema médico onde você foi contratado
		  // haverá o atendimento convencional e o prioritário
		  
		  //o Paciente chega no atendimento vai no terminal e escolhe entre 2 
		  // opçoes, nesse momento o sistema imprime um ticket com o numero
		  // do atendimento.
		  
		  //criem o atendimento --pra exibir quem exibir quem está sendo atendido.
		  
		  Queue<String> filaNormal = new LinkedList<>();
		  Queue<String> filaPrioritario = new LinkedList<>();
		  
		  int normal = 0;
		  int prioritario = 0;
		  String senha = "senha: ";
		  int atendimento = 0;
		  int qtNornal = 0;
		  int qtPrioritaria = 0;
		  
		  filaNormal.add("João");
		  filaPrioritario.add("Paulo");
		  filaNormal.add("Jeferson");
		  filaPrioritario.add("João");
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
			  System.out.println("Prioritário -> Senha: "+prioritario+": "+filaPrioritario.poll());
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
			  System.out.println("Prioritário Senha: "+prioritario+": "+filaPrioritario.poll());
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
			  System.out.println("Prioritário -> Senha: "+prioritario+": "+filaPrioritario.poll());
		  }
		  System.out.println("Quantidade Prioritario: "+filaPrioritario.size());
		  System.out.println("Quantidade Normal: "+filaNormal.size());
		  
		  filaNormal.add("Pedro André");
		  filaNormal.add("FabioGermano");
		  filaPrioritario.add("Irene Porfirio");
		  
		  qtNornal = filaNormal.size();
		  qtPrioritaria = filaPrioritario.size();
		  if(qtNornal <= qtPrioritaria) {
			  normal = normal+1;
			  System.out.println("Normal -> Senha: "+normal+": "+filaNormal.poll());
			  
		  }else {
			  prioritario = prioritario+1;
			  System.out.println("Prioritário -> Senha: "+prioritario+": "+filaPrioritario.poll());
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
