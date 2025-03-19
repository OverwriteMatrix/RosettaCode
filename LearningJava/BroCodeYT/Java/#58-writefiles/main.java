// How to write to a file using Java (4 popular options)

// FileWriter = Good for small or medium sized text files
// BufferedWriter = Better performance for large amounts of text
// PrintWriter = Best for structured data like reports or logs
// FileOutputStream = Best for binary files (e.g., images, audio files)

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BroCodeWorkSpace {
    
    public static void main(String[] args) {
         
        String testfilepath = "C:\\Users\\Paxton.Clark\\OneDrive - Leonardo DRS\\Desktop\\test.txt";
        String testfilecontent = "Hello, world!";
        
        try(FileWriter writer = new FileWriter(testfilepath)){      // Auto-creates a file if it doesn't exist can use absolute or relative file paths
            writer.write(testfilecontent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){     // FileNotFound Exception handling check if place exists or if file path is spelled correctly
            System.out.println("Could not locate file location: " + e);
        }
        catch(IOException e){   // General IOException saftey net
            System.out.println("Could not write to file: " + e);
        }
    }
}
