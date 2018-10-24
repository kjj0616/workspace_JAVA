import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class DataManagement{
	Map<String, List<String> > groups;
	
	public DataManagement() {
		//--------init data Setting-----------
		groups = new TreeMap<>();
		List<String> list = new ArrayList<>();
			list.add("����");
			list.add("����");
		groups.put("��¤����", list);	
		groups.put("��", new ArrayList<>());
		groups.get("��").add("¡��");
		
		List<String> got = groups.get("��");
		got.add("Ǫ��");
		//------------------------------------
	}
	
	public DataManagement(File path) {
		//-------Load data Setting------------
		//------------------------------------
	}
	
	// �׷�, ������, value
	void save(DataManagement a) {

	}

}

public class Management {
	DataManagement a;
	boolean isRun = false;
	File root = new File(System.getProperty("user.home"));
	File path = new File(root, "Management\\list.sav");
	public Management() {
		if (path.exists()) {
			a = new DataManagement(path);
			
		} else if(path.getParentFile().exists() & !path.exists()){
			//������,������ , new save���ϻ���			
		} else {
			a = new DataManagement();
			//���� ����, save����
			try {
				File t = new File(root, "Management");
				if(t.mkdirs()) {
					boolean r = path.createNewFile();
				}
			} catch (IOException e) {
				System.out.println("���ϻ�������");
			}
			
		}
	}
	
	void start() {
		Scanner cin = new Scanner(System.in);
		isRun = true;
		while(isRun) {
			System.out.print("SYSTEM> ");
			String cmd = cin.nextLine();
			String[] ar = cmd.split(" ");
			switch(ar[0]) {
			case "��ü":
				if(a.groups.isEmpty()) {
					System.out.print("��ϵ� �����Ͱ� �����ϴ�.");
					break;
				}else {
					int sum =0;
					for( Entry<String,List<String>> e : a.groups.entrySet() ) {
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
				if(!a.groups.isEmpty()) {
					boolean rst = false;
					for(List<String> e : a.groups.values()) {
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
				if(!a.groups.isEmpty()) {
					String g = null;
					for( String key : a.groups.keySet() ) {
						if(a.groups.get(key).contains(ar[1])) {
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
				for(List<String> e : a.groups.values()) {
					if(e.contains(ar[1])) {
						e.remove(ar[1]);
						break;
					}
				}
				if(a.groups.get(ar[2]) == null)	// if( !groups.containsKey(ar[2]) )
					a.groups.put(ar[2], new ArrayList<>());
				
				boolean r = a.groups.get(ar[2]).add(ar[1]);
				System.out.println("# " + ar[1] + " �����Ͱ� " + ar[2] +" �� ����Ǿ����ϴ�.");
				break;
			case "���":				
				a.save(a);
				break;
			case "����":
				isRun = false;
				break;
			default :
				System.out.println("# ��밡�ɸ޴��� [����, ����, Ȯ��, ��ü, ���, ����] �Դϴ�.");
			}
			
		}
	}

}











