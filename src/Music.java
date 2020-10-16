/**
 * Music class represents a single music with its address, singer and release date
 * @author alireza karimi
 * @version 1.0.0
 */
public class Music {
	private String address;
	private String singer;
	//release year
	private int year;
	
	/**
	 * printing all information about this music
	 */
	public void printInfo(){
		System.out.println("Music Address:");
		System.out.println(address);
		System.out.println("Music Singer:");
		System.out.println(singer);
		System.out.println("Music Release Year:");
		System.out.println(year);
	}
	
	/**
	 * getting address of music
	 * @return address of music
	 */
	public String getAddress(){
		return address;
	}
	
	/**
	 * setting address of music
	 * @param address address of music
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * getting singer of music
	 * @return singer of music
	 */
	public String getSinger(){
		return singer;
	}
	
	/**
	 * setting singer of music
	 * @param singer singer of music
	 */
	public void setSinger(String singer){
		this.singer = singer;
	}
	
	/**
	 * setting release year of music
	 * @param year release year of music
	 */
	public void setYear(int year){
		this.year = year;
	}
	
	
}
