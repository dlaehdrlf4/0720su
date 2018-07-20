package prec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuliderMain {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-25\\Desktop\\0717�����ڷ�.txt"));
			//�� ������ �����͸� �̾���� StringBulider ����
			StringBuilder sb = new StringBuilder();
			while(true) {
				//������ �б�
				String line = br.readLine();
				//���� �����Ͱ� ������ ����
				if(line == null) {
					break;
				}
				//���� �����Ͱ� ������ sb�� �߰�
				sb.append(line);
			}
			
			
			
			//���� ������ Sting�� �����ϱ�
			String content = sb.toString();
			//�޸� ������ ���ؼ� �ؿ��� ����.
			sb = null;
			System.out.println(content);
			
			
			
		}catch(Exception e) {
			System.out.println("���� ó�� :" + e.getMessage());
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
