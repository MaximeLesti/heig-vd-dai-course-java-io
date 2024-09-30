package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * A class that reads binary files. This implementation reads the file using a buffered input
 * stream. It manages the input stream and the buffered input stream properly with a
 * try-with-resources block.
 */
public class BufferedBinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try(InputStream fis = new FileInputStream(filename);
        InputStream bis = new BufferedInputStream(fis);)
    {
      int b;
      while((b = bis.read()) != -1){
        //System.out.print((char)b);
      }
    }
    catch (Exception e) {
      throw new UnsupportedOperationException("Please remove this exception and implement this method.");
    }
  }
}
