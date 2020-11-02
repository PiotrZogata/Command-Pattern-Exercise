package command;

public class PlayFirstTrack implements MusicPlayerCommand {

	MusicPlayer musicPlayer;
	
	
	public PlayFirstTrack(MusicPlayer musicPlayer){
		this.musicPlayer =musicPlayer;
	}
	
	
	@Override
	public void play() {
		 musicPlayer.playFirstTrack();
	}

}
