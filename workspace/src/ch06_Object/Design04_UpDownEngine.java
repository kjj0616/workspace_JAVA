package ch06_Object;
/*
	procedure �� �̿��� UpDown Game�� �����غ��Ҵµ�,
	������ ������ ó���� ���� ���ϰ� �ϱ� ���ؼ� UpDownEngine ��ü�� �����غ���
	�װ� ���� �ѹ� �� 1�ο�, �������� ������. [���� GUI ���濹���̹Ƿ� - ����� main���� �� �Ұ���]
*/
class UpDownEngine {
	// storage
	int target; // ����
	int min, max; // ������ �ּҰ��� �ִ밪 (����)
	int tried;	// �õ�Ƚ��
	boolean flag;	//�������� �ȳ������� �����ѵ� ��

	//==========================================================
	// ���� �ʱ�ȭ
	void start(){
		// target �� 1~200 ���̿� �������� �����ǰ�
		// min, max�� 1�� 200���� �����ǰ�
		// tried �� 0�� �ǰ�
		// flag�� true�� �ٲ��
		target = (int)(1+Math.random()*200);
		min = 1;
		max = 200;
		tried = 0;
		flag = true;
	}

	int recommend(){
		// min ~ max ���� ���� �� �������� �ϳ��� ������ְ�
		int result = (int)(min+Math.random()*(max-min+1));
		return result;
		
	}

	String compare(int data){
		// ���޹��� ���ڿ� �ڽ��� target �� ���ؼ�
		// "CORRECT"(������), "TOO HIGH", "HIGH", "LOW", "TOO LOW"
		//	data�� Ÿ�ٺ��� ū�� �� ���� 50 ������ "TOO HIGH", �׷��� ������ "HIGH"	
		//	data�� Ÿ�ٺ��� ������ �� ���� 50 ������ "TOO LOW", �׷��� ������ "LOW"	

		// �̰��ϸ鼭 ���ÿ�, min ~ max �����صΰ�, tried �ø���, ������ flag�� false�� ����
		
		++tried;
		String returnValue = "";
		if (data == target){
			flag = false;
			returnValue = "CORRECT";
		}else if (data > target){
			max = data > max ? max : data;
			/* ==
				if (data<max)
					max = data;
			*/
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

	boolean isRun(){
		// ������ �۵������� �ƴ����� Ȯ�� flag���� isRunó�� ���°��� ��õ��
		if(flag)
			return true;
		else
			return false;

	}

	String tell(){
		// ���� tried ���̶� min ��, max ���� �����ؼ� �ٷ� ����Ҽ� �ְ� ���ڿ��� ������ִ� ���
		return "tried = "+tried+" min = "+min+" max = "+max;
	}
}
