import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Item implements Serializable{
	String name;
	Item(String name){
		this.name = name;
	}
}

class User implements Serializable {
	String nick;
	int exp;
	int money;
	List<Item> li;

	User(String nick) {
		this.nick = nick;
		exp = 0;
		money = 500;
		li = new ArrayList<>();
	}

	void goHunt() {
		exp += (int) (Math.random() * 20);
		money += (1 + (int) (Math.random() * 10)) * 100; // 100~1000��?
		li.add(new Item("����"));
	}
	// public String toString() .. User ���� ������� �ٲ��ֽð�

	@Override
	public String toString() {
		return "�̸� : " + nick + "\n����ġ : " + exp + "\n�ݾ� : " + money + "\n";
	}
}

public class Source15_Serializable {
	public static void main(String[] args) {
		User u = new User("v������v");
		System.out.println(u.toString());
		for (int cnt = 1; cnt <= 5; cnt++) {
			u.goHunt();
		}
		System.out.println(u.toString());

		// ------���
		/*
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;

		try {
			File n = new File(u.nick);
			out = new FileOutputStream(n);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			oout.writeObject(u);
			oout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		// �� User�� ObjectOutput���� ���
		// NotSerializableException �� �߻��ϸ鼭 ��� ���а� �㲨�� (Ȯ�θ�)
		
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(new FileOutputStream(u.nick))) {
			System.out.print("output try..");
			oos.writeObject(u);
			System.out.println("success!");
		} catch (IOException e) {
			System.out.println("failed.."+e.toString());
		}
		/* ############## ����ȭ / ������ȭ -- Serializable ##############
		 * ��� ��ü�� Object InOut �Ǵ°� �ƴϴ�.
		 * 					(TreeSet�� ��ü �����Ҷ��� ����...)
		 * byte(����)ȭ ��ų�� �ִ� ��ü�鿡 ���ؼ��� �����ϴ�. (����ȭ ������ ��ü)
		 * 
		 *  Comparable �ٿ��� �����ߴ��� ���� ������ �۾��� �ʿ��Ѱ� �ƴϰ�,
		 *  implements Serializable �� �����صθ� �ȴ�.
		 *  
		 *  ��, ����ϰ��� �ϴ� ��ü�� Serializable �̾ �� �ȿ� ������ �����͵���
		 *   Serializable�� �ƴϸ� ���а� ���. (�ٸ���ü�� ������ ����Ҷ��� �������)
		 *   List�� Serializable ������ String �� �ƴ� Item��ü�� ��쿡�� Serializable�ƴ϶�..
		 *  ��� ������Ҹ� Serializable �� ��Ȳ���� ������ ����
		 */
		
		
		// ------�Է�
		/*
		FileInputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		User nu = null;

		try {
			in = new FileInputStream(new File("������.sav"));
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			nu = (User) oin.readObject();
			oin.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("load file data = \n" + nu.toString());
		*/
	}
}
