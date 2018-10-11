package model;

public class IdiomTest {
	public static void main(String[] args) {
		String a = "���õ��";
		String h = "����� ��� ���� ������ ����";

		Idiom i = new Idiom(a, h);
		System.out.println(i.mixChars()); // õ�ݻ�⼼��
		System.out.println(i.toString()); // ����� ��� ���� ������ ���� : ��???

		boolean b = i.mark("��ݱ�õ");
		System.out.println(b); // false;

		boolean bb = i.mark("���õ��");
		System.out.println(bb);// true;
		
		//==========================================================================
		String[] ws = new String[] {"�����ֱ�","���񳭸�","��ź����","�ǹ�����"};
		String[] hs = new String[] {
				"������ Ȥ���ϰ� ¡���ϰ� ������ ������ �䱸��",
				"���� ������ ���� ���� ������ ���� �繫�� �������� ����",
				"�޸� ��Ű�� ���� ��´ٴ� ��",
				"������ ���� ���� ���� ����� ����"
		};
		
		//�ǵ��� �̰ɷ� ����
		String[][] datas = new String[][] {
			new String[]{"�����ֱ�","���񳭸�","��ź����","�ǹ�����"},
			new String[]{"������ Ȥ���ϰ� ¡���ϰ� ������ ������ �䱸��",
						 "���� ������ ���� ���� ������ ���� �繫�� �������� ����",
						 "�޸� ��Ű�� ���� ��´ٴ� ��",
						 "������ ���� ���� ���� ����� ����"
			}
		};
		//==========================================================================
		/*
		Idiom id = new Idiom(datas);
		System.out.println(id.mixChars());
		System.out.println(id.toString());
		*/
		Idiom[] ids = new Idiom[4];
		for (int j = 0; j < ids.length; j++) {
			// [0][0],[1][0],   / [0][1], [1][1]  
			ids[j] = new Idiom(datas[0][j], datas[1][j]);
		}
		
		
		//==========================================================================
		// �� String[] �� �迭�� �̿��ؼ�, input[]�� �����
		// ���� ���ڼ��� ���߱� ���α׷����� ����
		Idiom p = ids[(int)(Math.random()*ids.length)];
		System.out.println(p);
	}
}
