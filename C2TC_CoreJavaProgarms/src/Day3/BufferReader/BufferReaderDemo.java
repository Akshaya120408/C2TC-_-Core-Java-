package Day3.BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		//String content = br.readLine(); ----> prints the content in a line alone
		String content;
		while((content = br.readLine())!=null) {
			System.out.println(content);
		}
	}
}
