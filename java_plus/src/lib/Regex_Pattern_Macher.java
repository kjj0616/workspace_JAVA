package lib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Pattern_Macher {
/*
	�ڹ� ���Խ� �⺻���� : Matcher, Pattern, find(), group()

	���Խ��� ����ϸ� ���ڿ�(String)�� Ư�� ���ϰ� ��ġ�ϴ��� ���θ� Ȯ���ϰų�,
	���Ͽ� �´� ���� ã�Ƴ��ų�, �ش� ���� ���ο� ������ �ٲ� �� �ִ�.

	�� ����� �ϸ�俬�ϰ� �ۼ��Ǿ� �ִ� ���� ������ ������ �ʾұ⿡ ���� �����ؼ� �ẻ��.

	1. matches (��ġ�ϴ��� Ȯ��)

	target �� ����� �Ǵ� ���ڿ�(����)�� ��� �����̰�,
	regEx�� ���Խ�(Regular Expression) �� ��� ������� �غ���.
*/
	public void isEqualRegEx() {
	    String target = "���� 2008�⵵�� �����ߴ�.";
	    String regEx = ".*\\d{1}.*";
	    // String regEx = ".*[0-9].*"; �� ������
	  
	    if (target.matches(regEx)) {
	        System.out.println("��ġ");	   
	    } else {
	        System.out.println("����ġ");
	    }
	}
/*	
	���⼭ regEx �� ".*\\d{1}.*"; �̴�.
	�� ���⼭ target.matches(regEx) �� ���ڰ� 1���� ���ԵǾ� �ִ��İ� ���� ���̴�.
	(".*" �� ��� ������ �����̰�, "\\d{1}"�� �� �ڸ� �����̹Ƿ�.)

	�� ��� 2008, �̷��� ���ڰ� 4���� �����ϱ� �翬�� "��ġ"�� ��µǰ���.
	���� regEx ���� �ٲ�ٸ� ���?

// ".*\\d{1}.*"
	regEx == ".*\\d{1}.*"; // -> ��ġ
	regEx == ".*[0-9].*" ; //-> ��ġ ([0-9]�� \\d{1} �� ��Ȯ�� ���� ����)

	regEx == ".*[0-9][0-9][0-9][0-9].*" -> ��ġ (���� 4�ڸ�)
	regEx == ".*[0-9][0-9][0-9][0-9][0-9].*" -> ����ġ (���� 5�ڸ�)

	regEx == ".*\\d{1,4}.*" -> ��ġ (���� 1�ڸ� �̻� 4�ڸ� ����)
	regEx == ".*\\d{2,5}.*" -> ��ġ (���� 2�ڸ� �̻� 5�ڸ� ����)
	regEx == ".*\\d{5,6}.*" -> ����ġ (���� 5�ڸ� �̻� 6�ڸ� ����)

	�䷱ ������ �ǰڴ�.

	2. replaceAll (���Ͽ� �´� ���� ���ο� ������ ġȯ)
	
*/
	public void replaceRegEx1() {
	    String target = "���� 2008�⵵�� �����ߴ�.";
	    String regEx = "[0-9]";
	    Pattern pat = Pattern.compile(regEx);
	  
	    Matcher m = pat.matcher(target);
	    String result = m.replaceAll("2"); // ���ϰ� ��ġ�� ��� "2"�� ����
	     
	    System.out.println("��� : " + result);
	    // ��� : ���� 2222�⵵�� �����ߴ�.
	}
/*
 	���⼭ regEx ���� ���� "[0-9]" �̴�. �׷��ϱ� �� �ҽ��� 1�ڸ� ���ڵ��� "2"�� ġȯ�ϰ� �ȴ�.
	����� �翬�� "���� 2222�⵵�� �����ߴ�."�� �ȴ�.

	�� �Լ��� 3�ٷ� ���̸� �Ʒ��� ����.
*/
	public void replaceRegEx() {
	    String target = "���� 2008�⵵�� �����ߴ�.";
	    String regEx = "[0-9]";
	    System.out.println("��� : " + target.replaceAll(regEx, "2"));
	}
/*
	String ��ü�� replaceAll ��� ����Լ��� �ִ�. �̰� �� ����.
	���ڴ� Pattern ��ü�� Matcher ��ü�� �߰��� ����Ʈ�ϴµ�, ���ڴ� String ��ü�� ������ �Ǵϱ�.


	3-1. find(), group() (���Ͽ� �´� �� 1���� ã�Ƴ���)

	�� find�� group�̶�� �Լ��� Ư���ѵ� Matcher �� ����Լ���.
	�ϴ� �ܼ������� �ڵ�� �������.
*/
	public void findRegEx(){
	    String target = "���� 2008�⵵�� �����ߴ�.";
	    String regEx = "[0-9]";

	    // ���Խ�(regEx)�� �������� �����,
	    Pattern pat = Pattern.compile(regEx);
	    // ������ Ÿ�� ��Ʈ��(target)�� ��ġ��Ų��.
	    Matcher match = pat.matcher(target);

	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 2
	     
	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 0
	     
	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 0
	     
	    System.out.println(match.find());  // true
	    System.out.println(match.group()); // 8
	     
	    System.out.println(match.find());  // false
	    System.out.println(match.group()); // ���� �߻�! (IllegalStateException)
	}
/*
	Pattern�� compile�� ���Խ�(regEx)�� ���, Matcher�� Ÿ�� ��Ʈ��(target)�� ��°� ������.

	�� ���� Matcher�� find() �Լ��� ���� 1��° ���� ã�Ƴ���, true Ȥ�� false�� ��ȯ�Ѵ�.
	group() �� ���� ��� ã�� 1��° ��Ʈ���� Ƣ��´�.

	�ٽ� find()�� ���� 2��° ���� ã��, group()�� ���� 2��° ���� Ƣ�����... �̷� ���̴�.

	���� 2, 0, 0, 8 ���� �� ���ٰ� (���ڰ� �� �̻� �����Ƿ� �翬��) 5��°���� ������ ���µ�,
	���� ������ ���� �ʵ��� �ڵ带 ���ٸ� �Ʒ��� ���� �ۼ��ؾ� �����ϰڴ�.

	...(����)...

	    if (match.find()) {
	        System.out.println(match.group());
	    }

	...(�ķ�)...


	3-2. find(), group() (���Ͽ� �´� �� ��� ã�Ƴ���)
	3-1���� ������ �ٸ� �� �����Ѱ� �Ʒ� �޼����.

*/
	public void findAllRegEx(){
	    String target = "���� 2008�⵵�� �����ߴ�.";
	    String regEx = "[0-9]";

	    Pattern pat = Pattern.compile(regEx); 
	    Matcher match = pat.matcher(target);
	     
	    int matchCount = 0;
	    while (match.find()) {
	        System.out.println(matchCount + " : " + match.group());
	        matchCount++;
	    }
	    System.out.println("�� ���� : " + matchCount);
	     
	    // 0 : 2
	    // 1 : 0
	    // 2 : 0
	    // 3 : 8
	    // �� ���� : 4
	}

//	���ôٽ��� while���� ����� find()�� false�� �� ������ ������ ������ �ȴ�.


}
