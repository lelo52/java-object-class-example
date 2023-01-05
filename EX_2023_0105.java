package test1;

import java.util.Scanner;

class Fru{
	
	String fru;
	int price;
	int sprice;
	int cnt;
	
	void sprice() {
		System.out.println("과일은 "+fru+" \n가격은 "+price);
	}
}

public class EX_2023_0105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fru[] fr = new Fru[3];
		System.out.println("이름을 입력");
		String name = sc.next();
		System.out.println("과일을 입력");
		int fru = sc.nextInt();
		System.out.println("수량을 입력");
		int cnt = sc.nextInt();
		System.out.println("이름은 "+name);
		for(int i = 0; i<fr.length; i++) {
			fr[i]= new Fru();
		}
		
		fr[0].fru = "수박";
		fr[0].price=100;
		
		fr[1].fru = "딸기";
		fr[1].price=200;
		
		fr[2].fru = "한라봉";
		fr[2].price=300;
		
		
		fr[fru].sprice();
		System.out.println("총액은 "+fr[fru].price*cnt);
	}

}
