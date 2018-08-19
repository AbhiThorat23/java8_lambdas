
/**
 * Inside Lambda Expression we can access local variables of enclosing methods
 * and instance variable of enclosing outer class directly
 * 
 * The local variables of enclosing methods referenced from lambda expression are acts as final
 * and hence we can’t perform re-assignment for those local variables otherwise
 * we get compile time error. If we uncomment line 25 then we will get compile
 * time error.
 * 
 * @author Abhijit Thorat
 *
 */
public class BehaviourOfLocalVariableOfMethodInsideLambdaExpression {

	int x = 10; //instance variable of class "BehaviourOfLocalVariableOfMethodInsideLambdaExpression"

	public void test() {
		int y = 20; // Local variable of method m2

		Interf i = () -> {
			System.out.println(x); // Accessing local variable of enclosing method
			System.out.println(y); // Accessing instance variable of enclosing outer class.
			x = 888; //changing the value enclosing class instance variable
			// y = 999;//-->compile time error because local variables are final we can't reassign the value.
		};
		i.method1();
	}

	public static void main(String[] args) {
		BehaviourOfLocalVariableOfMethodInsideLambdaExpression test = new BehaviourOfLocalVariableOfMethodInsideLambdaExpression();
		test.test();
	}
}

interface Interf {
	public void method1();
}
