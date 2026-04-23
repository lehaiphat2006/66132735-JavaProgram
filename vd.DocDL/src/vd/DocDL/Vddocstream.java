package vd.DocDL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;
public class Vddocstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// doc du lieu tu ban phim,khong dung scanner
		//khai bao bien doi tuong inputstreamreader
//		InputStreamReader ipReader =new InputStreamReader(System.in);
		//khai bao bien doi tutong buffer
//		BufferedReader buffReader =new BufferedReader(ipReader);
		//in 1 cau hdan de user biet can lam gi
//		System.out.print("nhap 1 cai gi do:");
		//doc du lieu tu ban phim,cat bien vao chuoi
//		String lineDocDL = buffReader.readLine();
		//in ra dong doc duoc
//		System.out.print(lineDocDL);
//		
		//doc 1 dong du lieu tu file van ban
		//khai bao bien doi tuong doc file
		FileInputStream finput=new FileInputStream("bai doc file.txt");
		//khai bao bien doi tuong inputstreamreader
		InputStreamReader ipReader =new InputStreamReader(finput);
		//khai bao bien doi tutong buffer
		BufferedReader buffReader =new BufferedReader(ipReader);
//		doc 1 dong du lieu tu file,cat bien vao chuoi
		String lineDocD1 = buffReader.readLine();
		//in ra dong doc duoc
		System.out.println(lineDocD1);
		//doc 1 dong du lieu tu file,cat bien vao chuoi
		String lineDocD2 = buffReader.readLine();
		//in ra dong doc duoc
		System.out.println(lineDocD2);
		
	}

}
