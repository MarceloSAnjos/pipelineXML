/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

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
    
    private static final String FILE_NAME = "jaxb-emp.xml";

    public static void main(String[] args) {
        notaFiscal emp = new notaFiscal();
        //SETAR OS VALORES
        
        jaxbObjectToXML(emp);


    }


  


    private static void jaxbObjectToXML(notaFiscal nota) {

        try {
            JAXBContext context = JAXBContext.newInstance(notaFiscal.class);
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
    

