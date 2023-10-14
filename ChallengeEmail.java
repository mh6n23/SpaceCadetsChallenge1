import java.io.BufferedReader;
import java.io.IOException ;
import java.io.InputStreamReader;
import java.net.* ;

public class ChallengeEmail
{
    public static void main (String[] args) throws IOException
    {

        //Set up the buffered reader and take in the email ID from the console
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.print("Enter email ID: ") ;
        String emailID = in.readLine() ;

        //Add the email ID to the web address, put it in the URL object then read the URL using buffered reader
        String webAddress = "https://www.southampton.ac.uk/people/" + emailID ;
        URL myURL = new URL(webAddress);
        in = new BufferedReader(new InputStreamReader(myURL.openStream()));

        //Goes through each line of the URL until the end is reached
        String line ;
        while ((line = in.readLine()) != null)
        {
            //If the line is reached with the person's name, extract it and print it out

            /*
            if (line.contains("\"name\": ") && !line.contains("University of Southampton"))
            {
                System.out.println(line.substring(21, line.length() - 1).replaceAll("\"", "")) ;
            }
            */

            System.out.println(line) ;
        }

        //Close the buffered reader
        in.close() ;

    }
}
