/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apireststreams;

/**
 *
 * @author ALVSCHNE
 */
import java.util.ArrayList;
import java.util.List;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import controladores.ConsumeApi;

public class Main {
    public static void main(String[] args) {
        try {
            ConsumeApi ca = new ConsumeApi();
            // JSON de ejemplo
            //String json = "{\"name\": \"Juan\", \"age\": 30, \"isStudent\": true, \"address\": {\"street\": \"Calle 123\", \"city\": \"Bogotá\", \"country\": \"Colombia\"}, \"hobbies\": [\"football\", \"reading\", \"traveling\"]}";
            String json = ca.getJsonCotizaciones();
            
            
            // Parsea el JSON y obtiene el JSONObject
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            
            // Obtiene los valores del JSONObject
            String name = (String) jsonObject.get("name");
            long age = (long) jsonObject.get("age");
            boolean isStudent = (boolean) jsonObject.get("isStudent");
            JSONObject addressObject = (JSONObject) jsonObject.get("address");
            String street = (String) addressObject.get("street");
            String city = (String) addressObject.get("city");
            String country = (String) addressObject.get("country");
            JSONArray hobbiesArray = (JSONArray) jsonObject.get("hobbies");
            List<String> hobbiesList = new ArrayList<>();
            for (int i = 0; i < hobbiesArray.size(); i++) {
                hobbiesList.add((String) hobbiesArray.get(i));
            }
            
            List<JSONObject> listJson = new ArrayList<JSONObject>();
            /*
            JSONObject jsonObject = new JSONObject("MyJSON");
JSONArray jsonArray = jsonObject.getJSONArray("lstOfficialDocuments");
CargarArray(jsonArray);


public void CargarArray(JSONArray jsonArray){
ArrayList<String> Lista = new ArrayList<>();
    for(int i=0;i<jsonArray.length();i++){
        try {
            JSONObject json = jsonArray.getJSONObject(i);
            //Aquí se obtiene el dato y es guardado en una lista
            Lista.add(json.getString("name"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
            */
            
            // Imprime los valores del JSONObject
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Is student: " + isStudent);
            System.out.println("Street: " + street);
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
            System.out.println("Hobbies: " + hobbiesList.toString());
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}

