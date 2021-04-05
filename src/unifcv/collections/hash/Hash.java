package unifcv.collections.hash;

import java.util.HashSet;

import unifcv.Equals.Usuarios;

public class Hash {

	public static void main(String[] args) {
		hash();

	}

	private static void hash() {
         
         HashSet<Usuarios> usuarios = new HashSet<Usuarios>();
         
       
         usuarios.add(new Usuarios("Pedro"));
         usuarios.add(new Usuarios("Maria"));
         usuarios.add(new Usuarios("Samira"));
         usuarios.add(new Usuarios("João"));
         usuarios.add(new Usuarios("Ana"));
         
         boolean resultado = usuarios.contains(new Usuarios("Pedro"));
         

         
         System.out.println("Usuario: " + resultado);
         
         
		
	}

}
