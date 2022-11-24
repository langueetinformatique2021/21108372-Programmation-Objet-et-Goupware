package atelier08;

public class division2 {
	
	public static void main(String[] args) { 
		try{
		division();}
		catch(ArithmeticException e) {
			System.out.println("Report of error in main !");
			System.out.println(e.getMessage());
		}
	}
	public static void division() throws ArithmeticException{
		int i = 1000;
		int j;
		do{i--; j = 1 / i;} 
		while (true);
		//System.out.println("fin");
		}
	
	
		
}
