import java.io.*;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class ReplaceId {
    public static String s;
    public static String foid;
    public String path;
    public void replace() throws IOException {
       path = "C:\\Users\\Indraja\\IdeaProjects\\PracticeJava\\Sample.txt";
        BufferedReader buf = new BufferedReader(new FileReader(path));
        while((s = buf.readLine())!= null){

            //foid = s.replace("2020301409300041","20203737893939");
            foid =  s.replaceAll("2020301409300041","20203737893939");
            FileWriter fw = new FileWriter(path);
            fw.write(foid);
            fw.close();

       }



    }

    public static void main (String args[]) throws IOException {
        ReplaceId replaceId = new ReplaceId();
        replaceId.replace();


    }
}
