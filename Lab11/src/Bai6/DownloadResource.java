/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author nauq2
 */
public class DownloadResource {

    public DownloadResource() {
    }
    public long download(URL url,String destinationFilePath) throws Exception
    {
        long bytes = 0;
        FileOutputStream fos = new FileOutputStream(destinationFilePath);
        int len = 512;
        InputStream is = url.openStream();
        byte[] buffer = new byte[512];
        while (is.available()!=0) {            
            len = is.read(buffer);
            bytes+=len;
            fos.write(buffer,0,len);
        }
        fos.close();
        return bytes;
    }
}
