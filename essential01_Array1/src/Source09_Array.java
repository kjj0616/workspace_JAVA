
public class Source09_Array {
	static boolean[] makeSample(){
		boolean[] sheet = new boolean[ 5+(int)(Math.random()*10)];
		for(int idx=0;idx<sheet.length;idx++) { //���ĭ�� ������� ����
				// == idx<=sheet.length-1;
			if(Math.random()>0.5)
				continue;
			sheet[idx] = true;
		}
		return sheet;
	}
	public static void main(String[] args) {
		// �迭��ü�� �����͸� �����ϴ� ������ [0],[1] ���ʴ�� ��ȣ�� �����صΰ�,
		// �� �ε����� ���� ���� �����͸� �����Ѵٰų�, Ȯ���Ѵٰų� �Ҽ� �ְ� �Ǿ���.
	
		boolean[] sheet = makeSample();
		System.out.println("sample ..");
		for(int idx=0;idx<sheet.length;idx++) { 		// 0 -> length-1
			System.out.println( (idx+1) + " : " +sheet[idx]);
		}		
		//System.out.println(sheet.toString()); //�̰ɷ� �ϰ� Ȯ���Ҽ� �ְ� ������ �Ұ����ϴ�.
		System.out.println();
		
		// �迭�� �����͸� ������ѵΰ�, ���� �ϴ� �۾���
		// - Ư�����¸� ���� ������ ���� Ȯ���ϴ� �۾�
		// true ���� ����, ��ü �������� true �� ������?
		int count=0;
		for(int idx=0;idx<sheet.length;idx++) {
			if(sheet[idx])
				count++;
		}
		System.out.println("TrueCount = "+count);
		double per = (double)count/sheet.length;
		System.out.println("sheet.length = "+sheet.length);
		System.out.println("% = "+per);
		
		//#####################
		int cnt=0;
		for (int idx = 0; idx < sheet.length; idx++) {
			if(sheet[idx]) {
				cnt++;
			}
		}
		System.out.println("FIND true = "+cnt);
		double r = (double)cnt/sheet.length*100 ;  //�ۼ�Ʈó�� ������ *100
		System.out.println("TRUE data = "+r+"%");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
