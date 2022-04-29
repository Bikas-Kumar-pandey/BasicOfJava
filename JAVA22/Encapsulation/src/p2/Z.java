package p2;

public class Z {
	private String var;
	
	public void setVar(String str) {
		                           //System.out.println(str); -> to check str is called or not
		
	this.var = str;
									/*
									 * System.out.println(var); -> to check weather stored in var if not it will
									 * print Null coz Var is mentioned as Ststic variable
									 * 
									 */
	}
	
	public void getVar() {
		System.out.println(var);
		
	}
	
	public static void main(String[] args) {
		
		Z z1 = new Z();
		z1.setVar("Bikas");
		z1.getVar();
	}
}
