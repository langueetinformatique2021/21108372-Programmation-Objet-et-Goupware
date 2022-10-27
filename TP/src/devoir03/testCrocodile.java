package devoir03;

public class testCrocodile {

	public static void main(String[] args) {
		Crocodile qq = new Crocodile("Reptile-Crocodile",3);
		qq.domestiquer("***Les Vacances YEAH!!!!***");
		qq.presente();
		qq.getage();
		qq.hibernation(true);
		
		if (qq.domestique) {
			System.out.println("Je travaille pas, mais j'ai un patron");
			qq.etat();
		}else {
			System.out.println("I'm no one");
		}
		qq.crie();
	}

}
