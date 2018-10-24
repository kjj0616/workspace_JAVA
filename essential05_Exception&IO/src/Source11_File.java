/*
 * ���� FileInputStream, FileOutputStream ��ü�� �̿��ؼ�, (inout���� : ���α׷�����)
 * ���Ͻý��۳��� �����ϴ� ������ ������� ������� �����غ��Ҵ�.
 *  (�ǹ��ִ� ������ ������� ���� �����ϴ� DataInput,OutputStream����)
 * 
 * ��ü������ �ϸ鼭, ���ڿ��� ����� ����������, ���������δ� File ��ü�� �ٲ�� �ȴ�.
 * ������ ���α׷����� ��� �س����� ���ؼ� Ȥ�� �� �� ������ �����������
 * �ϱ� ���ؼ�, �� ��ü ������ ������ �ʿ䰡 �ִ�.
 * 
 * File ��ü�� �ý��ۻ� �����ϴ� ���͸�, ������ �����ϱ� ���� ��ü
 */
import java.io.File;
import java.util.Iterator;
public class Source11_File {
	public static void main(String[] args) {
		//���� ��ü�� �����ϴ� ����� ũ�� 3���� ���°� ����
		
		// String���� ��� ���� 
		// ( ������ �� �����ϰ�, ����ε� ������, �����̳� ���͸� ������ �ִ�. )
		System.out.println(System.getProperty("user.home")); //Ȩ���͸� ���
		System.out.println(System.getProperty("user.name")); //������ ���
		
		File home = new File(System.getProperty("user.home"));
		
		File[] ar = new File[] { // ������ / �����
				new File("c:\\workspace"),
				new File("c:\\workspace\\.gitignore"),
				new File("bin"),
				new File(".classpath"),
				new File("Intro.dat"),
				new File("c:\\workspace", "workspace_java"), // ������(�Ҽ�) + ���ϸ�(������)
				new File(home, "Desktop") 					 // �Ҽ�(������ü) + �̸�
		};
		
		// .exists() , isDirectory() , isFile()
		// .getAbsolutePath()-������ , .getPath()-�����Ǿ��ִ°��
		// String.getAbsolutePath()
		
		for (int i = 0; i < ar.length; i++) {
			File t = ar[i];
			System.out.println(t.exists() + "? "+t.isDirectory()+" / "+ t.isFile());
			System.out.println(t.getAbsolutePath() + " vs "+t.getPath()); // String.getAbsolutePath()
			String name = t.getName();
			String parent = t.getParent(); // �θ�(�Ҽ�) , ����� ������ parent = null;
			long len = t.length();		   // File �̶�� ���� ũ�� ��ȯ(���� byte),
										   // directory ��� �ǹ� ���� ������	
			if(t.isDirectory()) {
				String[] li = t.list();
				System.out.println("li = "+li.length); // ���͸� ���� �����ϴ°͵��� ����, DIR �ƴϸ� ����
				for (String m : li) {
					File child = new File(t, m);
					System.out.println("       "+m+ (child.isDirectory() ? "    DIR" : "    FILE"));
				}
			}
			System.out.println("name = "+name);
			System.out.println("parent = "+parent);
			System.out.println("len = "+len);
			
			System.out.println();
			System.out.println();
		}
		
		//=====================================================================
		// �ý��� ���� ����Ȯ�� �� tip
		File target = new File(home, ".p2");
		System.out.println(target.isDirectory());
		String p = target.getParent();
		System.out.println(p);
		
		File fp = target.getParentFile(); // �ٷ� ���ܰ踦 ���ϰ�ü��
		System.out.println(home.equals(fp) + ", "+(home==fp));
		//equals�� ó���Ǿ��־ true, ���� ��ü�� �ƴ�
		
		String[] c = target.list();		
		File[] fc = target.listFiles();	  // ���� ��ü���� ���ϰ�ü��
		for (File t : fc) {
			System.out.println(t.getAbsolutePath()+", "+t.getName()+", "+t.getParent());
		}		
		
	}
}

/*
C:\Users\kgitbank
kgitbank
true? true / false
c:\workspace vs c:\workspace
li = 16
       .git    DIR
       .gitignore    FILE
       .metadata    DIR
       .recommenders    DIR
       a    DIR
       essential01_Array1    DIR
       essential02_String    DIR
       essential03_Wrapper    DIR
       essential04_Collections    DIR
       essential05_Exception&IO    DIR
       essentialAll.zip    FILE
       IndiaEngine.java    FILE
       special01_GUI    DIR
       special01_GUI_A    DIR
       workspace_editplus    DIR
       workspace_java    DIR
name = workspace
parent = c:\
len = 12288


true? false / true
c:\workspace\.gitignore vs c:\workspace\.gitignore
name = .gitignore
parent = c:\workspace
len = 28


true? true / false
C:\workspace\essential05_Exception&IO\bin vs bin
li = 18
       Account.class    FILE
       CriticalException.class    FILE
       CustomScanner.class    FILE
       Exercise01_NoDataInOut.class    FILE
       InvalidException.class    FILE
       NonTriangleException.class    FILE
       Source01_Exception.class    FILE
       Source02_Exception.class    FILE
       Source03_Exception.class    FILE
       Source04_Exception.class    FILE
       Source05_Exception.class    FILE
       Source06_Exception.class    FILE
       Source07_Output.class    FILE
       Source08_DataOutput.class    FILE
       Source09_Input.class    FILE
       Source10_DataInput.class    FILE
       Source11_File.class    FILE
       Triangle.class    FILE
name = bin
parent = null
len = 8192


true? false / true
C:\workspace\essential05_Exception&IO\.classpath vs .classpath
name = .classpath
parent = null
len = 301


false? false / false
C:\workspace\essential05_Exception&IO\Intro.dat vs Intro.dat
name = Intro.dat
parent = null
len = 0


true? true / false
c:\workspace\workspace_java vs c:\workspace\workspace_java
li = 1
       essential01    DIR
name = workspace_java
parent = c:\workspace
len = 0


true? true / false
C:\Users\kgitbank\Desktop vs C:\Users\kgitbank\Desktop
li = 7
       desktop.ini    FILE
       dev(192.168.10.27).lnk    FILE
       eclipse F.lnk    FILE
       Eclipse Java 2018-09.lnk    FILE
       EditPlus.lnk    FILE
       Git GUI.lnk    FILE
       share(192.168.10.27).lnk    FILE
name = Desktop
parent = C:\Users\kgitbank
len = 4096


true
C:\Users\kgitbank
true, false
C:\Users\kgitbank\.p2\org.eclipse.equinox.p2.core, org.eclipse.equinox.p2.core, C:\Users\kgitbank\.p2
C:\Users\kgitbank\.p2\org.eclipse.equinox.p2.engine, org.eclipse.equinox.p2.engine, C:\Users\kgitbank\.p2
C:\Users\kgitbank\.p2\org.eclipse.equinox.p2.repository, org.eclipse.equinox.p2.repository, C:\Users\kgitbank\.p2
C:\Users\kgitbank\.p2\pool, pool, C:\Users\kgitbank\.p2
C:\Users\kgitbank\.p2\pools.info, pools.info, C:\Users\kgitbank\.p2
C:\Users\kgitbank\.p2\profiles.info, profiles.info, C:\Users\kgitbank\.p2

*/