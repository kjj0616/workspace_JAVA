
public class Source15_ArrayArray {
	public static void main(String[] args) {
		/*
		 * ���߹迭(�迭�� �迭�� �����ϰ��� �Ҷ�) ��ü�� �����Ҷ�,
		 */
		boolean[][] map = new boolean[5][];
		// �� ���·� ����� ���Ҵµ�
		for (int r = 0; r < map.length; r++) {
			System.out.println(map[r]); // map[r].length ���ٽ� ����
		}
		// ���࿡, ���߹迭�� �����ؾߵ� �迭�� ũ�Ⱑ �����ϴٸ�...
		int[][] num = new int[4][5]; // �ι�°ĭ�� ũ�⸦ �����صΰ� ����� �ִ�.
		for (int r = 0; r < num.length; r++) {
			System.out.println(num[r] + " / " + num[r].length);
		}
		// ���簢��������� �����Ҷ��� �̸� ���Ҽ� ����
		
		// ���� �۾��� ����
		// int[][] num = new int[][]{ new int[5], new int[5], new int[5], new int[5] }
		
		
		num[1] = new int[10]; //������ ���� ����
		
		Sim[][] f = new Sim[3][2];			 // vs new Sim[3][];
		for (int r = 0; r < f.length; r++) {
			System.out.println(f[r]);
			for (int c = 0; c < f[r].length; c++) {
				System.out.println(f[r][c]);
				// Sim������ ���� �ʾ����Ƿ� null
			}
		}
		
		
		
	}
}
