package Java;

public class StaticJavaCode {
int id;
String name;
static String clgnme="JSPM";

StaticJavaCode(int i,String n){
	id=i;
	name=n;
	
}
void display() {
	
	System.out.println(id+""+name+""+clgnme);
}
}
class Student{
	public static void main(String[] args) {
		StaticJavaCode s1=new StaticJavaCode(101,"pooja");
		StaticJavaCode s2=new StaticJavaCode(102,"pooja2");
		s1.display();
		s2.display();
		
	}
}