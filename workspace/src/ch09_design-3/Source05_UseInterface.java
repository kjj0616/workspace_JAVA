/*
class GameEngine extends Engine {  }
	- extends �� ����� interface��, �� ū interface Ȯ���� �ϰڴٴ� �Ҹ�
*/
import javax.swing.JOptionPane;

interface SuperEngine extends Engine{
	boolean boost();
}
/*
	Interface �� ���� class�� �����ϰ� ������ extends �� �ƴ϶� implments ��°� ��� �Ѵ�.

	������ �԰ݼ��� ����

	<->abstract
	
	interface��  abstract �����ϳ� abstract�� interface�� �Ұ����ϴ�.

	interface�� default�� public���� �����Ǿ��ִ�.
	(���� public�� �����Ǿ��ִ� ���̴�.)

	-->����
	 interface�� �޾Ƽ� ����� �� ����
	 public���� �����ؾ߸� ������ �����ϴ�.
*/
class GameEngine implements Engine{
	int cnt, target, min, max;
	boolean flag;
	
	public void init(){
		cnt = 0;
		target = (int)(1+Math.random()*200);
		min = 1;
		max = 200;
		flag = true;
		JOptionPane.showMessageDialog(null,"[SYSTEM] UpDownEngine STARTED");
	}

	public boolean isRun(){
		if(cnt<10 && flag)
			return true;
		else
			return false;
	}

	int recommend(){
		int result = (int)(min+Math.random()*(max-min+1));
		return result;
	}
	String tell(){
		return "tried = "+cnt+" min = "+min+" max = "+max;
	}

	public String execute(){
		String o = this.tell();
		return o;
	}
	public String check(String in){
		cnt++;
		int data;
		/*
		switch(in){
		case "":
			data = this.recommend();
		default:
			data = Integer.valueOf(in);
		}
		*/
		data = Integer.valueOf(in);
		String returnValue = "";
		if (data == target){
			flag = false;
			returnValue = "CORRECT";
		}else if (data > target){
			max = data > max ? max : data;
			if (data - target >50){
				returnValue = "TOO HIGH";
			}else{
				returnValue ="HIGH";
			}
		}else if (data < target){
			min = data > min ? data : min;
			if (target - data >50){
				returnValue = "TOO LOW";
			}else{
				returnValue = "LOW";
			}
		}
		return returnValue;
	}	
}

class Source05_UseInterface {
	public static void main(String[] args)	{
		OptionPanePlayer opp = new OptionPanePlayer();
		Engine e = new GameEngine();
		opp.insert(e);
		opp.start();
		opp.remove();


	}
}
