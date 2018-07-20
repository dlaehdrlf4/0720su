package prec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputoutput {
	public static void main(String[] args) {
		// try - catch - finally�� ������ ��
		FileOutputStream fos = null;
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� ����
			// ���� ������Ʈ ���丮�� ������ ����
			fos = new FileOutputStream("C:\\Users\\503-25\\Desktop\\0720byte.txt", true);
			// true�� ���� �̾�Ⱑ �ǰ� true�� ���ָ� �׳� ù���ڰ� ��� ������.
			// ���Ͽ� 1����Ʈ ���
			// fos.write(65);

			// ���Ͽ� ����Ʈ �迭�� ���
			// byte [] ar = {65,66,67,68,69};
			// fos.write(ar);

			// ���ڿ��� ����Ʈ �迭�� ��ȯ�ؼ� ���
			// getBytes �̿� - �߿� // ���� ����Ʈ �迭�� ����� �� �ְ� �Ʒ��� ���� ���ڿ��� �ؼ� �߰����ټ� �ִ�.
			String str = "�ȳ��ϼ���";
			fos.write(str.getBytes());

			// ������ ������ ����
			fos.flush();
		} catch (Exception e) {
			// ���ܰ� �߻����� �� ������ ����
			System.out.println("���� ����� ����:" + e.getMessage());
			// ���� ��¥�� �ð� �׸��� ���� ������ �α��մϴ�.
			// ���Ͽ� ����ϰų� ��Ʈ��ũ�� ���ؼ� ������ ���� �մϴ�.
		} finally {
			// ���� �߻� ���ο� ������� ������ ����
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
			//1byte �о����
//			int r = tis.read();
//			System.out.println(r);
			
			
			//4����Ʈ �б�
			//read�� ����Ʈ �迭�� �����ϸ� ���� ������ ����
			//0���� �۰ų� ���� ���� �����ϸ� ���� �����Ͱ� ���� ���Դϴ�
			while(true) {
				byte [] b = new byte[100];
				int r = tis.read(b);
				// �迭�� to String�� ������ �Ǿ� ���� �ʾƼ� �ؽ��ڵ尡 ���
//				System.out.println(b);
				// �Ʒ��� �ڵ带 ���� ���
				/*for(byte ismi : b) {
					System.out.println(ismi);
				}
				*/
				
				//���ڿ��� ��ȯ�ؼ� ��� // ����Ʈ �迭�� ���ڿ��� �ٲ�� String�� ����
				System.out.println(new String(b));
				
				if(r <= 0) {
					break;
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("���� �б� ����:" + e.getMessage());

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
