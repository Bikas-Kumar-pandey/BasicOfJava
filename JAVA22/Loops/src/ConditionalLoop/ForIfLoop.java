package ConditionalLoop;

public class ForIfLoop {

	public static void main(String[] args) {
		 for (int i =0; i<=5;i++) { 
			if(i==3) {
				break ;      //o/p -> 012 : it breaks the for loop
				//continue ;     //o/p -> 012 45 : it skip the if block and continue for loop
			}
			System.out.println(i);
		}
   System.out.println("Im out of Loop");
	}
	
}
