/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

 import java.io.FileWriter;  
 import java.io.IOException;  
 import com.thoughtworks.xstream.XStream;  

/**
 *
 * @author maeda
 */
public final class GeradorXstream {
    
     private XStream xstream = null;  
     private GeradorXstream(){  
         xstream = new XStream();  
         xstream.ignoreUnknownElements(); 
     }
     
        public void toXMLFile(Object objTobeXMLTranslated, String fileName ) throws IOException {  
         FileWriter writer = new FileWriter(fileName);  
         xstream.toXML(objTobeXMLTranslated, writer);  
         writer.close();  
     }  
    
}
