package prec1;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class FileReaderMain {

	public static void main(String[] args) {
	
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\\\Users\\\\503-25\\\\Desktop\\\\data1.txt");
			char [] buf = new char[15];
			while(true) {
				//buf의 크기만큼 읽어서 buf에 저장하고 읽은 개수를 r에 저장
			int r =  fr.read(buf);
			if(r <= 0) {
				break;
			}
//			 for(char ch : buf) {
//				 System.out.println(ch); // 한번만 읽는다.
//			 }
			 //배열에서 0번째부터 r만큼 만 문자열로 변환해서 출력
			 System.out.println(new String(buf,0,r));
			
			}
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
		} finally {
			try {
			if(fr != null) {
			fr.close();
			}
			} catch(Exception e){
				e.getStackTrace();
			}
		}


	}

}
