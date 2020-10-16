
/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 * 
 * @author alireza karimi
 * @version 1.0.0
 */
public class MusicPlayer{
	
    // The current player. It might be null.
    private boolean isPlaying;
    
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer(){
        isPlaying = false;
    }
    
    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(Music music){
        System.out.println(music.getAddress() + " by " + music.getSinger() + " is playing...");
		isPlaying = true;
    }
    
    public void stop(){
        System.out.println("player is stopped!");
		isPlaying = false;
    }   

}