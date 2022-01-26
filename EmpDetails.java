class EmpData //SubClass
{
	String empId="A121";
	String empName="Srikanth";
	String empDesg="SE";
	void getEmpData()
	{
		        System.out.println("====EmpData====");
		        System.out.println("EmpId:"+empId);
        		System.out.println("EmpName:"+empName);
        		System.out.println("EmpDesg:"+empDesg);
	}
}
class EmpAddress //SubClass
{
	String hNo = "125";
	String sName = "SR Nagar";
	String city = "Hyd";
	int pinCode = 612345;
	void getEmpAddress()
	{
		System.out.println("====EmpAddress===");
        		System.out.println("HNo:"+hNo);
        		System.out.println("SName:"+sName);
        		System.out.println("city:"+city);
        		System.out.println("PinCode:"+pinCode);
	}
}
class EmpContact //SubClass
{
	String mailId="sri@gmail.com";
	long phNo = 9898981234L;
	void getEmpContact()
	{
		System.out.println("====EmpContact====");
       		System.out.println("Mail Id:"+mailId);
       		 System.out.println("PhNo:"+phNo);
	}
}
class EmpDetails  //MainClass
{
	public static void main(String[] args) 
	{
		EmpData ed = new EmpData();
        		EmpAddress ea = new EmpAddress();
        		EmpContact ec = new EmpContact();

		ed.getEmpData();
		ea.getEmpAddress();
		ec.getEmpContact();

	}
}
