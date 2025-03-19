// How to read a file using Java (3 popular options)

// BufferedReader + FileReader = Best for reading text files line-by-line
// FileInputStream = Best for binary files (e.g., images, audio files)
// RandomAcessFile = Best for read/write specific portions of large files

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
         
        String filePath = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Desktop\\test.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("The file was found");
            
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
