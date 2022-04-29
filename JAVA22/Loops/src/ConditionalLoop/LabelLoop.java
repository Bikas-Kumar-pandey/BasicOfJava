package ConditionalLoop;
// Label means where the Control of Execution should Jump
public class LabelLoop {
	public static void main(String[] args) {
		x:for (int i=0; i<=5; i++) { //if X:for -> o/p= 012  means take out of for loop
			 if(i==3) { // if X:3 -> o/p = 012345
               break x;
			}
			System.out.println(i);
		}
		System.out.println("Out of loop");
	}
	

}

