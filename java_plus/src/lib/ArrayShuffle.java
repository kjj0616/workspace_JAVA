package lib;

public class ArrayShuffle {
	public static void main(String[] args){
		// ############## 1. boolean ����ġ ###################
	    int arr1[] = new int[50];
	    boolean _switch[] = new boolean[arr1.length];

	    //�迭�� 0���� 49������ ���ڸ� ������� �����Ѵ�.
	    for (int i=0; i<arr1.length; i++){
	    	arr1[i] = i;
	    }
	    System.out.println("\n���� ��");
	    for (int i=0; i<arr1.length; i++){
	      System.out.print(arr1[i]+" ");
	    }

	    //boolean ����ġ�� true�� ���� �ʱ�ȭ �Ѵ�.
	    for (int i=0; i<_switch.length; i++){
	      _switch[i] = true;
	    }

	    int w=0;
	    int r1;
	    while (w<arr1.length){
	      //0~49�� �������� index�� ���� _switch�迭�� ���Ұ�
	      //true�̸� if���� �����Ѵ�.
	      //ex �������� 4�̸� _switch[4]�� false�� �ǰ�,
	      //������ �ٽ� 4�� ���͵� �ƹ��ϵ� �Ͼ�� �ʰ� while���� ����.
	      //�׷��� ��� switch�迭�� false�� �ٲ�� shuffle�� �Ϸ� �ȴ�.
	    	r1 = (int)(Math.random()*arr1.length);
	      if(_switch[r1]){
	        _switch[r1] = false;
	        arr1[w] = r1;
	        w++;
	      }
	    }
	    System.out.println("\n���� ��");
	    for (int i=0; i<arr1.length; i++){
	      System.out.print(arr1[i]+" ");
	    }
	  
	
	
		// ############## 2. random swap ###################

		    int arr2[] = new int[50];
		    //�迭 �ʱ�ȭ
		    for (int i=0; i<arr2.length; i++){
		    	arr2[i] = i;
		    }
		    System.out.println("\n���� ��");
		    for (int i=0; i<arr2.length; i++){
		      System.out.print(arr2[i]+" ");
		    }

		    int idx=0;
		    int r2;
		    int temp;
		    while(idx < arr2.length){
		      //0~49�� ���� �����ϰ� �̾Ƴ���.
		      r2 = (int)(Math.random()*arr2.length);
		      //���� �� �ε����� �ٸ��ٸ�
		      if(w!=r2){
		        //swap���� ���� �ٲ۴�.
		        temp = arr2[idx];
		        arr2[idx] = arr2[r2];
		        arr2[r2] = temp;
		        w++;
		      }
		    }
		    System.out.println("\n���� ��");
		    for (int i=0; i<arr2.length; i++){
		      System.out.print(arr2[i]+" ");
		    }
	}
}

