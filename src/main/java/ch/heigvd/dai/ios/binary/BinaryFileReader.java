package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try(InputStream inputStream = new FileInputStream(filename);){
      int b;
      while ((b = inputStream.read()) != -1) {
        //System.out.print((char) b);
      }
    }
    catch(Exception e){
      throw new UnsupportedOperationException("Please remove this exception and implement this method.");
    }

  }
}
