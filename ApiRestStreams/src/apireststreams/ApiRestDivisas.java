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
        JSONObject jsonObject = casasCambio.getJSONObject(0);
        JSONObject jsonObjectChild = jsonObject.getJSONObject("casa");
        System.out.println(jsonObjectChild.toString());
        //convert json results to array
        System.out.println("compra: "+jsonObjectChild.getString("nombre"));
        
    }

}
