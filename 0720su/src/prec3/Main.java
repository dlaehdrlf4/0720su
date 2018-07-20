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
			
			//접속한 아이피를 중복 상관없이 저장하기 위한 자료구조
			ArrayList<String> ip = new ArrayList<>();
			//중복 없이 저장하기 위한 Set 만들기
			Set<String>ipset = new HashSet<String>();
			
			//줄 단위로 데이터를 이어붙일 StringBulider 생성
			StringBuilder sb = new StringBuilder();
			while(true) {
				//한줄을 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//공백으로 분할
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
				ipset.add(ar[0]);
				ip.add(ar[0]);
				
				
			}
			for(String ip1 : ipset) {
			System.out.println(ip1);
			}
			
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
