package test1;

import java.util.Scanner;

class Product {
	String[] product = {"����","����","�Ѷ��"};
	int[] price = {100, 200, 300};
	String name;
	String frut;
	int count;
	int t;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setFru(int fru) {
		this.frut =product[fru];
		this.t = price[fru];
	}
	
	void setCount(int count) {
		this.count = count;
	}
	
	void show(){
		System.out.println(" ����: "+name+" ����: "+frut+" ����: "+count+" ���հ�: "+ count*t);
	}
}

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pr = new Product();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�̸��� �Է��ϼ���");
		pr.setName(sc.next());
		System.out.println(" ���Ϲ�ȣ�� �Է��ϼ���");
		pr.setFru(sc.nextInt());
		System.out.println(" ������ �Է��ϼ���");
		pr.setCount(sc.nextInt());
		
		pr.show();
		
		
		
	}

}
