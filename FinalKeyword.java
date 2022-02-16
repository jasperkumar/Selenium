package Session6;

//A class​ declared as a final class, cannot be subclassed/inherited
public  class FinalKeyword {
	
	final int id = 777;
	 int age;
	 String name;
	 String Dept;
	
	/*//cannot add int id because it has final keyword
public void method1(int ageofemployee,String nameofemployee,String Deptofemployee,int idofemployee) {
		age  = ageofemployee;
		name = nameofemployee;
		Dept = Deptofemployee;
		id = idofemployee;
}*/
	//A method, declared with the final keyword, cannot​ be overridden or hidden by subclasses
//e.g public final void method1 or ( final int ageofemployee,String nameofemployee,String Deptofemployee) {
public void method1( int ageofemployee,String nameofemployee,String Deptofemployee) {
	age  = ageofemployee;
	name = nameofemployee;
	Dept = Deptofemployee;
	
}
	

	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		
		FinalKeyword fk1 = new FinalKeyword();
		fk.method1(35,"Jasper","Biotech");
	
	fk1.method1(36,"Sathya","Science");
		
		

	}

}
