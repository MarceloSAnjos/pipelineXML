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
public class PisNFe {
    private PisAliquota PISAliq;

    public PisNFe(PisAliquota PISAliq) {
        this.PISAliq = PISAliq;
    }

    public PisAliquota getPISAliq() {
        return PISAliq;
    }

    public void setPISAliq(PisAliquota PISAliq) {
        this.PISAliq = PISAliq;
    }

    
    
}
