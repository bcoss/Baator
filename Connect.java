
import java.net.*;
import java.io.*;

import net.sf.json.*;

import java.util.*;

import javax.swing.JOptionPane;

import org.apache.commons.lang.exception.*;
//nzsv4hrujnyxsn2g747bvcz6 -- rottentomatoes
// b59fb8bc4118e8423f340c9fbd63f4de -- tmdb
//https://api.themoviedb.org/3/movie/550?api_key=b59fb8bc4118e8423f340c9fbd63f4de

public class Connect {
private static final String apiCode = "b59fb8bc4118e8423f340c9fbd63f4de";




	public String getSearchURL(String searchString) throws Exception{
		String x = "https://api.themoviedb.org/3/search/person?api_key=" +apiCode+ "&query="+ 
		URLEncoder.encode(searchString, "ISO-8859-1");
		x.concat(searchString);	
		return x;	
    }
	
	public String getMovieListURL(String id) throws Exception{
		String x = "https://api.themoviedb.org/3/person/"+id+"/movie_credits?api_key=" +apiCode;
		x.concat(id);	
		return x;	
	}
	


	//given code reads URL 
    public String readURL(String webservice) throws Exception {
    	URL oracle = new URL(webservice);
    	BufferedReader in = new BufferedReader(
        new InputStreamReader(
        oracle.openStream()));

    	String inputLine;
    	String result = "";

    	while ((inputLine = in.readLine()) != null)
    		result = result + inputLine;

    	in.close();
    	return result;
    }

    
}


