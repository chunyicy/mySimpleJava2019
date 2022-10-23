/*
 * Student Name: ANG CHUNYI
 * Student Number: 190429007
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioBooksParser {
	private AudioBooksParser(){}

	public static List<AudioBook> parseAudioBookFile(String filename) {
		Scanner in = getScanner(filename);
		if(in == null) {
			return null;
		}
		List<AudioBook> audioBooks = new ArrayList<AudioBook>();
		while(in.hasNextLine()) {
			String line = in.nextLine();
			AudioBook aBook = parseAudioBook(line);
			audioBooks.add(aBook);
		}
		in.close();
		return audioBooks;
	}
	
	private static Scanner getScanner(String filename) {
		Scanner in = null;
		
		try {
			in = new Scanner(new FileInputStream(filename), "UTF-8");
		} catch (IOException e) {
			System.err.println("File "+filename+" does not exist.");
			return null;
		} 
		//two non-book lines to skip:
		in.nextLine();
		in.nextLine();
		
		return in;
	}

	private static AudioBook parseAudioBook(String line) {
		//statements missing
		String[] text=line.trim().split(";");
		String author=text[0];
		String title=text[1];
		String genre=text[2];
		String publisher=text[3];
		int yearOfPub=(int) Double.parseDouble(text[4]);
		String asin=text[5];
		String narrator=text[6];
		String listenT=text[7];
		int sales=(int) Double.parseDouble(text[8]);
		String [] text7=listenT.trim().split("\\s+");
		int hours=Integer.parseInt(text7[0]);
		int minutes =Integer.parseInt(text7[3]) ;
		Duration listenTime=new Duration(hours,minutes);
		AudioBook audioBook=new AudioBook(asin,narrator,listenTime,author,title,genre,publisher,yearOfPub);
		audioBook.setSales(sales);
		return audioBook;
		
	}
	
	public static void display(List<AudioBook> aBooks){
		for(AudioBook ab : aBooks)
		System.out.println(ab);
	}
		
	public static void main(String[] args) {
		//main for testing this class
		List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
		display(aBooks);
	}

}
