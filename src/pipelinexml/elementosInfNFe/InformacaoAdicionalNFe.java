/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

import pipelinexml.elementosInfNFe.InformacaoAdicional.InformacaoComplementar;

/**
 *
 * @author maeda
 */
public class InformacaoAdicionalNFe {

    private InformacaoComplementar infCpl = new InformacaoComplementar();

    public InformacaoAdicionalNFe() {
    }
    


    public InformacaoComplementar getInfCpl() {
        return infCpl;
    }

    public void setInfCpl(InformacaoComplementar infCpl) {
        this.infCpl = infCpl;
    }
    
    
}
