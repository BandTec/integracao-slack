package br.com.bandtec.modelo.java;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class Slack {

    private String url = "INSIRA SUA URL AQUI (WEBHOOK)";

    public void sendMessage(JSONObject message) throws Exception {

        URL obj = new URL(this.url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("POST");
        con.setDoOutput(true);

        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(message.toString());

        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        System.out.println("Sending 'POST' request to URL: " + this.url);
        System.out.println("POST parameters: " + message.toString());
        System.out.println("Response Code: " + responseCode);

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;

        StringBuffer response = new StringBuffer();

        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        
        reader.close();
        System.out.println("Success.");
    }
}
