/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import java.io.FileWriter;
import java.io.IOException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author maeda
 */
public final class GeradorXstream {

    private static XStream xstream = null;

    private static NotaCompletaNFe nfeProc = new NotaCompletaNFe();
    
    

    public GeradorXstream() throws IOException {
        xstream = new XStream(new DomDriver());
        xstream.ignoreUnknownElements();
        xstream.alias("nfeProc", NotaCompletaNFe.class);
        toXMLFile(nfeProc,"notaXStream");
    }

    public static void toXMLFile(Object objTobeXMLTranslated, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        xstream.toXML(objTobeXMLTranslated, writer);
        writer.close();
    }

    
}
