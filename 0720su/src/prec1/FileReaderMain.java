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
				//buf�� ũ�⸸ŭ �о buf�� �����ϰ� ���� ������ r�� ����
			int r =  fr.read(buf);
			if(r <= 0) {
				break;
			}
//			 for(char ch : buf) {
//				 System.out.println(ch); // �ѹ��� �д´�.
//			 }
			 //�迭���� 0��°���� r��ŭ �� ���ڿ��� ��ȯ�ؼ� ���
			 System.out.println(new String(buf,0,r));
			
			}
		}catch(Exception e) {
			System.out.println("���� : " + e.getMessage());
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
