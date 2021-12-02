/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author nauq2
 */
public class GetDataURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            DownloadResource dlr = new DownloadResource();
            URL url = new URL("https://th.bing.com/th/id/R.ff88b356f71755c83263041fc6965f87?rik=wO%2bRiwI4zolsrg&pid=ImgRaw&r=0");
            //URL url = new URL("http://cdn2.tstatic.net/tribunnews/foto/bank/images/ShailaSabt.jpg");
            String destinationFilePath = "‪";//c:/a/OIP.jpg
            long bytes = dlr.download(url, destinationFilePath);
            System.out.println(" bytes downloaded");
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
