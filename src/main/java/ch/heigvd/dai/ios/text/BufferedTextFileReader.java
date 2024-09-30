package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file using a buffered reader around
 * a file reader. It manages the reader and the buffered reader properly with a try-with-resources
 * block.
 */
public class BufferedTextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (Reader reader = new FileReader(filename, StandardCharsets.UTF_8);
         BufferedReader bufferReader = new BufferedReader(reader);)
    {
     String line;
      while ((line = bufferReader.readLine()) != null) {
        //System.out.print(line + "\n");
      }
    }
    catch (Exception e) {
      throw new UnsupportedOperationException("Please remove this exception and implement this method.");
    }
  }
}
