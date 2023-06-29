class Qspiders
{
	String name="Tabrez";

	public void designation(){
		System.out.println("I will not Tell");
	}
	
	public void loc(){
		System.out.println("I will not Tell");
	}
}
class Tester extends Qspiders
{
		public void designation(){
			System.out.println("I am a Test Engineer");
		}
		
		public void loc(){
			System.out.println("In Vadapalani");
		}

}
class Developer extends Qspiders
{
		public void designation(){
			System.out.println("I am a  Developer");
		}
		
		public void loc(){
			System.out.println("In Chrompet");
		}

}

