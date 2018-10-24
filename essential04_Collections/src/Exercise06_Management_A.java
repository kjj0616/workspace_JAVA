import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * ���ڿ� ������ �Ϸ��� ��. (String)
 * 	List�� Map�� ��� ó���Ϸ��� ��.
 */

public class Exercise06_Management_A {
	public static void main(String[] args) {
		Map<String, List<String> > groups = new TreeMap<>();
		List<String> list = new ArrayList<>();
			list.add("����");list.add("����");
		groups.put("��¤����", list);
		
		groups.put("��", new ArrayList<>());
		groups.get("��").add("¡��");
		List<String> got = groups.get("��");
		got.add("Ǫ��");
	//	System.out.println(groups.toString());
		Scanner cin = new Scanner(System.in);
		while(true) {
			System.out.print("SYSTEM> ");
			String cmd = cin.nextLine();
			String[] ar = cmd.split(" ");
			switch(ar[0]) {
			case "��ü":
				if(groups.isEmpty()) {
					System.out.print("��ϵ� �����Ͱ� �����ϴ�.");
					break;
				}else {
					int sum =0;
					for( Entry<String,List<String>> e : groups.entrySet() ) {
						if(e.getValue().isEmpty()) {
							continue;
						}
						System.out.println("# " +e.getKey());
						System.out.println("  �� " +e.getValue());
						sum += e.getValue().size();
					}
					System.out.println("# �� " +sum+"���� �����Ͱ� �������Դϴ�.");
				}
				break;
			case "����":
				if(!groups.isEmpty()) {
					boolean rst = false;
					for(List<String> e : groups.values()) {
						if(e.contains(ar[1])) {
							e.remove(ar[1]);
							rst = true;
							//entry Ȥ�� keyset�� �������� �׷��� ������� ��������
							//���� key�� �𸣸� ������ ����
							break;
						}
					}
					System.out.println("# " + ar[1]+" �����Ͱ� ���� "+(rst ? "����" :"����") + "�Ͽ����ϴ�.");
				}
				break;
			case "Ȯ��":
				if(!groups.isEmpty()) {
					String g = null;
					for( String key : groups.keySet() ) {
						if(groups.get(key).contains(ar[1])) {
							g = key;
							break;
						}
					}
					if(g == null) {
						System.out.println("# " + ar[1]+" �����ʹ� �������� �ʽ��ϴ�.");
					}else {
						System.out.println("# " + ar[1]+" �����ʹ� " + g + " �� ��ϵǾ� �ֽ��ϴ�.");
					}
				}
				break;
			case "����": 
				if(ar.length != 3) {
					System.out.println("# ������ ���� ������ �׷� �����Դϴ�.");
					continue;
				}
				for(List<String> e : groups.values()) {
					if(e.contains(ar[1])) {
						e.remove(ar[1]);
						break;
					}
				}
				if(groups.get(ar[2]) == null)	// if( !groups.containsKey(ar[2]) )
					groups.put(ar[2], new ArrayList<>());
				
				boolean r = groups.get(ar[2]).add(ar[1]);
				System.out.println("# " + ar[1] + " �����Ͱ� " + ar[2] +" �� ����Ǿ����ϴ�.");
				break;
			default :
				System.out.println("# ��밡�ɸ޴��� ����,����,Ȯ��,��ü �Դϴ�.");
			}
			
		}
		/* ����޴�
		 * �Է¹�� ) ���� �̸� �Ҽ� 
		 * �Է� ��)���� ���� ��¤����
		 * 	(��������, �̸��� �����ؾ� ��)
		 *  ���� ¡�� ��¤����  / ������ �� ���ڿ��� ����� List�� ��ϵ��ִٸ� ���� ó��
		 *  (���ο� �׷��� List���� ���� ���ڿ� ����)
		 *  ���� ��ũ�� �����Ӹ�
		 *  
		 * ���� �޴�
		 *  ���� ����
		 *  
		 * Ȯ�� �޴�
		 *  Ȯ�� ¡��  (¡�� ��/�� ��¤���ڷ� ��ϵǾ��ֽ��ϴ�)
		 *   
		 * ��ü
		 *  ��ü   
		 *   ��¤���� 
		 *    .. . . ....
		 *    
		 *   �� ��� �����Ͱ� �����ǰ� �ֽ��ϴ�. 
		 *  
		 *  
		 * 
		 *  
		 */
		
	}
}











