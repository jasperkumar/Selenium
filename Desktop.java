package Session6;

public class Desktop implements Hardware,Software {

	

	public void softwareResources() {
		System.out.println("Windows10");
		
	}

	public void hardwareResources() {
		System.out.println("harddisk");
		
	}
	
	public void memory() {
		System.out.println("RAM");
		
	}
	
public static void main(String[] args) {
	
	Desktop obj = new Desktop();
	obj.softwareResources();
	obj.hardwareResources();
	obj.memory();
	//no need to create object if it has static keyword .
	//call with interface name .variable . refer hardware.java interface
	System.out.println(Hardware.id);
	
	
	/*//scope restriction
	Hardware obj1 = new Desktop();
	obj1.hardwareResources();
	Software obj2 = new Desktop();
	obj2.softwareResources();*/

	}

}
