import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class InputOutputStream {
	
	public void transferContents() throws IOException{
		File in = new File("abc.txt");
		File out = new File("xyz.txt");
		in.createNewFile();
		out.createNewFile();
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		//String str = ""; 
		try {
			inputStream = new FileInputStream(in);
			outputStream = new FileOutputStream(out);
			int ch;
			System.out.print("Printing contents of abc.txt in console for verification : ");
			while((ch = inputStream.read()) != -1) {
				outputStream.write(ch);
				System.out.print((char)(ch));
				//str = str + (char)ch;
			}
		}
		catch(IOException e) {
			System.out.println("Error");
		}
		finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		InputOutputStream obj = new InputOutputStream();
		obj.transferContents();
	}

}
