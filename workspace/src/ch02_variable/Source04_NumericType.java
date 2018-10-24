package ch02_variable;
class Source04_NumericType {
	public static void main(String[] args) {
		/*
			문자, 문자열, 논리는 무조건 타입이 결정되어있는데,
			수치타입은 종류가 많다. - 정수(4개) / 실수 (2개)
			프로그램이 가동됬을때 사용할 메모리를 최적화 시켜 효율적으로 사용하기 위해서이다.
			
			정수수치 byte 타입은 개당 1byte 를 잡고,
					 short 타입은 개당 2byte를 잡고,
					 int 타입은 개당 4byte를 잡고,
					 long 타입은 개당 8byte를 잡아서 사용한다.

			실수수치 float 타입은 개당 4byte를 잡고,
					 double 타입은 개당 8byte를 잡아서 사용한다.

			얼마만큼 크기를 사용하냐에 따라 차이가 발생한다.

			정수타입이냐 , 실수타입이냐에 따라서 차이는 다르다.
		*/
		/*
			About 정수데이터
			기본정수는 기본이 4byte로 발생하는데, 이걸 수치가 몇이냐에 따라서 할당을 다르게 할수있다.
		*/ 
		byte b1 = 100;  // -128 ~ 127 

		short b2 = 32767; // -32768 ~ 32767 : 65535 16bit+1
		System.out.println(b2);
		b2++;
		System.out.println(b2); // -32768

		int b3 = 2147483647;	// -21억4천 ~ 21억
		System.out.println(0b01111111_11111111_11111111_11111111);

		// 정수데이터 수치가 4byte가지고 처리가 안될때는 수치에 L을 붙이고 만들어야 되는데
		System.out.println(21474836470L);
		long b4 = 21474836470L;
		// L형 정수들은 실제 숫자데이터와 상관없이 무조건 long으로만 저장이 가능하다.
		System.out.println(0L);
		long b5 = 0L;

		/*
			About 실수데이터
			기본실수는 8byte로 발생하는데, 정밀도를 얼마만큼 처리할꺼냐에 따라서 할당을 다르게 할수 있다.

			실수데이터는 0,1로 데이터를 처리하는데, 2진수로 저장되는 형태가 아니다.
			부동소수점 방식으로 데이터를 처리한다.
			9.14 ==> 1001.1110 ==> 1.0011110*e^11
			기본실수 9.14 ==> 1001.1110 ==>1.0011110e^11 ==> 00111100 과 11을
			8byte(64bit)에 분배를 해서 저장한다. 1 + (11bit = 11) + (52bit = 0011110)
			f실수는 4byte : 1+(8bit = 11)+(23bit = 0011110)
		*/

		double e1 = 3.14;
		float e2 = 3.14f; // f를 붙이면 실수를 줄여서 만드는데, 그 데이터를 저장하는게 float 이다.

		System.out.println(3.141592653589793238462643383279502884197169399375105820974944592307);
		System.out.println(3.141592653589793238462643383279502884197169399375105820974944592307f);
		//3.141592653589793
		//3.1415927
		System.out.println(3141592653589793238462643383279502.8);
		System.out.println(3141592653589793238462643383279502.8f);
		//3.141592653589793E33
		//3.1415925E33


	}
}
