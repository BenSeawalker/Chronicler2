
package com.gdx.Chronicler.Utils;

/**
 *
 * @author gfleischer
 */
import java.io.*;
import java.security.MessageDigest;

public class MD5Checksum {

    public static String Get(String filename) {
        byte[] b = CreateChecksum(filename);
        String result = "";

        for (int i=0; i < b.length; i++) {
            result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
   }
    
    
   @SuppressWarnings("UseSpecificCatch")
   private static byte[] CreateChecksum(String filename) {
        try {
            InputStream fis =  new FileInputStream(filename);

             byte[] buffer = new byte[1024];
             MessageDigest complete = MessageDigest.getInstance("MD5");
             int numRead;

             do {
                 numRead = fis.read(buffer);
                 if (numRead > 0) {
                     complete.update(buffer, 0, numRead);
                 }
             } while (numRead != -1);

             fis.close();
             return complete.digest();
        } catch (Exception e) {

        }
       
        return null;
   }
}
