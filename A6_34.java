/**�������о���̬������
 * @author ������
 * @version 1.0*/
public class A6_34 {/**������*/
	public static void main(String[] args){
		Student A=new Student();
		A.print();
		Student.p();
	}
}
class Student{
	static String name="С��";
	int age;//ʵ������
	static String country="�й�";//��̬����(�����)
	void print(){
		System.out.println(name);
	}
	static void p(){
		System.out.println(country);
	}
}