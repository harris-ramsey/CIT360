import java.net.*;
import java.io.*;
//import java.util.*;

public class HttpURL {
    public static void main(String[] args) throws Exception {
        // try and catch for exceptions handling
        try {
            // Set a url as a variabl
            URL url = new URL("http://amazon.com");
            // Create and open the connection
            URLConnection connection = url.openConnection();
            // Create the input stream for the reader
            InputStreamReader inputStrm = new InputStreamReader(connection.getInputStream());
            // Create a buffered reader
            BufferedReader reader = new BufferedReader(inputStrm);
            String inputLine;
            // While loop to read each line of webpage data
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
            // Close the reader to not tie up resources
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("The specified URL is malformed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurs: " + e.getMessage());
        }

    }
}