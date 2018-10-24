package java_plus;

import java.util.Calendar;

/*
	1.Calendar
	Calendar Ŭ������ DateŬ����ó�� ��¥�� �ð��� ���� ������ ǥ���� �� ����Ѵ�.
	(Calendar Ŭ������ DateŬ�������� �� ����)
	��Calendar Ŭ������ �߻� Ŭ������ �����ڸ� �������� �ʴ´�.
	 -���� Calendar Ŭ������ ��ü�� �����ϱ� ���� new �����ڸ� ����� �� ����.
	 -�߻� Ŭ�����̹Ƿ� ��ü�� ���� ������ �� ������,
	  getInstance() �޼��带 �̿��Ͽ� �ý����� ��¥�� �ð��� ��ü�� ���� �� �ִ�.
	
	int get(int field)
	  //��¥���� ǥ���� �� �ִ� ���� �� ��������� ����
	  //calendar Ŭ������ ��¥�� �ð� ǥ���� ���� �پ��� ����� �����ϰ� �ִ�.
	
	Calendar class
	1970�� 1�� 1�Ϻ��� Ư�� ������ ������ ���鼭 ��¥�� �ð��� ���� ������ ������ �� �ֵ��� �����Ǵ�
	abstract class �̴�.	
*/
public class Chap12_1_Util_Calendar {
	public static void main(String[] args) {
		/*
		Calendar today = Calendar.getInstance(); // ���� ���ڸ� ����
	//	get(��¥�ʵ�)--�ʵ� ���� int�� �޾ƿ�
	//	Calendar.YEAR.....-��¥�ʵ�(�⵵, ��, ��..)
		
		//��¥
		System.out.println("�⵵"+today.get(Calendar.YEAR));
		System.out.println("��"+today.get(Calendar.MONTH));
		//Calendar.MONTH
		// *���� �� 1 2 3 4 5 6 7 8 9 10 11 12
		// *ǥ�� �� 0 1 2 3 4 5 6 7 8 9  10 11
		
		System.out.println("��"+today.get(Calendar.DATE));
		System.out.println("����"+today.get(Calendar.DAY_OF_WEEK));
		//�̹��� ��� ���° ��
		//Calendar.DAY_OF_WEEK
			// �� �� ȭ �� �� �� ��
			// 1  2  3  4  5  6  7
		System.out.println("���� ���� �ϼ�"+today.get(Calendar.DAY_OF_YEAR));
		
		//�ð�
		System.out.println("12�ð�"+today.get(Calendar.HOUR)); //12�ð�
		System.out.println("24�ð�"+today.get(Calendar.HOUR_OF_DAY)); //24�ð�
		System.out.println("��"+today.get(Calendar.MINUTE));
		System.out.println("��"+today.get(Calendar.SECOND));
		System.out.println("1/1000��"+today.get(Calendar.MILLISECOND));
		System.out.println("am/pm"+today.get(Calendar.AM_PM)); //����=0,����=1
		
		//set(��,��,��)
		//set(��¥�ʵ�,int) - ��¥ ���� ������(���� �ڷ����� ����)
		
		//getTimeInMillis() - ��¥�� �ش��ϴ� long return
		//setTimeInMillis(long) - long�� �μ��� ��¥���·� ���
		//						- ���� 1/1000�� : �Ϸ� 1000*60*69*24
		//						- 1970-1-1�� �������� ��¥ ����
		
	//	System.out.println(myday.before(today)); //myday�� today ��������
	//	System.out.println(myday.after(today));  //myday�� today ��������
		*/
		//=====================================================================
		
		Calendar today = Calendar.getInstance();
		// ������ ��¥, �ð� ���� �޾ƿ´�.
		System.out.println(today);
		Calendar myday = Calendar.getInstance();
		myday.set(1985,3,15); //1985-3-15
		//myday.set(Calenday.YEAR, 2012); //��¥�ʵ�, ��
		
		System.out.println(today.get(Calendar.YEAR));
		myday.get((Calendar.YEAR)+1);
		
		//System.out.println(today-myday); //�ٷ� ��� �Ұ�
		//gettimemillis()
		System.out.println(today.getTimeInMillis());
		long mylong = myday.getTimeInMillis();
		Calendar myday2 = Calendar.getInstance();
		System.out.println("mylong"+mylong);
		myday2.setTimeInMillis(mylong);
		System.out.println("my2�⵵"+myday2.get(Calendar.YEAR));
		long day_between = today.getTimeInMillis() - myday.getTimeInMillis();
		// 1000*60*60*24
		System.out.println("today-myday="+(day_between/(1000*60*60*24)/365));
		// 1970-1-1�� �������� ��¥����
		
		//---------------------------------------------------------------------
		// ��¥
		System.out.println("�⵵ "+today.get(Calendar.YEAR));
		System.out.println("�� "+today.get(Calendar.MONTH));
					//Calendar.MONTH
			// ���� �� 1 2 3 4 5 6 7 8 9 10 11 12
			// ǥ�� �� 0 1 2 3 4 5 6 7 8  9 10 11
		
		System.out.println("�� "+today.get(Calendar.DATE));
		System.out.println("���� "+today.get(Calendar.DAY_OF_WEEK));
		// �̹��� ��� ���° ��
					// Calendar.DAY_OF_WEEK
					// �� �� ȭ �� �� �� ��
					// 1  2  3  4  5  6  7
		System.out.println("���� ���� �ϼ� "+today.get(Calendar.DAY_OF_YEAR));
		
		//---------------------------------------------------------------------
		// �ð�
		System.out.println("12�ð� " + today.get(Calendar.HOUR));
		System.out.println("24�ð� " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� " + today.get(Calendar.MINUTE));
		System.out.println("�� " + today.get(Calendar.SECOND));
		System.out.println("1/1000�� " + today.get(Calendar.MILLISECOND));
		System.out.println("����/���� " + today.get(Calendar.AM_PM)); //����=0,����=1
		
		// ������ �󸶳� ���Ҵ��� ���
		myday.set(Calendar.YEAR, today.get(Calendar.YEAR));
		
		if(today.getTimeInMillis()>myday.getTimeInMillis()) {
			//���� ������ ��������
			myday.set(Calendar.YEAR, today.get(Calendar.YEAR)+1);
			//�����ٸ� ������ �������� �ٲ�
		}
		System.out.println("���� : "+print(today));
		System.out.println("������ ���� : "+print(myday));
		long dday = myday.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("d- "+dday/(1000*60*60*24));
		
	}
	static String print(Calendar cc) {
		return cc.get(Calendar.YEAR)+"-"+(cc.get(Calendar.MONTH)+1)+"-"+cc.get(Calendar.DATE);
	}
}
