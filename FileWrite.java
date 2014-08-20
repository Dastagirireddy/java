package com.javaexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite
{

	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:/Filewrite.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("hii!!!");
		fw.close();
		System.out.println("Done");
	}

}
