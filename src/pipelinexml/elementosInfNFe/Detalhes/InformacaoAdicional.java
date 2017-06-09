/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe.Detalhes;

/**
 *
 * @author maeda
 */
class InformacaoAdicional {
    
    private String infCpl;

    public InformacaoAdicional(String infAdProd) {
        this.infCpl = infAdProd;
    }

    public String getInfAdProd() {
        return infCpl;
    }

    public void setInfAdProd(String infAdProd) {
        this.infCpl = infAdProd;
    }
    
    
    
}
