package mynio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//InputStream input = ReadLine.class.getResourceAsStream("nioFile.txt");
			//URL url = ReadLine.class.getClass().getClassLoader().getResource("/nioFile.txt");
			
			//System.out.println(url);
			//File file = new File(url.toString());
			
			//File file = new File(ReadLine.class.getClass().getResource("").getPath()+"//nioFile.txt");
			//FileInputStream input = new FileInputStream(file);
			//File file = new File("nioFile.txt");
			//System.out.println(file.exists());
			InputStream input = ReadLine.class.getResourceAsStream("nioFile.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String nameline = reader.readLine();
			
			System.out.println(nameline);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
