import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class is used to create an object that references another
 * file. It contains method for extracting data from said file.
 *
 *  @version 2.0
 *  @author Matt Green, Lucas Nolting(added some extra catch statements)
 *
 */

public class FileInput {
    private BufferedReader in = null;
    private String fileName;

    /**
     * Constructor that tries to open a file with the given filename.
     * If it can be opened a reader is instanced to be utilized by
     * the classes other methods to navigate a file.
     *
     * @exception FileNotFoundException If encountered the filename, and exception name are printed
     * @exception Exception If any other exceptions are encountered a stack trace is spit out.
     * @param fileName the name of the desired file to be read.
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return The name of the file being read.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * reads and prints out the contents of the file to the console.
     *
     * @exception Exception prints the stacktrace if this exception is encountered
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
            e.printStackTrace();
        }
    }

    /**
     * Reads through a file and returns the line to wherever the method is
     * called so information from the file can be parsed and operated on by
     * the JVM.
     *
     * @exception Exception Will output the exception name and the filename if
     * an exception is encountered.
     * @return The current line being read by the buffer.
     */
    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * Tries to close the file after the read.
     *
     * @exception IOException if an IOException is encountered this method spits out
     * a stack trace.
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
