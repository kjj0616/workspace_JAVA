class Exercise03_Loop {
	public static void main(String[] args)	{
		// vip ��ް��
		int vip =0;
		System.out.println("�����ݾ� : ");
		int charge = Integer.valueOf(System.console().readLine());
		// �����ݾ׸�ŭ vip ����� �ö�
		// 0 -> 3 ��ޱ����� ��޴� 5000��
		// 3 -> 6 ��ޱ����� ��޴� 10000��
		// 6 -> 10 ��ޱ����� ��޴� 10000+(������*1000) ��
		//====================================================
		// �ݺ��� ? while��õ
		int result = charge;
		
		//do~while+switch��
		/*
		boolean possible = true;
		do{
			int need;
			switch(vip){
			case 0: case 1: case 2:
				if(charge>=5000){
					charge -= 5000;
					vip++;
				}else
					possible = false;
				break;
			case 3: case 4: case 5:
				if(charge>=10000){
					charge -= 10000;
					vip++;
				}else
					possible = false;
				break;				
			default:
				if(charge >= 10000+vip*1000){
					charge -=10000+vip*1000;
					vip++;
				}else
					possible = false;
			}
		}while(possible);
		*/
		//while + switch��
		int i=0;
		while(charge >=0){
			i++;
			switch(i){
	
				 case 1: case 2: case 3:
					charge -= 5000; break;
				 case 4: case 5: case 6:
					charge -= 10000; break;
				default:
					charge = charge -(10000+(i-1)*1000); break;

			}		
		}
		System.out.println("�������� "+(i-1));
		System.out.println();

		// �� while + if-else��
		int remain=0;
		while (result>0 && vip < 10){
			if (vip>=0 && vip <3) {
				if (result-5000 <0) {
					remain +=5000;
					break;
				}
				result -= 5000;
				vip++;
				System.out.print("�ܾ� = "+result);
				System.out.println(", vip ��޻��, vip="+vip);
			}else if (vip>=3 && vip <6) {
				if (result-10000 <0) {
					remain +=10000;
					break;
				}
				result -= 10000;			
				vip++;
				System.out.print("�ܾ� = "+result);
				System.out.println(", vip ��޻��, vip="+vip);
			}else if (vip>=6 && vip <10) {
				if (result- (10000+(vip*1000)) <0) {
					remain +=(10000+(vip*1000));
					break;
				}
				result -= (10000+(vip*1000));
				vip++;
				System.out.print("�ܾ� = "+result);
				System.out.println(", vip ��޻��, vip="+vip);
			}
		}
		System.out.println();
		System.out.println("�� �ݾ� ���� : "+charge +", �ܾ�  = "+result ) ;
		System.out.println("���� vip ���: "+vip);
		System.out.println("vip"+(vip+1)+" ��� ���ޱ����� ���Աݾ� = "+remain+"-�ܾ�"+result+" = "+(remain-result));
		/*
		for (vip=0; (vip<10 && result>0); vip++){
			if (vip >= 0 && vip <3 && result >0){
				result -= 5000;
				System.out.print("�ܾ� = "+result);
				System.out.println(", vip ��޻��, vip="+vip);

			}else if (vip >=3 && vip <6&& result >0){
				result -= 10000;
				System.out.print("�ܾ� = "+result);
				System.out.println(", vip ��޻��, vip="+vip);

			}else if(vip >=6 && vip <10&& result >0){
				if(result>0) {
					result -= (10000+(vip*1000));
					System.out.print("�ܾ� = "+result);
					System.out.println(", vip ��޻��, vip="+vip);
				}
			}
		}
		
		System.out.println("�ܾ� = "+result);
		System.out.println("vip="+vip);
		*/	
			/*
			switch(vip){
			case 0: case 1: case 2:
				result -= 5000;
				System.out.println("vip ��޻��");
				break;
			case 3: case 4: case 5:
				result -= 10000; 
				System.out.println("vip ��޻��");
				break;
			case 6: case 7: case 8: case 9:
				result -= (10000+(vip*1000));
				System.out.println("vip ��޻��");
			}
			System.out.println("vip = "+vip+"���� �ܾ�" +result);
			*/
		
		
		//====================================================
		// �� ��޺� ĿƮ���������� ��� //for + for ��õ
		
		// �� for + switch��
		int sum =0;
		System.out.println();
		System.out.println("��� �ʿ� ��������Ʈ");
		for(int v=0; v<10; v++){
			switch(v){
			case 0: case 1: case 2:
				sum += 5000;
				System.out.println("vip"+(v+1)+"	"+sum);
				break;
			case 3: case 4: case 5:
				sum += 10000;
				System.out.println("vip"+(v+1)+"	"+sum);
				break;
			default:
				sum += 10000+(v*1000);
				System.out.println("vip"+(v+1)+"	"+sum);
			}
		}
		
		/*
		int need=0;
		for(int v=1; v<=10; v++) {
			System.out.println(v+"��� �ʿ� ����Ʈ");
			switch(v) {
			case 1: case 2: case 3:
				need +=5000;
				break;
			case 4: case 5: case 6:
				need += 10000;
				break;
			default :
				need += 10000+ (v - 1)*1000;
			}
			System.out.println("���� "+need);
		}
		*/
		/*
			vip1	5000
			vip2	10000
			vip3	15000
			vip4	25000
			vip5	35000
			vip6	45000
			vip7	61000
			vip8	78000
			vip9	96000
			vip10	115000

		*/
		}
	}