import java.io.UnsupportedEncodingException;
import java.util.*;
public class Driver {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("Enter an actors name: ");
		String actorOneURL = makeSearchURL();
		
	

	//todo: add second actor
	}
	public static String makeSearchURL() throws UnsupportedEncodingException{
		Scanner n = new Scanner(System.in);
		String searchString = n.nextLine();
		n.close();
		String st = Connect.getSearchURL(searchString);
		return st;
	}
}
