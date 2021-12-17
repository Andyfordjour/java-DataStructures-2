/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosong;

import java.util.Scanner;

/**
 *
 * @author fordj
 */
public class DemoSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String songTitle;
        String artist;
        int lengthInSeconds;
        
        //scanner object
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter Song Title: ");
        songTitle = keyboard.nextLine();
        
        System.out.println("Enter artist: ");
        artist = keyboard.nextLine();
        
        System.out.println("Enter lenght In Second: ");
        lengthInSeconds = keyboard.nextInt();
        
        //passing data as an argument to the constructor 
        Song newSong = new Song(songTitle, artist, lengthInSeconds);
        
        //display result 
        System.out.println("Song Title: "+ newSong.getSongTitle());
        System.out.println("Artist: "+ newSong.getArtist());
        System.out.println("Length(seconds): "+ newSong.getLengthInSeconds());
        
        
        System.out.println("\n Now \n");
        
        //second call of setters
        newSong.setSongTitle( newSong.getSongTitle() + " Live" );
        newSong.setArtist( newSong.getArtist() + " unplugged");
        newSong.setLengthInSeconds( newSong.getLengthInSeconds() + 120 );
        
        //Display second setters
        System.out.println("Song Title: "+ newSong.getSongTitle());
        System.out.println("Artist: "+ newSong.getArtist());
        System.out.println("Length(seconds): "+ newSong.getLengthInSeconds());
        
    }
    
}
