import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ���ڿ� ������ �Ϸ��� ��, {String}
 * 	List�� Map�� ��� ó���Ϸ��� ��
 */
public class Exercise06_Management {
	public static void main(String[] args) {
		Map<String, List<String>> groups = new TreeMap<>();
		
		//-------���� �Է¹��----------------
		List<String> list = new ArrayList<>();
			list.add("����");list.add("����");			
		groups.put("��������",list);
		
		groups.put("��", new ArrayList<>());
		groups.get("��").add("¡��");
		List<String> got = groups.get("��");
		got.add("Ǫ��");
		//-------------------------------------
	//	System.out.println(groups.toString());
		
		Scanner cin = new Scanner(System.in);
		
		while (true) {
			System.out.print("SYSTEM> ");			
			String cmd = cin.nextLine();
			String[] ar = cmd.split(" "); //cmd �Է¹�� ���� - �ϰ�Line��ɾ�imput
			//System.out.println(ar[0]+" / "+ar.length);
			Set<Entry<String, List<String>>> all = groups.entrySet();			

			switch(ar[0]) {
			case "�Է�":
			case "����":
				for (Iterator i = all.iterator(); i.hasNext();) {
					Entry<String, List<String>> e = (Entry<String, List<String>>) i.next();
					
					boolean get = e.getValue().contains(ar[1]); //������ ���翩��
					boolean getkey = e.getKey().equals(ar[2]); // �Է� �׷�� ���Ͽ���
					boolean iskey = groups.containsKey(ar[2]); // �׷� ���翩��
					
					if(get && getkey) {						
						e.getValue().remove(ar[1]);
						groups.get(ar[2]).add(ar[1]);
						System.out.println("SYSTEM> ����ó�� -����");					
					}else if(!get && getkey && iskey) {
						groups.get(ar[2]).add(ar[1]);
						System.out.println("SYSTEM> ����ó�� -�űԵ��");
					}else if(get && !getkey) {
						e.getValue().remove(ar[1]);
						System.out.println("SYSTEM> ����ó�� -��������");
					}else if(!get && !getkey && !iskey) {
						groups.put(ar[2], new ArrayList<>());
						groups.get(ar[2]).add(ar[1]);
						System.out.println("SYSTEM> ����ó�� -�űԱ׷���,�űԵ��");
						break;	
					}
				}						
				break;
			case "����":
				//contains Ȯ��
				//Ȯ���� remove	
				for (Iterator i = all.iterator(); i.hasNext();) {
					Entry<String, List<String>> e = (Entry<String, List<String>>) i.next();
					if(e.getValue().contains(ar[1])) {
						//int idx = e.getValue().indexOf(ar[1]);						
						boolean ok = e.getValue().remove(ar[1]);
						if(ok)
							System.out.println("SYSTEM> "+ar[1]+" ��/�� ���� �����Ͽ����ϴ�..");
						break ;
					}
					if(!i.hasNext()) {
						System.out.println("SYSTEM> "+ar[1]+" ��/�� ã���� �����ϴ�.");
					}
				}
				break;
			
			case "Ȯ��":
				//contains Ȯ��
				//check �׷�
				//��¹� �ۼ�
				for (Iterator i = all.iterator(); i.hasNext();) {
					Entry<String, List<String>> e = (Entry<String, List<String>>) i.next();
					if(e.getValue().contains(ar[1])) {
						//int idx = e.getValue().indexOf(ar[1]);						
						System.out.println("SYSTEM> "+ar[1]+" ��/�� "+e.getKey()+" ����/�� ��ϵǾ��ֽ��ϴ�.");
						break ;
					}
					if(!i.hasNext()) {
						System.out.println("SYSTEM> "+ar[1]+" ��/�� ã���� �����ϴ�.");
					}
				}				
				break;
					
			case "all":
			case "��ü":	
				//entrySet ó��
				//���ο��� ó��
				//��¹� �ۼ�
				int sum = 0;		
				System.out.println("SYSTEM> =======================");
				for (Entry<String, List<String>> a : all) {
					System.out.println("SYSTEM> "+a+"");
					sum += a.getValue().size();
				}				
				System.out.println("SYSTEM> �� �ο��� : "+sum);
				System.out.println("SYSTEM> =======================");				
				break;
			default:
				System.out.println("SYSTEM> Error : ����, ����, Ȯ��, ��ü" );				
			}
		}
		/* <����޴�>
		 *    �Է¹�� : ���� �̸� �Ҽ�
		 * 		     ex) ���� ���� ��������
		 *    (��������, �̸��� �����ؾ� ��)
		 *	 		   ���� ¡�� �������� /
		 * 		 	   ������ �� ���ڿ��� ��򰡿� list�� ��ϵǾ������� ����ó��
		 *    (���ο� �׷��� list�� ���� ���� ���ڿ� ����)
		 *  	     ex) ���� ��ũ�� �����Ӹ�	
		 * 
		 * <�����޴�>
		 *     ���� ���� - ã�Ƽ� ����
		 *  
		 * <Ȯ�θ޴�> 
		 *     Ȯ�� ¡�� : (¡�� ��/�� �������ڷ� ��ϵǾ��ֽ��ϴ�.)
		 * 
		 *   +  <��ü> : ��� �̸� ��� (entrySet�� ������)  
		 * 				+�� �ο��� ���
		 */
	}
}
