
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


	public static void main(String[] args) throws Exception {
	String apiCode = "b59fb8bc4118e8423f340c9fbd63f4de";
	String st = getSearchURL(apiCode);
	
	System.out.println(st);
	//writeOut();
	
	}


	public static String getSearchURL(String apiCode) throws UnsupportedEncodingException{

		Scanner n = new Scanner(System.in);	
		String searchString = n.nextLine();
		n.close();
		
		String x = "https://api.themoviedb.org/3/search/person?api_code=" +apiCode+ "?query="+ 
				URLEncoder.encode(searchString, "ISO-8859-1");
		x.concat(searchString);
		return x;

		
    }

	//given code reads URL 
    public static String readURL(String webservice) throws Exception {
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
    
  
    //writes weather report into the console and output.txt
  /*  public static void writeOut(){
    	BufferedWriter writer = null;
    	

        try
        {
                writer = new BufferedWriter( new FileWriter("output.txt"));
                
                
                
                while(st.isEmpty()==false){       
                    
                	String tempJSON = st.pop();
                	String tempConditions;
                	JSONObject x = JSONObject.fromObject(tempJSON);
                	System.out.println(x);
                	JSONObject weatherData=(JSONObject)(x.get("weatherObservation")); 
                	
                	System.out.println("Station:  " + weatherData.get("stationName"));
                	System.out.println("Temperature (Centigrade):  " + weatherData.get("temperature"));
                	System.out.println("Clouds:  " + weatherData.get("clouds")+"\n");
                	
                	tempConditions = 
                			"Station:			"+weatherData.get("stationName")+".\n"
                			+"Date/Time:			"+weatherData.get("datetime")+"\n"
                			+"Temperature:		"+weatherData.get("temperature")+"° Centigrade.\n"
                			+"Clouds:				"+weatherData.get("clouds")+".\n"
                			+"Dew Point:			"+weatherData.get("dewPoint")+"° Centigrade.\n"
                			+"Wind Speed:			"+weatherData.get("windSpeed")+" Mp/h.\n"
                			+"Humidity:			"+weatherData.get("humidity")+"%.\n";
                	

                	
                	               	
                	writer.write("***********************************************************\n");               	
                	writer.write(tempConditions);
                }
        }

                
        
        catch (IOException e){
        }
        finally{
        	try{
        		if ( writer != null)
        			writer.close( );
        	}
        	catch ( IOException e){
        	}
        }
        }
    */
    
}


