/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import pipelinexml.corpoNFe.Signature;
import pipelinexml.corpoNFe.infNFe;

/**
 *
 * @author maeda
 */
public class NotaFiscalEletronica {
    
    private infNFe infNFe;
    private Signature Signature;

    public NotaFiscalEletronica(infNFe infNFe, Signature Signature) {
        this.infNFe = infNFe;
        this.Signature = Signature;
    }

    public infNFe getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(infNFe infNFe) {
        this.infNFe = infNFe;
    }

    public Signature getSignature() {
        return Signature;
    }

    public void setSignature(Signature Signature) {
        this.Signature = Signature;
    }
    
    
    
}
