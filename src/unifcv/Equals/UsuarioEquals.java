package unifcv.Equals;

public class UsuarioEquals {
	
	public static void main(String[] args) {
		Usuario();
	}
	
	public static void Usuario() {
		
		Usuario u1 = new Usuario();
		u1.setNome("Pedro Silva");
		u1.setEmail("cardozo_souza@hotmail.com");
		
		System.out.println("Nome: "+u1.getNome()+" Email: "+u1.getEmail());
		

		Usuario u2 = new Usuario();
		u2.setNome("Marcelo da Silva");
		u2.setEmail("marcelo_souza@hotmail.com");

		System.out.println("Nome: "+u2.getNome()+" Email: "+u2.getEmail());
		

		Usuario u3 = new Usuario();
		u3.setNome("Manoel de Souza");
		u3.setEmail("manoel_souza@hotmail.com");

		System.out.println("Nome: "+u3.getNome()+" Email: "+u3.getEmail());
		
		
	}

}
