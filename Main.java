/*
 * Student Name: ANG CHUNYI
 * Student Number: 190429007
 */
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<PrintBook> pBooks = PrintBooksParser.parsePrintBookFile("PrintBooks.txt");
		PrintBooksParser.display(pBooks);
		
		System.out.println();
		System.out.println("/****************************************************/");
		System.out.println();
		
		List<AudioBook> aBooks = AudioBooksParser.parseAudioBookFile("AudioBooks.txt");
		AudioBooksParser.display(aBooks);
		

		/* COMMENTS:
		 * The PrintBooksParser and AudioBooksParser classes work as expected. I
		 * not sure if I'm supposed to add in the sales in the constructors
		 * because it is missing int sales in the constructor in for example
		 * PublishedBook.java. However, i was managed to use the setSales(int
		 * sales) to extract out the sales information from the text and things
		 * seem to work fine. For the MainTwo class, I not sure if I did
		 * correctly and I don't know if I'm supposed to ask the user for the
		 * file name first then exception handling or the exception handling
		 * first then ask for the correct file name if the user input an invalid
		 * file.
		 */
		
	}   
	
}



