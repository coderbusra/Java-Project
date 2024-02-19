package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("D:\\java okul\\BtkAkademiJava\\src\\readingFileDemo\\sayilar.txt"));
			String line= null;
			while((line = reader.readLine()) != null){
			 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try 
			{
				reader.close();
			}catch (Exception exception) {
				
			}
			
		}

	}

}
