package prec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-25\\Desktop\\access_log.txt"));
			
			//������ �����Ǹ� �ߺ� ������� �����ϱ� ���� �ڷᱸ��
			ArrayList<String> ip = new ArrayList<>();
			//�ߺ� ���� �����ϱ� ���� Set �����
			Set<String>ipset = new HashSet<String>();
			
			//�� ������ �����͸� �̾���� StringBulider ����
			StringBuilder sb = new StringBuilder();
			while(true) {
				//������ �б�
				String line = br.readLine();
				//���� �����Ͱ� ������ ����
				if(line == null) {
					break;
				}
				//�������� ����
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
				ipset.add(ar[0]);
				ip.add(ar[0]);
				
				
			}
			for(String ip1 : ipset) {
			System.out.println(ip1);
			}
			
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
