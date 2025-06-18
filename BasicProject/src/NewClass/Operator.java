package NewClass;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=12;
		
		System.out.println("add:"+(a+b));
		System.out.println("sub:"+(a-b));
		System.out.println("multi:"+(a*b));
		System.out.println("div:"+(a/b));
		System.out.println("Modulo:"+(a%b));
		
		//shift operation
		int num1=1;
		System.out.println("org:"+num1);
		System.out.println("left:"+(num1<<2)); // << >> 8 2^2=4
		System.out.println("signed:"+(num1>>2));
		System.out.println("org:"+(num1>>>2));
		
		// relational operator
		System.out.println("equal to:"+(a==b));
		System.out.println("greater than:"+(a>b));
		System.out.println("less than:"+(a<b));
		System.out.println("greater than equal to:"+(a>=b));
		System.out.println("less than equal to:"+(a<=b));
		System.out.println("not equal to:"+(a!=b));
		
		// Bitwise operator
		if(a>10 && b<30) {
			System.out.println("Both are true");
		}
			if(a>10 && b<30) { 
			System.out.println("at leat one");
			if(!(a<10))
				System.out.println("x is not less than 10");
			}
		// ternary operator/voting app
			int age =22;
			String voting = (age>=18) ?"You can Vote" : "You cannot Vote";
			System.out.println(voting);
			
			//assignment operator
			
			int abc=10;
			System.out.println(abc);
			
			abc+=5;
			System.out.println("value:"+abc);
			
			abc-=3;
			System.out.println("value:"+abc);
			
			abc*=2;
			System.out.println("value:"+abc);
			
			abc/=4;
			System.out.println("value:"+abc);
	}

}
