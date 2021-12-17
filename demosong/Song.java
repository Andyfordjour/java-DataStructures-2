// you may need to change this: package csit254pl01javareviews21;
package demosong;
/**
 * Song class for Lab 1, CISY 254 Data Structures
 *
 * @author Stephen T. Brower
 */
public class Song {

    private String songTitle;
    private String artist;
    private int lengthInSeconds;

    /**
     * Constructor
     *
     * @param initalSongTitle value for songTitle field
     * @param initalArtist value for artist field
     * @param initalLengthInSeconds value for lengthInSeconds field
     */
    public Song(String initalSongTitle, String initalArtist, int initalLengthInSeconds) {
        songTitle = initalSongTitle;
        artist = initalArtist;
        lengthInSeconds = initalLengthInSeconds;
    }

    /**
     * getSongTitle method returns value from songTitle field
     *
     * @return value from songTitle field
     */
    public String getSongTitle() {
        return songTitle;
    }

    /**
     * getArtist method returns value in artist field
     *
     * @return value in artist field
     */
    public String getArtist() {
        return artist;
    }

    /**
     * getLengthInSeconds method returns the value in the lengthInSeconds field
     *
     * @return value in the lengthInSeconds field
     */
    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    /**
     * setSongTitle sets a new value for songTitle field
     *
     * @param newSongTitle new value for songTitle field
     */
    public void setSongTitle(String newSongTitle) {
        songTitle = newSongTitle;
    }

    /**
     * setArtist method sets a new value in artist field
     *
     * @param newArtist new value for artist field
     */
    public void setArtist(String newArtist) {
        artist = newArtist;
    }

    /**
     * setLengthInSeconds method sets a new value for lengthInSeconds field
     *
     * @param newLengthInSeconds new value for lengthInSeconds field
     */
    public void setLengthInSeconds(int newLengthInSeconds) {
        lengthInSeconds = newLengthInSeconds;
    }

}
