package doc_ghi_file;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Doc_ghi_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner c=new Scanner(System.in);
			FileWriter fw=new FileWriter("docghifile.txt",true);
			String nd=c.nextLine();
				fw.write("nhật ký:\n");
				fw.write(nd+ "\n");
				fw.close();
				
			Scanner docfile=new Scanner(new java.io.File("docghifile.txt"));
			while(docfile.hasNextLine()) {
				System.out.println(docfile.nextLine());
			}
			docfile.close();	
			
		}
		catch(IOException e) {
			System.out.println("Lỗi:"+ e.getMessage());
			
		}
	}

}
