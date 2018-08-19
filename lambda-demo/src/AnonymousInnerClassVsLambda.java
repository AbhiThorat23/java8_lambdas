
/**
 * Demo to show difference between Anonymous Inner class and Lambda with respect
 * to instance/Local variable and this keyword.
 * 
 * @author Abhijit Thorat
 *
 */
public class AnonymousInnerClassVsLambda {

	int x = 88; // Instance variable of Outer class

	/**
	 * Whatever variable declared inside Anonymous inner class act as instance variable of anonymous
	 * Inner class.
	 * 
	 * Inside Anonymous inner class "this" always refers to current inner class
	 * object only, by using "this" we can access only inner class member.
	 * 
	 */
	public void UsingAnonymousInnerClass() {
		TestInterf i = new TestInterf() {
			int x = 99; // Instance variable of Anonymous Inner class

			@Override
			public void method1() {
				System.out.println(this.x); // In Anonymous Inner class, "this" always refers to current inner class
											// object

			}
		};
		i.method1();
	}

	/**
	 * Whatever variable we declare inside Lambda expression by default acts as local variable
	 * of Lambda expression.
	 * 
	 * Inside Lambda expression "this" always refers to current
	 * outer class object only, by using "this" we can access outer class members.
	 */
	public void UsingLambda() {
		TestInterf i = () -> {
			int x = 100; // this is not instance variable. This is Local variable of Lambda Expression
			System.out.println(this.x); // In Lambda "this" always refers to current outer class object
		};
		i.method1();
	}

	public static void main(String[] args) {
		AnonymousInnerClassVsLambda test = new AnonymousInnerClassVsLambda();
		test.UsingAnonymousInnerClass();
		test.UsingLambda();

	}
}

interface TestInterf {
	public void method1();
}
