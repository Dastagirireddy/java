package com.javaexample;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
 
public class Test {
 
    private static void printOutput(String name, InputStream ins)
            throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(name + " " + line);
        }
    }
 
    public static void main(String[] args) {
        try {
            String myClass = "class MyJavaClass {"
                    + "public static void main(String[] args) {"
                    + "System.out.println(\"hiiii raaa\");"
                    +"System.err.println(\"worst\");"
                    + "}}";
            FileOutputStream fos = new FileOutputStream("D:/MyJavaClass.java");
            fos.write(myClass.getBytes());
            fos.flush();
            fos.close();
 
            String command1 = "javac D:/MyJavaClass.java";
            String command2 = "java MyJavaClass";
                        //compiling the program
            Process pro = Runtime.getRuntime().exec(command1,
                    new String[] { "CLASSPATH=D:/" });
           //printOutput(command1 + " stdout:", pro.getInputStream());
          // printOutput(command1 + " stderr:", pro.getErrorStream());
            pro.waitFor();
            //System.out.println(command1 + " exitValue() " + pro.exitValue());
                        // running the program
            Process pro1 = Runtime.getRuntime().exec(command2,
                    new String[] { "CLASSPATH=D:/" });
            printOutput(command2 + " stdout:", pro1.getInputStream());
            StringBuffer buf=new StringBuffer();
            while(pro1.getInputStream().read()!=-1)
            {
            	buf.append(pro1.getInputStream().read());
            }
            System.out.println("-------");
            System.out.println(buf);
            System.out.println("-------");
            printOutput(command2 + " stderr:", pro1.getErrorStream());
            pro.waitFor();
            //System.out.println(command2 + " exitValue() " + pro1.exitValue());
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}