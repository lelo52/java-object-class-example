package test1;

import java.util.Scanner;

class Fru{
	
	String fru;
	int price;
	int sprice;
	int cnt;
	
	void sprice() {
		System.out.println("������ "+fru+" \n������ "+price);
	}
}

public class EX_2023_0105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fru[] fr = new Fru[3];
		System.out.println("�̸��� �Է�");
		String name = sc.next();
		System.out.println("������ �Է�");
		int fru = sc.nextInt();
		System.out.println("������ �Է�");
		int cnt = sc.nextInt();
		System.out.println("�̸��� "+name);
		for(int i = 0; i<fr.length; i++) {
			fr[i]= new Fru();
		}
		
		fr[0].fru = "����";
		fr[0].price=100;
		
		fr[1].fru = "����";
		fr[1].price=200;
		
		fr[2].fru = "�Ѷ��";
		fr[2].price=300;
		
		
		fr[fru].sprice();
		System.out.println("�Ѿ��� "+fr[fru].price*cnt);
	}

}
