package Search;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class search{
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Search\\Data.txt"));
            String line;
            List<String> eachLine = new ArrayList<>();
            int i =0;
            while ((line = reader.readLine()) != null) {
                eachLine.add(line);
                System.out.println(line);
            }
            HashMap<Integer, List<String>> eachWordMappedLine =  new HashMap<>();
            for(String s: eachLine){
                List<String> words = Arrays.asList(s.split(" "));
                eachWordMappedLine.put(i, words);
                i++;
            }
            reader.close();
            System.out.println(eachWordMappedLine);
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the word to search.");
            String target = inputReader.readLine();
            int flag =0;
            for(List<String> s: eachWordMappedLine.values()){
                if(flag==1){
                    break;
                }
                for(String word : s){
                    
                    if(word.equalsIgnoreCase(target)){
                        System.out.println("Match Found");
                        flag = 1;
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
