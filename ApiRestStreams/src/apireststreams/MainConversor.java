/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apireststreams;

/**
 *
 * @author ALVSCHNE
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainConversor {
    public static void main(String[] args) {
        try {
            // URL del API que deseas consumir
            String url = "https://www.dolarsi.com/api/api.php?type=valoresprincipales";
            
            // Crea una conexión HTTP con la URL
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            
            // Configura el método HTTP y los headers necesarios
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            
            // Lee la respuesta del API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            // Imprime la respuesta del API
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
