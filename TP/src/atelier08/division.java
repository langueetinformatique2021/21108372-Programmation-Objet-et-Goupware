package atelier08;

public class division {
	public static void main(String[] args) {
	int i = 1000;
	int j;
	try{
		do 
		   {	
			i--; j = 1 / i;
		   } 
		while (true);
	}
	catch(Exception e) {
		System.out.println("Report of error !");
		System.out.println(e.getMessage());
	}
	
	}

}
/// Exception : Division par zéro 