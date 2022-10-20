import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Average each row of ten test scores
 */
public class ScannerReadCSVFile
{
    public void run() throws FileNotFoundException {
        // Mr. Jaffe's code to read data from a file
        // Instantiate a File object
        File dataFile = new File("TestScoresByClass.csv");

        // Instantiate a Scanner object that uses the file
        Scanner scanner = new Scanner(dataFile);

        // Set the delimiter as a new-line character so we can read the
        // data one line at a time
        scanner.useDelimiter("\n");

        // Continue while there's still data in the file to be read
        while (scanner.hasNext()) {
            // Read the next line of the file
            String line = scanner.nextLine();
            Scanner nums = new Scanner(line);
            nums.useDelimiter(",");
            while (nums.hasNext())
            {
                String number = nums.next();
                String[] arr = new String[11];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = number;
                }
                String classsec = arr[0];
                String[] scores = Arrays.copyOfRange(arr, 1, 11);
                int add = 0;
                int tempstore;
                for (int a = 0; a < scores.length; a++) {
                    tempstore = Integer.parseInt(scores[a]);
                    add += tempstore;
                    tempstore = 0;
                }
                float avg = (float) add / scores.length;
            }

            // line now contains a line of comma-separated numbers
            // representing 10 test scores for each class.
            //
            // Your job is to parse the numbers into individual test scores using
            // another Scanner variable using a comma as the delimiter.  
            // 
            // Read the ten test scores and average them together.  The first
            // number is the class number and the next 10 numbers are the 
            // test scores.  
            //
            // You need to compute the average and print for each class the class
            // number, then the average score.  The first few lines should look
            // like this:
            //
            // Class: Avg score
            // 2125:  55
            // 1628:  47
            //
            // Pay attention to the spacing on your output
            //
            // Write your code in the space below!
            
            
            
            
        }
    }

    public static void main (String[] args) {
        try {
            ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");

        }
    }
}
