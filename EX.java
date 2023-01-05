package test1;

import java.util.Scanner;

class Product {
	String[] product = {"수박","딸기","한라봉"};
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
		System.out.println(" 성명: "+name+" 과일: "+frut+" 수량: "+count+" 총합계: "+ count*t);
	}
}

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pr = new Product();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요");
		pr.setName(sc.next());
		System.out.println(" 과일번호를 입력하세요");
		pr.setFru(sc.nextInt());
		System.out.println(" 수량을 입력하세요");
		pr.setCount(sc.nextInt());
		
		pr.show();
		
		
		
	}

}
