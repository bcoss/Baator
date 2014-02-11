import java.io.UnsupportedEncodingException;
import java.util.*;
public class Driver {
	public static void main(String[] args) throws Exception {
		Actor act1, act2;
		act1 = makeActor();
		act2 = makeActor();
		
		for(int i=0; i< act1.movies.size(); i++){
			for(int j=0;j<act2.movies.size();j++){
				if(act1.movies.get(i).contains((act2.movies.get(j)))){
					System.out.println("The two actors have the movie \"" +
							act1.movies.get(i)+ "\"in common");
				}
			}
		}
	

	//todo: add second actor
	}
	
	public static Actor makeActor() throws Exception{
		Connect conn = new Connect();
		Scanner n = new Scanner(System.in);
		String searchString;
		Actor act;

		System.out.println("Enter an actors name: ");
		searchString = n.nextLine();
		
		String actorOneURL = conn.getSearchURL(searchString);
		System.out.println(actorOneURL);
		String actorOneInfo = conn.readURL(actorOneURL);
		
		System.out.println(actorOneInfo);
		
		act = new Actor(Parser.getActorID(Parser.getResults(actorOneInfo)), searchString);
		
		//System.out.println(act.id);
		//System.out.println(act.name);
		
		
		String movieURL = conn.getMovieListURL(act.id);
		
		//System.out.println(movieURL);
		
		String movieInfo = conn.readURL(movieURL);
		
		//System.out.println(movieInfo);
		
		act.movies = Parser.getMovies(Parser.getCastArray(movieInfo));
		//act.printMovies();
		return act;
		
	}
	

}
