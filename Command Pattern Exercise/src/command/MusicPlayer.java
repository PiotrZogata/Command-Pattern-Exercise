package command;

import java.util.Arrays;
import java.util.List;

public class MusicPlayer {

	List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3"); 
	
	int currentTrackNumber = 0; 
	
	
	
	void playFirstTrack(){
		
		currentTrackNumber = 0;
		
		System.out.println("Gram pierwszy utwór: " + tracks.get(currentTrackNumber));
		
	}
	
	void playNextTrack() {
		 currentTrackNumber++;
		 if (currentTrackNumber > 2) {
		   currentTrackNumber = 0;
		 }
		 System.out.println("Gram kolejny utwór: " + tracks.get(currentTrackNumber));
	}
	
	void playRandomTrack() {
		
		int currentTrackNumber = (int) (Math.random()*3);
		System.out.println("Gram losowy utwór: " + tracks.get(currentTrackNumber));
		
	}
	
}
