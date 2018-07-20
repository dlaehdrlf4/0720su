package prec1;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 Scanner 인스턴스만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String y = sc.nextLine();
		System.out.println(y);
		System.out.println("정수:");
		int x = sc.nextInt();
		System.out.println(x); // 반대로 하면 안된다다다다 왜 안될까
		
		
		
		
		sc.close();

	}

}
