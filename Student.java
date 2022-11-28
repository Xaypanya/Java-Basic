class  Department
{
	String name = "Computer Science";}
class Major extends Department {
	String major = "CW";
public void showDetail(){
	System.out.println("Department: " +name);
	System.out.println("Major: " +major);}
}
public class Student {
	public static void main(String[] args){
	Major obj = new Major();
	obj.showDetail();
	}
}
//Mr.Xaypanya Phongsa 1CW2
