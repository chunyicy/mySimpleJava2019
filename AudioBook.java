/*
 * Student Name: ANG CHUNYI
 * Student Number: 190429007
 */
public class AudioBook extends PublishedBook {
		private String asin;
		private String narrator; 
		private Duration listenTime;
		public AudioBook(String asin,String narrator, Duration listenTime,String author, String title,
				String genre, String publisher, int yearOfPub) {
			super(author, title, genre, publisher, yearOfPub);
			this.asin = asin;
			this.narrator = narrator;
			this.listenTime = listenTime;
		}
		public String toString() {
			String s = super.toString();
			s += String.format("ASIN: %s%n", asin);
			s += String.format("Narrator: %s%n", narrator);
			s += String.format("ListenTime: %s%n", listenTime);
			return s;
		}
		public String getAsin() {
			return asin;
		}
		public String getNarrator() {
			return narrator;
		}
		public Duration getListenTime() {
			return listenTime;
		}
		
		public static void main(String[] args){
			String asin="asin";
			String narrator="narrator";
			Duration listenTime=new Duration(01,22);
			String author="author";
			String title="title";
			String genre="genre";
			String publisher="publisher";
			int yearOfPub=2020;		
			AudioBook ab=new AudioBook(asin,narrator,listenTime,author,title,genre,publisher,yearOfPub);
			System.out.println(ab);
		}
}
