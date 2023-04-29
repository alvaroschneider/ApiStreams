/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apireststreams;

import controladores.ConsumeApi;
import org.json.JSONArray;
//import java.util.ArrayList;
//import java.util.List;
//import org.json.simple.*;
//import org.json.simple.parser.JSONParser;
import org.json.JSONObject;

public class ApiRestDivisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo - es un consume api rest");
        ConsumeApi ca = new ConsumeApi();

        String json = ca.getJsonCustom("https://www.dolarsi.com/api/api.php?type=valoresprincipales");
        //String json = ca.getJsonCustom("https://api.rawg.io/api/platforms?key=bf61e2970a4d4af8b77dac08fbc273f4");
        //json = json.replace("[", "");
        //json = json.replace("]", "");
        //System.out.println("replace: " + json);
        //json = json.trim();
        //System.out.println("trim: " + json);
        
        JSONArray casasCambio = new JSONArray(json);
        
        JSONObject jsonObject = new JSONObject(json);
        System.out.println("jsonObject: " + jsonObject.toString());
        //convert json results to array
        org.json.JSONArray jsonArray = jsonObject.getJSONArray("casa");

        //from jsonArray name PC get games names
        JSONObject jsonObject2 = jsonArray.getJSONObject(0);
        //get games names
        JSONArray jsonArray2 = jsonObject2.getJSONArray("casa");
        //iterate over jsonArray2 and print names
        for (int i = 0; i < jsonArray2.length(); i++) {
            System.out.println(jsonArray2.getJSONObject(i).getString("nombre"));
        }
    }

}
