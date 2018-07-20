package prec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuliderMain {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-25\\Desktop\\0717수업자료.txt"));
			//줄 단위로 데이터를 이어붙일 StringBulider 생성
			StringBuilder sb = new StringBuilder();
			while(true) {
				//한줄을 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//읽은 데이터가 있으면 sb에 추가
				sb.append(line);
			}
			
			
			
			//읽은 내용을 Sting에 저장하기
			String content = sb.toString();
			//메모리 정리를 위해서 밑에를 썻다.
			sb = null;
			System.out.println(content);
			
			
			
		}catch(Exception e) {
			System.out.println("에외 처리 :" + e.getMessage());
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
