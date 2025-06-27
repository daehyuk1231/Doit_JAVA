package io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOTest {
	public static void main(String[] args) {
		
		File tempTest = new File("/dev/file/test");
		if (!tempTest.exists())
			tempTest.mkdir();

		for (int i = 0; i < 5; i++) {
			int randNum = (int) (Math.random() * 10000);
			String fileName = String.format("%04d.txt", randNum);
			File newFile = new File(tempTest, fileName);
			if (!newFile.exists())
				newFile.mkdir();
		}

		File tempTest2 = new File("/dev/file/test2");
		if (!tempTest2.exists())
			tempTest2.mkdir();
		
		File testFile = new File("C:/dev/file/test/");
        for(File file : testFile.listFiles()) {
            String newFileName = file.getName().replace(".txt", "");
            File newFile = new File("C:/dev/file/test2/" + newFileName);
            if(!newFile.exists())
                newFile.mkdir();
        }
	}
}
