/*
	extends 를 이용한 설계시 주의, 알아둘 것들

	1. extends 의 대상 (상위, 부모, 슈퍼, 원본 타입)은 접근이 되고,
	 대상이 extends를 허용해두었어야만 가능하다.
		final - extends 불가능하다

	2. extends 를 통해 설계되는 객체는 원본(부모)의 모든요소에 access 되지는 않는다.
	 access 단계에 따라 접근이 안되는 것들이 있을수도 있다.

	3. super 키워드를 이용해서, 

*/
package design;

// public final class Box {	// --> extends 불가능
public class Box {		
	int data;
	protected boolean flag;
	public String rate;
	
	/*
		기본생성자없이
		매개변수가 들어간 생성자만 존재한다면
		상속받은 객체를 생성할때 오류가 발생함		
	*/

	public Box(){ //기본생성자 
		System.out.println("box instance created!");
								//객체==인스턴스 (new해서 만든 객체들)
	}

	public String inform(){
		return data+", "+flag+", "+rate;
	}
/*
protected 접근 제한자.

protected는 상속과 관련된 접근 제한자.
같은 패키지에서는 접근 제한이 없지만, 다른 패키지에서는 자식 클래스만 접근을 허용함.

다른 패키지의 자식 클래스에서 부모 클래스의 생성자를 호출할 때, 
new로 직접 호출 할 수는 없고, super()로 생성자를 호출 할 수 있다.

* 부모 클래스의 패키지.클래스를 import해야 함.
*/
}
