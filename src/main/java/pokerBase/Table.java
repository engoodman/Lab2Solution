package pokerBase;
import java.util.UUID;
import java.util.ArrayList;

public class Table {
	//Generate a table UUID
	UUID uuid = UUID.randomUUID();
	String randomUUIDString = uuid.toString();
	System.out.println("Table ID:" + randomUUIDString);
	
	private ArrayList<Player>TablePlayers = new ArrayList<Player>();
	
	

}
