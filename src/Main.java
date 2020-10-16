import java.util.Scanner;


public class Main {
	
	private static MusicCollection pop = new MusicCollection();
	private static MusicCollection jazz = new MusicCollection();
	private static MusicCollection rock = new MusicCollection();
	private static MusicCollection country = new MusicCollection();
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static MusicCollection identifyCollection(){
		String category;
		
		while(true){
			System.out.println("Enter Category: (pop / jazz / rock / country)");
			category = scanner.nextLine();
			
			if(category.equals("pop")){
				return pop;
			}
			else if(category.equals("jazz")){
				return jazz;
			}
			else if(category.equals("rock")){
				return rock;
			}
			else if(category.equals("country")){
				return country;
			}		
		}
		
	}
	
	public static void addMusic(MusicCollection collection){
		Music music = new Music();
		
		//setting music address
		System.out.println("Enter music address:");
		String address = scanner.nextLine();
		music.setAddress(address);
		
		//setting music singer
		System.out.println("Enter music singer:");
		String singer = scanner.nextLine();
		music.setSinger(singer);
		
		//setting release year
		System.out.println("Enter music release year:");
		int year = scanner.nextInt();
		music.setYear(year);
		scanner.nextLine();
		
		collection.addMusic(music);
		System.out.println("Music added successfully!");
	}
	
	public static void printMusics(MusicCollection collection){
		collection.allMusicsInfo();
	}
	
	public static void removeMusic(MusicCollection collection){
		int index = 0;
		
		System.out.println("Enter music index:");
		index = scanner.nextInt();
		scanner.nextLine();
		
		collection.removeMusic(index);
	}
	
	public static void playMusic(MusicCollection collection){
		int index = 0;
		
		System.out.println("Enter music index:");
		index = scanner.nextInt();
		scanner.nextLine();
		
		collection.startPlaying(index);
	}
	
	public static void stopMusic(MusicCollection collection){
		
		collection.stopPlaying();
	}
	
	public static void searchMusic(MusicCollection collection){
		String term;
		
		System.out.println("Enter search term:");
		term = scanner.nextLine();
		
		collection.search(term);
	}
	
	public static void addFavorite(MusicCollection collection){
		int index = 0;
		
		System.out.println("Enter favorite music index:");
		index = scanner.nextInt();
		scanner.nextLine();
		
		collection.addToFavorites(index);
	}
	
	public static void printFavorites(){
		pop.printFavorites();
		jazz.printFavorites();
		rock.printFavorites();
		country.printFavorites();
	}
	
	public static void removeFavorite(MusicCollection collection){
		int index = 0;
		
		System.out.println("Enter music index to remove:");
		index = scanner.nextInt();
		scanner.nextLine();
		
		collection.removeFromFavorites(index);
	}
	
	public static void main(String[] args) {
		System.out.println("COMMAND HELP");
		System.out.println("add music");
		System.out.println("add music to my favorites");
		System.out.println("remove music from my favorites");
		System.out.println("print all favorites");
		System.out.println("print musics info");
		System.out.println("remove music");
		System.out.println("play music");
		System.out.println("stop music");
		System.out.println("search music");
		System.out.println("exit");
		
		String input = "true";
		MusicCollection collection;
		
		while(!input.equals("exit")){
			System.out.println("Enter command:");
			input = scanner.nextLine();
			
			if(input.equals("add music")){
				collection = identifyCollection();
				addMusic(collection);
			}
			else if(input.equals("print musics info")){
				collection = identifyCollection();
				printMusics(collection);
			}
			else if(input.equals("remove music")){
				collection = identifyCollection();
				removeMusic(collection);
			}
			else if(input.equals("play music")){
				collection = identifyCollection();
				playMusic(collection);
			}
			else if(input.equals("stop music")){
				collection = identifyCollection();
				stopMusic(collection);
			}
			else if(input.equals("search music")){
				collection = identifyCollection();
				searchMusic(collection);
			}
			else if(input.equals("add music to my favorites")){
				collection = identifyCollection();
				addFavorite(collection);
			}
			else if(input.equals("print all favorites")){
				printFavorites();
			}
			else if(input.equals("remove music from my favorites")){
				collection = identifyCollection();
				removeFavorite(collection);
			}
		}
		
	}

}
