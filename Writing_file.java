package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing_file {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Griesh Mehndiratta\\abc.txt");
		f.createNewFile();
		f.mkdirs();
		FileInputStream fin=new FileInputStream(f);
		
		File f1=new File("C:\\Users\\Griesh Mehndiratta\\xyz.txt");
		f1.createNewFile();
		f1.mkdirs();
		FileOutputStream fout=new FileOutputStream(f1);
		
		int ch;
		try {
		
		while((ch=fin.read())!=-1)
		{
			fout.write((char)ch);
		}
		}
		catch(IOException E)
		{
			System.out.println("Error");
		}
		finally
		{
			fin.close();
			fout.close();
		}
		
		
	}

}
