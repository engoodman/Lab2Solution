

package pokerBase;
import java.util.UUID;


public class Player { 
	//Attributes: PlayerID, PlayerName, PlayerPosition(int)
	//Methods: constructor, setters/getters
	//Generate a UUID
	
	UUID uuid = UUID.randomUUID();
	String randomUUIDString = uuid.toString();
	System.out.println("Your player ID is: " + randomUUIDString);
	
	
	
}
