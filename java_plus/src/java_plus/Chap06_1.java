package java_plus;

public class Chap06_1 {
	/*
	1. 1���� �迭
	 1) �迭 : ���� �ڷ������� ������� ����
	 2) �������� : �ڷ���[] ������;
	 3) ������ = new �ڷ���[����]; //���Ұ� ������ŭ ������ �����Ҵ�
	 4) ȣ�� : ������[���ҹ�ȣ]
	 5) �迭���Ұ��� : �迭��.length -> �ɹ�����
	 6) for()���� ���� ��밡�� --> �迭���ҹ�ȣ�� ���������� ����Ǳ� ���� 
	 
	*/
	public static void main(String[] args) {
		/**
		 * @param args
		 */
		int [] arr = {23,56,12,78,98,43,21};
		//�迭�� ����
		//�ڷ��� [] �迭�� = {����0,����1,...};
		
		System.out.println(arr); // �迭���� ȣ���� ��� �޸� �ּ�(��ü��)�� ȣ��ȴ�
		
		System.out.println(arr[0]);
		//���Ҹ� ȣ���� ��� -> �迭��[���ҹ�ȣ]
		
		for (int i = 0; i < 4; i++) {
			System.out.println("arr ���� "+i+" ��° ��: "+arr[i]);			
		}
		//int last = arr.length; //�迭�� ���Ұ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i !=(arr.length-1))
				System.out.print(", ");
		}
		System.out.println();
		
		int[] arr2 = new int[5]; // int������ 5���� ���ҷ� �޵��� �޸��Ҵ�
				//�����Ҵ�
		
		//arr2 ={67,78,89,123,456};
		//�����߻� --> �迭�� ����ÿ� ũ�⸦ �˷���� �Ѵ�.
		
		arr2[0]=89;
		
		int[] arr3 = arr; //shallow copy (��������) --> �ּҺ���
		
		int[] arr4 = new int[arr.length];
		
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] =arr[i];	//deep copy --> ���� �� ����
		}
		arr3[5] = 78;
		System.out.println("arr4[5] : "+arr4[5]);
		System.out.println("arr3[5] : "+arr3[5]);
		System.out.println("arr[5] : "+arr[5]);
		
	}
}