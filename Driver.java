import java.io.UnsupportedEncodingException;
import java.util.*;
public class Driver {
	public static void main(String[] args) throws Exception {
		Connect conn = new Connect();
		Actor act1, act2;
		
		System.out.println("Enter an actors name: ");
		Scanner n = new Scanner(System.in);
		String searchString = n.nextLine();
		n.close();
		
		String actorOneURL = conn.getSearchURL(searchString);
		
		System.out.println(actorOneURL);

		
		String actorOneInfo = conn.readURL(actorOneURL);
		
		System.out.println(actorOneInfo);
		
		act1 = new Actor(Parser.getActorID(Parser.getResults(actorOneInfo)), searchString);
		
		System.out.println(act1.id);
		System.out.println(act1.name);

		
		
	

	//todo: add second actor
	}

}
