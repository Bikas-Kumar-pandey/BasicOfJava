/*package appjava2;

public class B {
int i=10;
static int j =20;
int k=30;
public static void main(String[] args) {
	B b1= new B();
	System.out.println(b1.i); //10 Evertime we want to access non static member must be Accessed via Object
	System.out.println(B.j);  //20 Everytime we create a class Common Memory is created for Static members
	System.out.println(b1.k); //30
}

}

//Static Members belongs to a class 
// static members always get 1 copy of static member , where As no's of Static members copies will 
//--be equal to no.s of Object
// To Access Static Member we Use Syntax = ClassName MembersName;  */

/*package appjava2;
public class B {
int i=10;
static int j =20;
int k=30;
public static void main(String[] args) {
	B b1= new B();
	b1.test();          //thid is for non static method
	
}
public void test() {
	System.out.println("Lets print");
}

}  */


package appjava2;
public class B {
int i=10;
static int j =20;
int k=30;
public static void main(String[] args) {
	B.test();
	// this is for Static method
}
public static void test() {
	System.out.println("Lets print");
}

}
