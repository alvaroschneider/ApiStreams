/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apireststreams;

import controladores.ConsumeApiGames;
import org.json.JSONArray;
//import java.util.ArrayList;
//import java.util.List;
//import org.json.simple.*;
//import org.json.simple.parser.JSONParser;
import org.json.JSONObject;

public class ApiRestStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo - es un consume api rest");
        ConsumeApiGames ca = new ConsumeApiGames();
        
        String json = ca.getJsonCotizaciones();
        
        JSONObject jsonObject = new JSONObject(json);
        //convert json results to array
        org.json.JSONArray jsonArray = jsonObject.getJSONArray("results");

        //from jsonArray name PC get games names
        JSONObject jsonObject2 = jsonArray.getJSONObject(0);
        //get games names
        JSONArray jsonArray2 = jsonObject2.getJSONArray("games");
        //iterate over jsonArray2 and print names
        for (int i = 0; i < jsonArray2.length(); i++) {
            System.out.println(jsonArray2.getJSONObject(i).getString("name"));
        } 
    }
    
}
