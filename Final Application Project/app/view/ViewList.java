import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ViewList implements Runnable {

    public void run() {
        System.out.println(list());
    }

    public String list() {
        StringBuilder json = new StringBuilder();
        try {
            URL url = new URL("https://userdb-b64f9.firebaseio.com/UserList.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStreamReader inputStream = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStream);
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                json.append(inputLine);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("Malfunction " + e);
        } /*catch (IOException ex) {
            System.out.println("An I/O erroc occur " + e);
        }*/
        fromJson(json.toString());
    }

    public void fromJson(String jString) {
        Object obj = new JSONParser().parse(jString);
        JSONObject jsonObj = (JSONObject) obj;

        User[] users = jsonObj;
        for (User user: users) {
            Log.d("User", user.getName() + user.getEmail());
        }
    }
}