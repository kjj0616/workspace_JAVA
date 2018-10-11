class Source08_EngineMultiUse {
	public static void main(String[] args)	{
		UpDownEngine e1 = new UpDownEngine();
		UpDownEngine e2 = new UpDownEngine();
		e1.start();
		e2.start();
		System.out.println("[SYSTEM] UpDownEngine STARTED");
		while(e1.isRun() && e2.isRun()){
			System.out.println();
			System.out.println("[PLAYER1]"+e1.tell()+"> ");
			int d1 = Integer.valueOf(System.console().readLine());
			String rst1 = e1.compare(d1);
			int d2 = e2.recommend();
			//System.out.println("[d] "+d2);

			String rst2 = e2.compare(d2);

			System.out.println("[PLAYER1] "+d1 + " is "+ rst1);
			//System.out.println("[SYSTEM] Press Enter");
			//System.console().readLine();
			System.out.println();
			System.out.println("	[PLAYER2] "+d2 + " is "+ rst2);
			System.out.println("	[PLAYER2] "+e2.tell());





		}
		System.out.println();
		if(e1.isRun()==false && e2.isRun())
			System.out.println("[SYSTEM] Player1 WIN");
		else if(e1.isRun() && e2.isRun()==false)
			System.out.println("[SYSTEM] Player2 WIN");
		else
			System.out.println("[SYSTEM] DRAW");

		System.out.println();
		System.out.println("[SYSTEM] UpDownEngine STOPED");

	}
}

