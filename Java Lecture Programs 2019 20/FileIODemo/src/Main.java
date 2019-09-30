import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			FileReader fr=
					new FileReader("E:\\javapsrp\\sample.txt");
			FileWriter fw=
					new FileWriter("E:\\javapsrp\\sample2.txt");

			System.out.println("#"+(char)fr.read());
			System.out.println("#"+(char)fr.read());
			
			int ch;
			while((ch=fr.read())!=-1) {
				//System.out.print((char)ch);
				fw.write(ch);
			}
			
			fr.close();
			fw.flush(); // 1
			fw.close();
			
			fw.flush();
			fw.close(); // 2
			fr.close();
			
*/		
			/*
			FileInputStream fis=
					new FileInputStream("E:\\javapsrp\\1.pdf"); 
			
			FileOutputStream fos=
					new FileOutputStream("E:\\javapsrp\\2.pdf");
			
			int ch;
			while((ch=fis.read())!=-1) {
				//System.out.print((char)ch);
				fos.write(ch);
			}
			
			fis.close();
			fos.flush();
			fos.close();
	*/		
		
			/*BufferedReader br
				=new BufferedReader(new FileReader("E:\\javapsrp\\sample.txt"));
			
			String str="";
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			//System.out.println(br.readLine());
			*/
			
			BufferedReader br
			=new BufferedReader(new InputStreamReader(System.in));
		
			String input="";
			System.out.println("Enter some text...");
			
			input=br.readLine();
			
			System.out.println(input.toUpperCase());
			
			System.out.println("END");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
