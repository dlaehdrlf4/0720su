package prec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		//Ű����κ��� �� ������ �Է��� ���� �� �ִ� Ŭ������ ������ ���� ����
		//final������ close�� �� �� �ֵ��� try �ۿ��� ������ �����մϴ�.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�̸�");
			// ���ڿ� ������ �о�ɴϴ�.
			String name = br.readLine();
			
			System.out.println("����");
			String age = br.readLine();
			
			System.out.println("Ű");
			String heg = br.readLine();
			
			//3���� �����͸� �ϳ��� �����ϱ� ���� �ν��Ͻ��� ����
			Member member = new Member();
			member.setName(name);
			//������ ��ȯ�ؼ� ����
			member.setAge(Integer.parseInt(age));
			// �Ǽ��� ��ȯ�ؼ� ����
			member.setHeg(Double.parseDouble(heg));
		
			//���� �̿��ؼ� ����
			Map<String,Object> map = new HashMap<>();
			map.put("name", name); //�տ� �ִ� Ű�� ����Ҷ� ������ ���ϳ� ���ϱ�
			map.put("age", Integer.parseInt(age));
			map.put("heg", Double.parseDouble(heg));
			
			
		// ����� ���� VO Ŭ������ Map�� �� ���̰� �����ϴ�.	
		System.out.println(member);
		System.out.println(map);
		
		//����� ���� ���� �ٸ��ϴ�. ���̸� 1�� ���ϱ�
		int r = member.getAge() + 1; // vo�� ����ȯ ���� �ʾƵ� �ȴ�.
		//Map������ �����͸� �����ͼ� ����� �� ���� ����ȯ�� ���־�� �մϴ�.
		//r = map.get("age") + 1; �̰� ������ �ֳ��ϸ� ����ȯ�� ������ �ʾұ� �����̴�
		r = (Integer)map.get("age") + 1; // �̷��� map�� ���� ����ȯ�� ���־���Ѵ�.
		
	
		}catch(Exception e) {
			System.out.println("���� ó�� :" + e.getMessage());
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
