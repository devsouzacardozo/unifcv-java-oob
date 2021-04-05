package unifcv.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapa {

	public static void main(String[] args) {
            mapa();
	}
	public static void mapa() {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Anderson Cardozo de Souza");
		usuarios.put(2, "Samuel Souza");
		usuarios.put(3, "Samira Souza");
		usuarios.put(4, "Denise Souza");
		usuarios.put(5, "Antonio Souza");
		usuarios.put(6, "Larissa Silva");
		
		usuarios.size();
		
		System.out.println("Quantidade: " + usuarios.size());
		
		
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.entrySet());
		
		System.out.println("Codigo 1 Presente na lista: " + usuarios.containsKey(10));		

		System.out.println("Codigo 1 Presente na lista: " + usuarios.containsValue("Tiago"));
		
		String nome = usuarios.get(1);
		
		System.out.println("Usuario: " + nome);
		
		for (int chave: usuarios.keySet()) {
			System.out.println("Chave: " + chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println("Nome: " + valor);
			
		}
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println("Id: " + registro.getKey() +" Nome: " +registro.getValue());
			System.out.println("Nome: " + registro.getValue());
			
		}
		
	}

}
