/*
	프로그램의 기본적인 흐름
	사용자로부터 프로그램을 기동시키는데 있어서 필요한 데이터를 확보해서
	그 데이터를 목적에 맞게 처리 후
	그걸 사용자가 볼수 있게 결과물을 보여주는게 기본 흐름

	이걸 순서대로 익히는게 가장 좋긴 하지만, 데이터를 확보하는 작업이
	처리할수 있는 데이터가 어떤것들이 있는지 모르면 할수가 없다.
	[자료형 공부]

	어떤 데이터들을 다룰수 있는지 부터 살펴보자.
*/

class Source04_Data{
	public static void main(String[] args){
		System.out.println("Hello World");
		/*
			데이터의 종류는 크게 두가지이다.
			기본형(primitive)데이터 / 참조형(reference) 데이터
			참조형 데이터의 경우는 기본형 데이터를 바탕으로 만들어지는거기 때문에
			지금은 기본형부터 살펴보자.

			기본형(원시형/primitive type) 데이터는 작성하는 것 만으로도 
			프로그램에서 인식되는 데이터들을 말한다.

			수치, 문자, 문자열, 논리 데이터가 이에 해당한다.
		*/	
		System.out.println(41241);	//수치(정수);
		System.out.println(3.141592);	 //수치(실수);
		System.out.println('A');	 //문자
		System.out.println("자바 개발자 과정"); //문자열(문자 집합)
		System.out.println(true);	//논리
		System.out.println(false);	//논리

		// 수치데이터에 한해서는 표기할수 있는 방법이 다양하다.
		// 정수수치같은 경우
		System.out.println(1_944_1111); //언더바(_)로 표기가능
		System.out.println(100); //기본 10진수
		System.out.println(0b100); //0b 2진수
		System.out.println(0100); //0 8진수
		System.out.println(0x100); //0x 16진수
		System.out.println(0b1111_1111); // ??
		// # ※ 출력이나 사용은 10진수로 출력된다
		// # 실수수치 #
		System.out.println(132.11334);	  
		System.out.println(1.3211334e2);  //지수표기

		// 문자 데이터는 다른방식으로도 표기할수 있다.
		System.out.println('\uAD7F'); // 굳
		System.out.println("\uB098 이 \uC2A4"); //나 이 스
		// 프로그램에서 문자는 숫자값으로 관리학[ 된다. -> 자바 기준 유니코드 사용함
		//-->한글 유니코드 할당번호 사용 : \u + 16진 유니코드

		// 전세계의 문자들을 컴퓨터에서 인식시키기 위해서
		// 제정된 숫자표 {1~65535} 까지가 붕되었음
		// 문자를 이 수치를 이용해서 이걸 이용해서 설정해도 같게 처리함

	}
}