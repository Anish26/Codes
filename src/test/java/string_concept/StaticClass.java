package string_concept;

public class StaticClass {
	
	static int a;

	public static void main(String Arg[]) {
		StaticClass obj1 = new StaticClass();
		StaticClass obj2 = new StaticClass();
		obj1.a=5;
		obj2.a=7;
		System.out.println(obj1.a);
		System.out.println(a);
		
		

	}

}
