
public class Source08_Array {
	public static void main(String[] args) {
		/*
		 * �̸� �����͸� �����صΰ� �迭�� �����..
		 */
		String[] mode = new String[] {"��","��","��"};
		
		for(int i=1;i<=5;i++) {
			int auto =(int)(Math.random()*3);
			System.out.println(auto + " / "+mode[auto]);
		}
		
		String[] first = new String[] {"��","��","��","��","��","��","��","��","��","��"};
		String[] last = new String[] {"����","����","����","�÷�","����","�Ͽ�","����","����","����","����"};
		
		int fidx =(int)(Math.random()*first.length);
		int lidx =(int)(Math.random()*last.length);
		
		String name = first[fidx]+last[lidx];
		System.out.println("����� �̹����� ["+name+"] ���� ��Ե˴ϴ�.");
		
	}
}
