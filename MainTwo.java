/*
 * Student Name: ANG CHUNYI
 * Student Number: 190429007
 */
import java.io.File;

import java.util.List;
import java.util.Scanner;

public class MainTwo {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean isFile = false;
		
		List<PrintBook>eBooks = PrintBooksParser.parsePrintBookFile("PrintBook.txt");
		System.out.println(eBooks);

			while (isFile == false) {
				
				System.out.print("Enter a valid file name: ");
				String fileName = in.next();
				File inputFile = new File(fileName);
				File printBooks=new File("PrintBooks.txt");
				File audioBooks=new File("AudioBooks.txt");
				
				if (inputFile.exists()) {
					isFile=true;
					System.out.println("File is exist!");
					
					if(inputFile.equals(printBooks)){
						isFile = true;
						List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBooks.txt");
						PrintBooksParser.display(pBooks);
					}else if(inputFile.equals(audioBooks)){
						isFile =true;
						List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
						AudioBooksParser.display(aBooks);
					}
					
				}else if(!inputFile.exists()){
					inputFile=null;
					System.out.println(inputFile);
					System.out.println("File does not exist!");
					
				
			}
		}
	}

}
