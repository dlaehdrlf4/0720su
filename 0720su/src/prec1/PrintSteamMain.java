package prec1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintSteamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("C:\\Users\\503-25\\Desktop\\data.txt", true));
			ps.println("�ݰ����ϴ�");
			ps.println("�޷�");
			ps.flush();
			
		}catch(Exception e) {
			System.out.println("���� ���� ���� : " + e.getMessage());
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
