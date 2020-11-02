package command;

public class MusicPlayerRemote {

//	Klasa ta powinna posiadaæ jedno pole prywatne typu MusicPlayerCommand o tej 
//	samej nazwie, setter dla tego pola oraz implementacjê metody o nazwie pressButton, 
//	która bêdzie odpowiada³a za przekazywanie komend wybranym metodom z klas komend.
	
	
	MusicPlayerCommand musicPlayerCommand;
	
	

	public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
		this.musicPlayerCommand = musicPlayerCommand;
	}
	
	public void pressButton(){
		musicPlayerCommand.play();
	}
	
}
