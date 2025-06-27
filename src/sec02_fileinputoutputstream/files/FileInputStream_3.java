package sec02_fileinputoutputstream.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_3 {
	public static void main(String[] args) throws IOException {

		File inFile = new File("src/sec02_fileinputoutputstream/files/FileInput-Stream2.txt");

		InputStream is2 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[9];
		int count1;
		while ((count1 = is2.read(byteArray1)) != -1) {
			String str = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
			System.out.print(str);
			System.out.println(": count = " + count1);
		}
		is2.close();
		System.out.println();
		System.out.println();

		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is3.read(byteArray2, offset, length);
		String str = new String(byteArray2, 0, offset + count2, Charset.defaultCharset());
		System.out.println(str);
		is3.close();
	}
}
