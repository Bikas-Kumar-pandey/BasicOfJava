package LambdaExpression;

public class B {


	public static void main(String[] args) {
		 A a1 = () ->{
			System.out.println(100);
		};
		a1.test();
		a1.test2();
	}
}
