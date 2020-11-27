package br.com.bandtec.modelo.java;

import br.com.bandtec.modelo.java.Slack;
import org.json.JSONObject;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br>
 */
public class App {

    public static void main(String[] args) throws Exception {

        Slack slack = new Slack();

        JSONObject message = new JSONObject();
        message.put("text", "Teste");
        
        slack.sendMessage(message);

    }
}
