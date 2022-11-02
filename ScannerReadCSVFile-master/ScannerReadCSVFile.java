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
            int sum = 0;
            int sec = 0;
            if (lines == 1) {
                System.out.println("Class section" + ": " + "avg");
            } else {
                while (nums.hasNext()) {
                    int i = nums.nextInt();
                    if (i <= 999) {
                        sum += i;
                    } else {
                        sec = i;
                    }
                }
                System.out.println(sec + ": " + (sum / 10));
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
