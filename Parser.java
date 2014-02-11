import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class Parser {
	
	public Parser(){
		
	}
	
	public static JSONArray getResults(String info){
		JSONObject total = JSONObject.fromObject(info);
		JSONArray results = (JSONArray) total.get("results");
		return results;
	}
	
	public static String getActorID(JSONArray results){
		JSONObject result;
		String id = null;
		
		for(int i=0; i < results.size(); i++){
	    	result = results.getJSONObject(i);
	    	id = result.getString("id");
		}

    	return id;
	}
	
	
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