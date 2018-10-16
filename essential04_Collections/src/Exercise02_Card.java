import java.util.Set;
import java.util.TreeSet;

/*
 * �� ��ü�� ���߿� TreeSet���� ��ü������ �ؼ�
 *  ũ������� ��ü���� Ȯ���ϰ� �Ϸ���,
 *  �ٸ� ��ü�� ��������, �� ��ü�� ū��,�������� �����ؼ�
 *  ���Ͻ�Ű�� �ȴ�.
 *  
 *  ##########################################################
 *  
 *  �� TreeSet�� hashCode(), equals()�� ������� �ʴ´�.
 *  
 *  �� ���� ó�� ���� : TreeSet 
 *  
 *  1. implements Comparable<E> �� �����ϰ�
 *       
 *  2. add unimplements method<E>
 *  	@Override
 *		public int compareTo(E e) {
 *		
 *		return 0;
 *	------------------------------->
 *		@Override
 *		public int compareTo(E e) {
 *	}
 *   ##########################################################
 *
 */

class Card implements Comparable<Card> {
						//���׸������� ������������ �񱳰���, �Ⱥ��̸� Object
	static String[] mode;
	static {
		mode = new String[] {"��Ŀ","����","����","������"};
	}
	
	String name;
	int type;
	
	public Card(String n, int t) {
		name = n;
		type = t;
	}
	
	@Override
	public int compareTo(Card o) {
		// this - other ��������� ����� ��ġ�� return ��Ű�� �ȴ�.
		// ������� ������ ���Ͻ�Ű�� this�� ���� ��Ȳ�̰�,
		// ����� ���Ͻ�Ű�� this�� �� ū ��Ȳ��
		// 0�� ���Ͻ�Ű�� this�� other�� ���� ũ���� ��ź�� �Ͼ��.
		//System.out.println("compareTo() called");
		/*
		if(type == o.type) {
			int c = name.comapreTo(o.name);
			return c==0 ? 0 : (c<0 ? -1 : 1);
		}else {
			if(type< o.type)
				return -1;
			else
				return 1;
		}
		*/
		
		//�̸��� �������� ������ ���� ��ü, �̸��� ���ٸ� type�� ���� �ְ� ������ü
		//�̸��� ����, Ÿ�Ե� ������ ���� ũ��� ó���ǰ� compareTo�� ����
		
		/* //--------------------------���� var------------------------
		if(name.compareTo(o.name)<0) {
			return -1;			
		}else if(name.compareTo(o.name)>0){
			return 1;
		}else {			
//			if(type< o.type)
//				return -1;
//			else if(type>o.type)
//				return 1;
//			else
//				return 0;			
			return type==o.type ? 0 : (type<o.type ? -1 : 1 );
		}
		*/ //--------------------------��� var------------------------
		int compare = name.compareTo(o.name);
		return (compare==0) ? (type - o.type) : (compare<0 ? -1 : 1);
		
		/* ------------------------teacher A------------------------
		int c= name.comapreTo(o.name);
		if(c<0)
			return -1;
		else if(c> 0)
			return 1;
		else{
			return type==o.type ? 0 : (type<o.type ? -1 : 1);
		}
		--------------------------------------------------------------
		*/
	}
		
	@Override
	public String toString() {
		return "{"+name+" ("+mode[type] +")}";
	}
	
	@Override
	public int hashCode() {
		int a = 0;
		for (int i = 0; i < CardShop.name.length; i++) {
			if(CardShop.name[i].equals(name)) {
				a = i+1;
			}
		}
		return (a*a+1)*3+(type*type)*3;
		//String�� ��� �����ϸ� �� ������?
		
		//teachers A
		//return name.hashCode() * type;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Card) {
			Card other = (Card)obj;
			return other.mode[type].equals(this.mode[type]) && other.name.equals(this.name) ;
			//return name.equals(o.name) && type==other.type; //�� ����
		}else {
			return false;
		}	
	}


}
//----------------------------------------------------------------------------------
class CardShop{
	static String[] name = "����,����,����,���,���".split(",");
	static Card random() {		
		Card t = new Card(name[(int)(Math.random()*5)], (int)(Math.random()*4));		
		return t;
	}
}
//----------------------------------------------------------------------------------
public class Exercise02_Card {
	public static void main(String[] args) {
		Set<Card> cards = new TreeSet<>();	//ctrl+shift+O	
							//hashSet -> TreeSet
		System.out.println("7���� ī�� �̱�! ����!! ");
		for (int cnt = 1; cnt <=7; cnt++) {
			Card t = CardShop.random();
			String result = cnt+"'s pick = "+t.toString();
			if( !cards.contains(t) ) {
				result += " NEW!";
			}
			System.out.println(result);
			//System.out.println(t.toString()+", hashCode= "+t.hashCode());
			System.out.println();
			cards.add(t);
		}
		//System.out.println(cards.size());
		System.out.println(cards.size()+"");
		for (Card card : cards) {
			System.out.println("-->"+ card);
		}
	}
}
