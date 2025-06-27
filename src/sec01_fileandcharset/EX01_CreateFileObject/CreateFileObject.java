package sec01_fileandcharset.EX01_CreateFileObject;

import java.io.File;

public class CreateFileObject {
	public static void main(String[] args) {

		File tempDir = new File("C:/temp");
		if (!tempDir.exists())
			tempDir.mkdir();
		System.out.println(tempDir.exists());

		File newFile = new File("C:/temp/newFile.txt");
		if (!newFile.exists())
//			newFile.createNewFile();
		System.out.println(newFile.exists());
		System.out.println();

		File newFile2 = new File("C:\\temp\\newFile.txt");
		File newFile3 = new File("C:/temp/newFile.txt");
		File newFile4 = new File("C:" + File.separator + "temp" + File.separator + "newFile.txt");

		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		System.out.println();

		File newFile5 = new File("C:/abc/newFile.txt");
		File newFile6 = new File("C:/abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());

		System.out.println(System.getProperty("user.dir"));
		File newFile7 = new File("newFile1.txt");
		File newFile8 = new File("bcd/newFile2.txt");
		System.out.println(newFile7.getAbsolutePath());
		System.out.println(newFile8.getAbsolutePath());
	}
}
