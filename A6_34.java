/**此类是研究静态变量的
 * @author 王多文
 * @version 1.0*/
public class A6_34 {/**主方法*/
	public static void main(String[] args){
		Student A=new Student();
		A.print();
		Student.p();
	}
}
class Student{
	static String name="小李";
	int age;//实例变量
	static String country="中国";//静态变量(类变量)
	void print(){
		System.out.println(name);
	}
	static void p(){
		System.out.println(country);
	}
}