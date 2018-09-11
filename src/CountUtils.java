import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountUtils {
	public static void countChar(String filepath) throws IOException {
		File file = new File(filepath);
		if (file.isFile()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int count = 0;
			String str = null;
			while ((str = br.readLine()) != null) {
				count+=str.length();
			}
			System.out.println(file.getName()+"���ַ�����Ϊ:" + count);
			br.close();	
		}else {
			System.out.println("�ļ�������");
		}
	}

	public static void countWord(String filepath) throws IOException {
		File file = new File(filepath);
		if (file.isFile()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int count = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				count+=line.trim().split(" ").length;
			}
			System.out.println(file.getName()+"�ĵ��ʸ���Ϊ:" + count);
			br.close();
		}else {
			System.out.println("�ļ�������");
		}
	}

	public static void countLine(String filepath) throws IOException {
		File file = new File(filepath);
		if (file.isFile()) {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int count = 0;
			while (br.readLine() != null) {
				count++;
			}
			System.out.println(file.getName()+"������Ϊ:" + count);
			br.close();
		}else {
			System.out.println("�ļ�������");
		}
	}
}
