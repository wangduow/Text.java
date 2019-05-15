import java.util.*;
public class Admin {//��������ѧ����һ����
	String msg="\t���\t����\t����\tjava\tc#\thtml\tsql\tsum\tavg";
	public void print(Student[] arr){//�������ݵ�
		System.out.println(msg);
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				arr[i].setSum();
				arr[i].setAvg();
				System.out.println(arr[i]);//���������
			}
		}
	}	
	public boolean exist(int on,Student stu){//�ж�ѧ���Ƿ����
		if(stu!=null){
			if(stu.getOn()==on){//�жϱ���ǲ��ǵ�������ı��
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	public void create(String name,int age,Student[] arr){//���ѧ���ķ���
		Student stu=new Student();//������ʵ��������
		stu.setName(name);
		stu.setAge(age);
		int i=this.setIndex(arr);//���÷����õ�int�͵�ָ��i
		stu.setOn(i);
		if(i==99999){
			System.out.println("�������������������");
		}else{
			arr[i]=stu;
		}
		this.print(arr);//����
	}
	public int setIndex(Student[] arr){//��������Ϊ�յ��±꣬�����������
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){
				return i;
			}

		}
		return 99999;
	}
	public void select(int on,Student[] arr){//��ѯ����
		System.out.println(msg);
		for(int i=0;i<arr.length;i++){//��������
			if(this.exist(on,arr[i])==true){
				System.out.println(msg);
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("--û�����ѧ���Ĵ���--");
	}
	public void update(int on,String name,int age,Student[] arr){//����ѧԱ��Ϣ
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])){//this��ʾ��ǰ�������жϱ��Ϊon������Ϊi�������Ƿ����
				arr[i].setName(name);
				arr[i].setAge(age);
				System.out.println("---����ѧ����Ϣ�ɹ�---");
				this.print(arr);//����
				return;
			}
		} 
		System.out.println("---û�ҵ����ѧ����������Ϣʧ��---");
	}
	public void delete(int on,Student[] arr){
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])){
				arr[i]=null;
				this.print(arr);//����
				return;
			}
		}
		System.out.println("����ָ����ŵ�ѧ��û�д���");
	}
	public void input(int on,Student[] arr){//����ѧ���ɼ��Ĳ���
		for(int i=0;i<arr.length;i++){
			if(this.exist(on,arr[i])){
				System.out.println("������"+arr[i].getName()+"java�ĳɼ�");
				Scanner in=new Scanner(System.in);
				if(in.hasNextInt()){
					arr[i].setJava(in.nextInt());
				}
				System.out.println("������"+arr[i].getName()+"c#�ĳɼ�");
				if(in.hasNextInt()){
					arr[i].setC_shar(in.nextInt());
				}
				System.out.println("������"+arr[i].getName()+"Html�ĳɼ�");
				if(in.hasNextInt()){
					arr[i].setHtml(in.nextInt());
				}
				System.out.println("������"+arr[i].getName()+"Sql�ĳɼ�");
				if(in.hasNextInt()){
					arr[i].setSql(in.nextInt());
				}		
				this.print(arr);//����
				break;
			}
		}
	}
	public void courseSort(int num,Student[] arr){//����ָ���Ŀ�Ŀ�����������
		if(num==1){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null){
						if(arr[i].getSum()<arr[j].getSum()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		else if(num==2){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null){
						if(arr[i].getC_shar()<arr[j].getC_shar()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		else if(num==3){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null){
						if(arr[i].getSql()<arr[j].getSql()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		else if(num==4){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]!=null){
						if(arr[i].getSql()<arr[j].getSql()){
							Student t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
						}
					}
				}
			}
		}
		this.print(arr);
	}
	public void sumSort(Student[] arr){//�����ֽܷ�������
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]!=null){
					if(arr[i].getSum()<arr[j].getSum()){
						Student t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}		
				}
			}			
		}
		this.print(arr);
	}
}
