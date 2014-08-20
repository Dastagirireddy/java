package com.javaexample;

import java.io.IOException;

public class SecondOne 
{

	public static void main(String[] args) throws IOException 
	{
		/*Runtime runtime=Runtime.getRuntime();
		Process process=runtime.exec("javac FirstOne.java");
		Process processRun=runtime.exec("java FirstOne");
		InputStream stderr=processRun.getInputStream();
		InputStreamReader isr=new InputStreamReader(stderr);
		/*int n1;
		char[] c1 = new char[1024];
		StringBuffer standardOutput = new StringBuffer();
		while ((n1 = isr.read(c1)) > 0) 
		{
			standardOutput.append(c1, 0, n1);
		}
		
		System.out.println("Standard Output: " + standardOutput.toString());*/
		
		/*BufferedReader br=new BufferedReader(isr);
		StringBuffer brr=new StringBuffer();
		while(br.readLine()!=null)
			brr.append(br.readLine());
		System.out.println(brr.toString());
		process.destroy();*/
		
		//String s=new String(Student.main(args));
		String s=FirstOne.main(args);
		//ThirdOne.StatusOne(s);
		//System.out.println(s);
		
	}

}
