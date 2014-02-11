import java.util.ArrayList;
import java.util.List;


public class Actor {
	String id, name;
	List<String> movies;
	
	public Actor(String  _id, String _name){
		this.id = _id;
		this.name = _name;
		movies = new ArrayList<String>();
	}
	
	public void addMovies(String tempMovie){
		movies.add(tempMovie);
	}
	
	public void printMovies(){
		for(int i=0; i< movies.size(); i++){
			System.out.println(movies.get(i));
		}
		
	}
}
