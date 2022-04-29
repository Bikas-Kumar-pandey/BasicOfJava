package SIB_IIB_ADVANCE;

// Object creation

public class C {
	
	{  
		System.out.println("1");
		
	}
	
	{  // If we create object in non static block then execution Halt Abruptly
		System.out.println("1");
		@SuppressWarnings("unused")
		C c3 = new C();
	}
	
	C(){
		System.out.println("2");
	}
	C(int i){
		//System.out.println("3");
         System.out.println(i);
         return;
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C(100);
		System.out.println(c1 +".."+ c2);
		
	}

}
