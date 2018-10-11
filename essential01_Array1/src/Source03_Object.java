/*
 *  java.lang.Object ��ü��?
 *  	Ư���� extends�� �������� ������ �ڵ����� �����ǰ� �Ǿ� �ִ�.
 *  
 *  �ڹٿ��� ���Ǵ� ��� ��ü���� ������ �������̴�, ���������δ� ������ �ǰ� ���ִ�.
 *  
 *  java.lang.Object ���� ����� ��ɵ��� ������ ������ �ۿ� ����.
 */
class Sword{ //[extends Object]
	int atk;
	
	Sword(){
		super(); // �Ѵܰ� �� ��ü�� ������ ȣ���� ���� ���
		atk = 30;
	}
	
	boolean enchant() {
		if(Math.random()>0.8) {
			atk += 5;
			return true;
		}else {
			return false;
		}
	}
	//������ public --> public, �ʼ��� �ƴϳ� �صθ� ������
	public String toString() {
		return "Sword[ATK="+atk+"]";
	}
}


//--------------------------------------------------------------
public class Source03_Object {
	public static void main(String[] args) {
		Sword s = new Sword();
		boolean b = s.enchant();	//�����Ҷ� �����а� �̰�
		System.out.println("b.. "+b);
		System.out.println(s.atk);
		
		String str = s.toString(); 		//�ȸ���� ������?
		System.out.println("str = "+str);
		int c = s.hashCode();		//�� �ִ°���?
		System.out.println("c = "+c);
		Sword s2 = s;
		System.out.println("equals? "+s.equals(s2)); //�̰� �� ����?
		
		/*
		 * ��ü��� ��¿������ �����ԵǴ� Object�� ���� �����
		 * ��ü ���� ���缭 �� ������ �ص־ߵǴ°� �ƴ�����, �صδ� ���� ����.
		 * 
		 *  1. public String toString()
		 *    - ��ü ���¸� ���ڿ��� ���Ͻ�Ű�� �缳��(�������̵�)
		 *    - (default)��ü��@��ü�ؽ��ڵ�16�� �� ���� ��������� ������
		 *    
		 *     public String toString() {
        		return getClass().getName() + "@" + Integer.toHexString(hashCode());
       			}
		 */
		
		Object ob = new Sword();	// �ǰ�ü�� Object�� �޾Ƽ� �����ϸ�
		// ob.enchant();	//�̷��� ������ ��ü�� �����ϸ鼭 ����� ���� �ȵ�����
		String obs = ob.toString(); // ���� �ִ°� ���� �ǰ�, �װ� �����Ǿ��־��ٸ�?
		System.out.println(obs);
		//�� ������ ����Ǽ�, System.out.println �̳�, �׿� ������ ����� ��ü����
		
		Sword s3 = new Sword();
		System.out.println(s3);		//��ü ���� �ڵ����� ���̵Ǽ� ���Ǵ� ��Ȳ�� �ִ�.
		
		System.out.println(); //��ü���� ����Ϸ��Ҷ� toString������ �޾Ƽ� ������
		
		/*
		 *  b.. false
			30
			str = Sword@6d06d69c //
			c = 1829164700
			equals? true
			
			
			b.. false
			30
			str = Sword[ATK=30]  //
			c = 1829164700
			equals? true
			
		 */	

	}
	

	
}
