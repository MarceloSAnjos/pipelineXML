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

    public ProtocoloNFe() {
        this.infProt = new InformacaoProtocolo("1", "14_0_8",
                 "31161109339936000973550110003363261533957738", "2016-11-03T15:42:57-02:00",
                "131162347528667", "ZXokK2gndKZWk7n4VEesQ5kQkEA=", "100", "Autorizado o uso da NF-e");
        ;
    }

    public InformacaoProtocolo getInfProt() {
        return infProt;
    }

    public void setInfProt(InformacaoProtocolo infProt) {
        this.infProt = infProt;
    }

}
