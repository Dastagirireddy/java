package com.javaexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ConvertToZIP 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		byte[] buffer = new byte[1024];
		 
    	try{
 
    		//ZIP FileName
    		FileOutputStream fos = new FileOutputStream("E://Stu.zip");
    		ZipOutputStream zos = new ZipOutputStream(fos);
    		
    		//ZIP Folder contains Student99 file
    		ZipEntry ze= new ZipEntry("Student99.java");
    		zos.putNextEntry(ze);
    		
    		//Choose the file you want to make the ZIP
    		FileInputStream in = new FileInputStream("E://Student.java");
 
    		int len;
    		while ((len = in.read(buffer)) > 0) 
    		{
    			zos.write(buffer, 0, len);
    		}
 
    		in.close();
    		zos.closeEntry();
 
    		//remember close it
    		zos.close();
 
    		System.out.println("Done");
 
    	}
    	catch(IOException ex)
    	{
    	   ex.printStackTrace();
    	}
	}

}
