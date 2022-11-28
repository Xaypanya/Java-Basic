class StudentInfo 
{	// class declaration
	public String id; 
	public String ClassName;
	private String name;
	private int age;

	// create setter,getter methods
	public void setName(String d){
		name = d;
	}

	public void setAge(int s){
		age = s; 
	}

	public String getName(){
		return name;
	}


	public int getAge(){
		return age;
	}

	public void displays(){
		System.out.println("Name: "+ getName());
		System.out.println("Age: "+ getAge());
		System.out.println("ID: "+ id);
		System.out.println("Class: "+ ClassName);
	}
}
public class ShowInfo{
	public static void main(String[] args){
		StudentInfo s1=new StudentInfo();
		s1.setName("Xaypanya Phongsa");
		s1.setAge(17);
		s1.id="205N0051";
		s1.ClassName="1CW2";
		s1.displays();
	}
}







/*= 
 = ""
 = "
 = */