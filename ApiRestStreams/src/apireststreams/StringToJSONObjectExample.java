/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apireststreams;

//import org.json.simple.*;
import org.json.JSONObject;

public class StringToJSONObjectExample {

    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30}";

        JSONObject jsonObject = new JSONObject(jsonString);

        System.out.println(jsonObject);
    }
}
