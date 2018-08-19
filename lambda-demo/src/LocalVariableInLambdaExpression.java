
interface Interf {
	public void method1();
}

/**
 * The local variables referenced from lambda expression are implicitly final
 * and hence we can’t perform re-assignment for those local variables otherwise
 * we get compile time error.
 * If we uncomment line 26 then we will get compile time error.
 * 
 * @author Abhijit Thorat
 *
 */
public class LocalVariableInLambdaExpression {

	int x = 10; // instance variable

	public void m2() {
		int y = 20; // Local variable

		Interf i = () -> {
			System.out.println(x);
			System.out.println(y);
			x = 888;
			// y = 999;//-->compile time error
		};
		i.method1();
	}

	public static void main(String[] args) {

		LocalVariableInLambdaExpression test = new LocalVariableInLambdaExpression();
		test.m2();
	}

}
