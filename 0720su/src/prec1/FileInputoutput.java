package prec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputoutput {
	public static void main(String[] args) {
		// try - catch - finally는 각각의 블럭
		FileOutputStream fos = null;
		try {
			// 예외가 발생할 가능성이 있는 구문
			// 현재 프로젝트 디렉토리에 파일을 생성
			fos = new FileOutputStream("C:\\Users\\503-25\\Desktop\\0720byte.txt", true);
			// true를 쓰면 이어쓰기가 되고 true를 안주면 그냥 첫글자가 계속 찍힌다.
			// 파일에 1바이트 기록
			// fos.write(65);

			// 파일에 바이트 배열을 기록
			// byte [] ar = {65,66,67,68,69};
			// fos.write(ar);

			// 문자열을 바이트 배열로 변환해서 기록
			// getBytes 이용 - 중요 // 직접 바이트 배열로 기록할 수 있고 아래와 같이 문자열로 해서 추가해줄수 있다.
			String str = "안녕하세요";
			fos.write(str.getBytes());

			// 버퍼의 내용을 비우기
			fos.flush();
		} catch (Exception e) {
			// 예외가 발생했을 때 수행할 구문
			System.out.println("파일 입출력 예외:" + e.getMessage());
			// 현재 날짜와 시간 그리고 예외 내용을 로깅합니다.
			// 파일에 기록하거나 네트워크를 통해서 서버에 전달 합니다.
		} finally {
			// 예외 발생 여부에 상관없이 수행할 구문
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream tis = null;
		try {
			tis = new FileInputStream("C:\\\\Users\\\\503-25\\\\Desktop\\\\0720byte.txt");
			//1byte 읽어오기
//			int r = tis.read();
//			System.out.println(r);
			
			
			//4바이트 읽기
			//read에 바이트 배열을 대입하면 읽은 개수를 리턴
			//0보다 작거나 같은 값을 리턴하면 읽을 데이터가 없는 것입니다
			while(true) {
				byte [] b = new byte[100];
				int r = tis.read(b);
				// 배열은 to String이 재정의 되어 있지 않아서 해시코드가 출력
//				System.out.println(b);
				// 아래는 코드를 각각 출력
				/*for(byte ismi : b) {
					System.out.println(ismi);
				}
				*/
				
				//문자열로 변환해서 출력 // 바이트 배열이 문자열로 바뀐다 String을 쓰면
				System.out.println(new String(b));
				
				if(r <= 0) {
					break;
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("파일 읽기 예외:" + e.getMessage());

		} finally {
			if (tis != null) {
				try {
					tis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
