package ch06_Object;
class Source09_EngineStaion {
	public static void main(String[] args) {
		String select = System.console().readLine();
		/*	==OptionPane 1�ο�==
		ConsoleStaion_JO c = new ConsoleStaion();
		UpDownEngine e = new UpDownEngine();
		c.insert(e);
		c.play();
		c.remove();
		*/
		
		/*	==Console 1�ο�==
		ConsoleStaion_C c = new ConsoleStaion_C();
		UpDownEngine e = new UpDownEngine();
		c.insert(e);
		c.play();
		c.remove();
		*/

		// ==Console vsCOM .ver====
		ConsoleStaion_M c = new ConsoleStaion_M();
		UpDownEngine e = new UpDownEngine();
		UpDownEngine f = new UpDownEngine();
		c.insert(e,f);
		c.play();
		c.remove();
	}	
}
