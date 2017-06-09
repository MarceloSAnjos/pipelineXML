/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import java.io.IOException;

/**
 *
 * @author maeda
 */
public class PipelineXML {

    /**
     * @param args the command line arguments
     */
    
    private static GeradorXstream geradorx;
    
    private static GeradorJAXB geradorj;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        geradorx = new GeradorXstream();
        
        geradorj = new GeradorJAXB();
    }
    
}
