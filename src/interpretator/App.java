package interpretator;



public class App {
	
	public static void main(String[] args) {
		
		Context context = new Context();
		
		try {
			context.evalate("22-(-2.3)");
			System.out.println(context.result());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(22-(-2.3) );
		System.out.println(context.getRPN());
		
	}
}
