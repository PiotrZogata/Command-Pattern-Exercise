package command;

public class MusicPlayerRemote {

//	Klasa ta powinna posiada� jedno pole prywatne typu MusicPlayerCommand o tej 
//	samej nazwie, setter dla tego pola oraz implementacj� metody o nazwie pressButton, 
//	kt�ra b�dzie odpowiada�a za przekazywanie komend wybranym metodom z klas komend.
	
	
	MusicPlayerCommand musicPlayerCommand;
	
	

	public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
		this.musicPlayerCommand = musicPlayerCommand;
	}
	
	public void pressButton(){
		musicPlayerCommand.play();
	}
	
}
