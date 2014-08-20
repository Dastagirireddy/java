package com.javaexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{

	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:/Student.java");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		StringBuffer bf=new StringBuffer();
		while(br.readLine()!=null)
		{
			bf.append(br.readLine()+"\n");
		}
		br.close();
		System.out.println(bf.toString());
	}

}
