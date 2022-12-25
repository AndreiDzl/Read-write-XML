
package mainpackage;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class XMLReadWrite {
    
    public void readXML(String fileName){
        try {
            FileInputStream fis = new FileInputStream(fileName);
            XMLDecoder decoder = new XMLDecoder(fis);
           Person p  = (Person) decoder.readObject();
            System.out.println(p);
            decoder.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void writeXML(String fileName,Person p){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(p);
            encoder.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
