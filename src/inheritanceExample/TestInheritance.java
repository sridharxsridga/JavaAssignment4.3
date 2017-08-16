/*


Select the one correct answer.
a. test();
b. super.test();
c. super.super.test();
d. ::test();
e. C.test();
f. It is not possible to invoke test() method defined in C from a method in A.


Answer : f , It is not possible to invoke test() method defined in C from a method in A.

But if we want to really achieve it , we can use super.test() in the test method of B.


*/


package inheritanceExample;

public class TestInheritance {

	public static void main(String[] args) {
		A a = new A();
		a.test();   // this would invoke test method of class A 

	}

}
