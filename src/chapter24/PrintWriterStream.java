package chapter24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("prinf2.txt"));
		bw.write("가자");
		bw.write("용현아");
		bw.newLine();
		bw.write("제발");
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("./prinf2.txt"));
		while(true){
			String str = br.readLine();
			if(str == null){
				break;
			}
			System.out.println(str);
		}
		br.close();
	}

}
