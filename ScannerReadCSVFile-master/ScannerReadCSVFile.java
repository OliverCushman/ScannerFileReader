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
        
        int lines = 1; //Holds value for line number

        // Continue while there's still data in the file to be read
        while (scanner.hasNext()) {
            // Read the next line of the file
            String line = scanner.nextLine();
            Scanner nums = new Scanner(line);
            nums.useDelimiter(",");
            int i = 0; //variable for pseudo-for-loop below
            String[] arr = new String[11]; //Array for each value on line
            while (nums.hasNext())
            {
                String numberstr = nums.next();
                arr[i] = numberstr;
                if (i < 11) {
                    i++;
                }
            }
            int sum = 0;
            for (int a = 1; a < arr.length; a++) {
                sum += Integer.parseInt(arr[a]);
            }
            int avg = sum / (arr.length - 1);
            if (lines == 1) {
                System.out.println("Class: Avg score");
            } else {
                System.out.println(arr[0] + ": " + avg);
            }
            lines++;
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
