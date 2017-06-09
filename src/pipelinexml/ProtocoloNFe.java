/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import pipelinexml.ProtocoloNota.*;
/**
 *
 * @author maeda
 */
public class ProtocoloNFe {
    
    private InformacaoProtocolo infProt;

    public ProtocoloNFe(InformacaoProtocolo infProt) {
        this.infProt = infProt;
    }

    public InformacaoProtocolo getInfProt() {
        return infProt;
    }

    public void setInfProt(InformacaoProtocolo infProt) {
        this.infProt = infProt;
    }
    
}
