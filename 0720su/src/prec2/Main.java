package prec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		//키보드로부터 줄 단위로 입력을 받을 수 있는 클래스의 참조형 변수 선언
		//final절에서 close를 할 수 있도록 try 밖에서 변수를 선언합니다.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("이름");
			// 문자열 한줄을 읽어옵니다.
			String name = br.readLine();
			
			System.out.println("나이");
			String age = br.readLine();
			
			System.out.println("키");
			String heg = br.readLine();
			
			//3개의 데이터를 하나로 저장하기 위한 인스턴스를 생성
			Member member = new Member();
			member.setName(name);
			//정수를 변환해서 저장
			member.setAge(Integer.parseInt(age));
			// 실수로 변환해서 저장
			member.setHeg(Double.parseDouble(heg));
		
			//맵을 이용해서 저장
			Map<String,Object> map = new HashMap<>();
			map.put("name", name); //앞에 있는 키가 출력할때 제목을 뜻하네 보니까
			map.put("age", Integer.parseInt(age));
			map.put("heg", Double.parseDouble(heg));
			
			
		// 출력할 때는 VO 클래스나 Map이 별 차이가 없습니다.	
		System.out.println(member);
		System.out.println(map);
		
		//사용할 때는 조금 다릅니다. 나이를 1씩 더하기
		int r = member.getAge() + 1; // vo는 형변환 하지 않아도 된다.
		//Map에서는 데이터를 가져와서 사용할 때 강제 형변환을 해주어야 합니다.
		//r = map.get("age") + 1; 이건 에러다 왜냐하면 형변환을 해주지 않았기 때문이다
		r = (Integer)map.get("age") + 1; // 이렇게 map은 강제 형변환을 해주어야한다.
		
	
		}catch(Exception e) {
			System.out.println("예외 처리 :" + e.getMessage());
		} finally {
			if( br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
