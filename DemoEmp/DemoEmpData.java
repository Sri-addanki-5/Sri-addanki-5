class EmployeeData{ 
    String empId,empName,empDesg;
    void setEmployeeData(String a,String b,String c){
        empId=a;
        empName=b;
        empDesg=c;
    }
    void getEmployeeData(){
        System.out.println("===EmployeeData===");
        System.out.println(empId);  
        System.out.println(empName);
        System.out.println(empDesg);
    }
}
class EmployeeAddress{
    String hNo,sName,city;
    int pinCode;
    void setEmployeeAddress(String a,String b,String c,int d){
        hNo=a;
        sName=b;
        city=c;
        pinCode=d;
    }
    void getEmployeeAddress(){
        System.out.println("====EmployeeAddress===");
        System.out.println(hNo);
        System.out.println(sName);
        System.out.println(city);
        System.out.println(pinCode);
    }
}
class EmployeeContact{
    String mailid;
    long phNo;
    void setEmployeeContact(String a,long b){
        mailid=a;
        phNo=b;
    }
    void getEmployeeContact(){
        System.out.println(mailid);
        System.out.println(phNo);
    }
    }   
    
    class DemoEmpData {
        public static void main(String[] args) {
            EmployeeData ed=new EmployeeData();
            EmployeeAddress ea=new EmployeeAddress();
            EmployeeContact ec=new EmployeeContact();
                
            ed.setEmployeeData("A122", "RAJ", "SE");
            ea.setEmployeeAddress("12-34/h","SRN","Hyd",500525);
            ec.setEmployeeContact("nikh@gmail.com",9032000);
    
            ed.getEmployeeData();
            ea.getEmployeeAddress();
            ec.getEmployeeContact();
            }
    }
