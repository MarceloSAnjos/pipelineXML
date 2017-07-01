/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import pipelinexml.elementosInfNFe.IdentificadorNFe;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author maeda
 */
public class GeradorJAXB {
    
    private static final String FILE_NAME = "notaComJAXB.xml";
    


    public GeradorJAXB(){
        
        
    }


    public static void jaxbObjectToXML(NotaCompletaNFe nota) {

        try {
            JAXBContext context = JAXBContext.newInstance(NotaCompletaNFe.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(nota, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
    

