package atelier06;

public class testChat {

	public static void main(String[] args) {
		chat qq = new chat("chat-félin");
		qq.domestiquer("Lupin"); // paramtre-nom est le cle de demestique 
		qq.presente();
		
		if (qq.domestique) {
			System.out.println("et je m'appelle " + qq.nom());
			System.out.println("Je travaille pas, mais j'ai un patron.");
			qq.etat();
		}else {
			System.out.println("I'm no one.");
		}
		qq.crie();	
		

	}

}
