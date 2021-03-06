
import bsoft.Utils.*;

public class Main{
	public static void main(String[] args){
		String init = "[2,false,'car',{'name' : 'Okelekele Nobel Bobby', 'gender':'male', 'profession':'Game Development', 'isSingle': true, 'age': 13}]";
		try{
			JSONArray legacyJson = new JSONArray(init); //old and flawed way of creating json objects
			
			JSON json = JSON.parse(init); // my own method of creating json objects, less error prawn
			for(int i = 0; i < json.size(); i++){
				if(json.get(i) instanceof JSONObject){
					System.out.println(((JSONObject)json.get(i)).get("name"));
					System.out.println(((JSONObject)json.get(i)).get("gender"));
					System.out.println(((JSONObject)json.get(i)).get("profession"));
					System.out.println(((JSONObject)json.get(i)).get("isSingle"));
					System.out.println(((JSONObject)json.get(i)).get("age"));
				}else{
					System.out.println(json.get(i));
				}
			}
			System.out.println(json);
		}catch(JSON.JSONException ex){
			ex.printStackTrace();
		}
	}
}
