package ch01_dataType;
/*
	기본적으로 다뤄야되는 데이터들의 종류는 앞서 본것같이
	수치, 문자, 문자열, 논리 type 데이터들이다.

	이 데이터를 토대로 무엇을 할수 있나?
	데이터 종류마다 할수 있는 작업들이 다르다.
*/


class Source05_DataOperation {
	public static void main(String[] args) 	{
		System.out.println("Hello World!");
		/*
			수치형 데이터는, 산술연산, 비교연산 을 할수 있다.
			# 산술연산 #
			!. 수치가 정수와 실수를 다르게 인식하고 처리가 된다.
			!. 정수수치간에만 연산은 가능, 실수수치간에만 연산이 가능하다.
			!. 정수수치의 산술연산 결과는 무조건 정수수치, 실수수치 연산결과는 무조건 실수
			!. 개별편이를 위해서, 정수+실수간에 연산은 실수연산으로 처리가 된다.
			
		*/
		System.out.println(456+175);
		System.out.println(0b100 * 3);
		System.out.println(94.321 - 3.3);
		System.out.println(41/10);		//정수나누기의 결과는 몫을 의미하게 됨
		System.out.println(41.0/10.0);
		System.out.println(47 % 10);	//mod 연산을 지원하는데 이건 나머지
		System.out.println(47.5 % 10.0);	//실수도 mod 연산이 가능
		System.out.println(41 / 10.0);	// 실수처리연산

		//----------------------------------------------------------------------
		// 반지름 5짜리 구의 부피를 계산	4/3 * 파이 * * 반지름 3제곱
		// 구의부피 4/3pr^3
		System.out.println(4/3 * 3.14 * 5 * 5 * 5); // (4/3 => 1)   392.5
		System.out.println(4.0/3 * 3.14 *5 *5 *5);  // (4.0/3 =>1.333) 523.3
	}
}
