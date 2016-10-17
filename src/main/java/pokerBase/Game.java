package pokerBase;
import java.util.UUID;
import java.util.ArrayList;

public class Game {
	//Generate a Game UUID
	UUID uuid = UUID.randomUUID();
	String randomUUIDString = uuid.toString();
	System.out.println("Game ID: "+randomUUIDString);
	
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	

}
