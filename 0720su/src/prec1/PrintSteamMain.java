package prec1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintSteamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("C:\\Users\\503-25\\Desktop\\data.txt", true));
			ps.println("반갑습니다");
			ps.println("메롱");
			ps.flush();
			
		}catch(Exception e) {
			System.out.println("파일 쓰기 예외 : " + e.getMessage());
		} finally {
			try {
			if(ps != null) {
			ps.close();
			}
			} catch(Exception e){
				e.getStackTrace();
			}
		}

	}

}
