package prec1;

import java.io.FileWriter;
import java.io.IOException;

public class prec3 {

	public static void main(String[] args) {
		
		FileWriter fw =null;
		try {
			fw = new FileWriter("C:\\Users\\503-25\\Desktop\\data1.txt",true);
			fw.write("안녕하세요");
			fw.write("파이어");
			fw.write("내가간다");
			fw.flush();
			
		}catch (Exception e) {
			System.out.println("기록 예외 :" + e.getMessage());
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
