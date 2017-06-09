/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

/**
 *
 * @author maeda
 */

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "nota")
public class NotaCompletaNFe {

    
    private NotaFiscalEletronica NFe = new NotaFiscalEletronica();
    private ProtocoloNFe protNFe = new ProtocoloNFe();
    
    public NotaCompletaNFe(){};

    public NotaCompletaNFe(NotaFiscalEletronica NFe, ProtocoloNFe protNFe) {
        this.NFe = NFe;
        this.protNFe = protNFe;
    }

    public NotaFiscalEletronica getNFe() {
        return NFe;
    }

    public void setNFe(NotaFiscalEletronica NFe) {
        this.NFe = NFe;
    }

    public ProtocoloNFe getProtNFe() {
        return protNFe;
    }

    public void setProtNFe(ProtocoloNFe protNFe) {
        this.protNFe = protNFe;
    }
    
    
    
}
