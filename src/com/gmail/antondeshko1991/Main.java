package com.gmail.antondeshko1991;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		MyFileFilter mFF = new MyFileFilter("pdf");
		File folder = new File("D:/�������-20171221T174422Z-001/�������");

		File[] fileList = folder.listFiles(mFF);

		try {
			for (File file : fileList) {
				FileOperation.copyFile(file, new File("D:/" + file.getName()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
