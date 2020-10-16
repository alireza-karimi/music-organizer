import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author alireza karimi
 * @version 1.0.0
 */
public class MusicCollection{
	
    // An ArrayList for storing the musics.
    private ArrayList<Music> musics;
    // A player for the musics.
    private MusicPlayer player = new MusicPlayer();
    //favorite musics
    private ArrayList<Music> favorites;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection(){
        musics = new ArrayList<>();
        favorites = new ArrayList<>();
    }
    
   /**
    * Add a music to the collection.
    * @param music music
    */
    public void addMusic(Music music){
        musics.add(music);
    }
    
    /**
     * Return the number of musics in the collection.
     * @return The number of musics in the collection.
     */
    public int getNumberOfFiles(){
        return musics.size();
    }
    
    /**
     * printing all information about a music in musics list
     * @param index music index
     */
    public void musicInfo(int index){
    	if(validIndex(index)){
    		musics.get(index).printInfo();
    	}
    	else{
    		System.out.println("Index is not valid!");
    	}
    }
    
    /**
     * Show a list of all the musics in the collection.
     */
    public void allMusicsInfo(){
        for(Music music : musics){
        	music.printInfo();
        }
    }
    
    /**
     * Remove a music from the collection.
     * @param index The index of the music to be removed.
     */
    public void removeMusic(int index){
    	if(validIndex(index)){
    		musics.remove(index);
    		System.out.println("Music was removed successfully!");
    	}
    	else{
    		System.out.println("Index is not valid!");
    	}	
    }

    /**
     * Start playing a music in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the music to be played.
     */
    public void startPlaying(int index){
    	if(validIndex(index)){
    		player.startPlaying(musics.get(index));
    	}
    	else{
    		System.out.println("Index is not valid!");
    	}	     
    }

    /**
     * Stop the player.
     */
    public void stopPlaying(){
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the musics collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index){
    	int size = musics.size();
    	if(index < 0 || index > size - 1){
    		return false;
    	}
    	else{
    		return true;
    	}
       
    }
    
    /**
     * Determine whether the given index is valid for the favorites collection.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndexForFavorites(int index){
    	int size = favorites.size();
    	if(index < 0 || index > size - 1){
    		return false;
    	}
    	else{
    		return true;
    	}
    }
    
    /**
     * searching a term in music addresses and singers
     * @param term desired search term
     */
    public void search(String term){
    	
    	//checking musics with term in their address
    	for(Music music : musics){
    		if(music.getAddress().contains(term)){
    			music.printInfo();
    		}
    	}
    	
    	//checking musics with term in their singer
    	for(Music music : musics){
    		if(music.getSinger().contains(term)){
    			music.printInfo();
    		}
    	}
    }
    
    /**
     * adding a music in this collection to favorites
     * @param index index of favorite music
     */
    public void addToFavorites(int index){
    	
    	if(validIndex(index)){
    		Music music = musics.get(index);
    		favorites.add(music);
    		System.out.println("Music was added to favorites successfully!");
    	}
    	else{
    		System.out.println("Index is not valid!");
    	}
    	
    }
    
    /**
     * removing a music from favorites music of this collection
     * @param index index of favorite music that you want to remove
     */
    public void removeFromFavorites(int index){
    	if(validIndexForFavorites(index)){
    		favorites.remove(index);
    		System.out.println("Music was removed from favorites successfully!");
    	}
    	else{
    		System.out.println("Index is not valid!");
    	}
    }
    
    /**
     * printing all favorite musics
     */
    public void printFavorites(){
    	for(Music music : favorites){
        	music.printInfo();
        }
    }
    
    
}