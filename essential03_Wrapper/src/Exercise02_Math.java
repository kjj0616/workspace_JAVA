
public class Exercise02_Math {
	 static double distance(double lat1, double lng1, double lat2, double lng2) {
		 						// ����		 	�浵
		    double earthRadius = 3958.75; 
		    
		    double dLat = Math.toRadians(lat2-lat1);
		    
		    double dLng = Math.toRadians(lng2-lng1);
		    
		    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		    		
		               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
		               
		               Math.sin(dLng/2) * Math.sin(dLng/2);
		    
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		    
		    double dist = (earthRadius * c);

		    return dist;
	 }
	public static void main(String[] args) {
		// ����, �浵 �ΰ��� �Ҷ� �Ÿ� ���
		// ������ ��ǥ
		double x1 = 127.0254323; // �浵 lon 
		double y1 = 37.497942; // ���� lat
		
		// �� 
		double x2 = 127.116265;
		double y2 = 37.253402;
		
		// ���
		double x3 = 127.0979449;
		double y3 = 37.5132612;
				
		
		// �� �� ��ǥ�� �Ÿ��� km �ϱ�?
		
		/*
		 
		    �浵 1���� �Ÿ� (km����) = cos( ���� ) * 6400 * 2 * 3.14 / 360
			���� 1���� �Ÿ��� �Ʒ��� ���� ����� �� �ְ� �뷫 111 km �Դϴ�.
			���� 1���� �Ÿ� (km����) = 6400 * 2 * 3.14 / 360
			���� ���İ� ���� �̿��Ͽ��� 2���� ����, �浵�� �Ÿ��� ����ϴ� ������ ������ �����ϴ�.

			X = ( cos( ����#1 ) * 6400 * 2 * 3.14 / 360 ) * | �浵#1 - �浵#2 |
			Y = 111 * | ����#1 - ����#2 |
			D = �� ( X�� + Y�� )
			
		 */
		
		double d = distance(y1,x1,y2,x2);
		System.out.println("���� - ���� : "+d+" km");
		double dd = distance(y1,x1,y3,x3);
		System.out.println("���� - ��� : "+dd+" km");
		 
		/* ########�Ҽ��� ���� ���########
		 double numnber = 77.7777;

		 String num = String.format("%.1f" , number);

		 system.out.println("number="+number);	 //number = 77.7 
			 		
		*/
		String ds = String.format("%.2f", d);
		String dds = String.format("%.2f", dd);
		
		System.out.println("���� - ���� : "+ds+" km");
		System.out.println("���� - ��� : "+dds+" km");

	}
}
