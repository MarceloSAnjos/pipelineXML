/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

import pipelinexml.total.IcmsTotal;

/**
 *
 * @author maeda
 */
public class TotalNFe {
    
    private IcmsTotal ICMSTot;

    public TotalNFe(IcmsTotal ICMSTot) {
        this.ICMSTot = ICMSTot;
    }

    public IcmsTotal getICMSTot() {
        return ICMSTot;
    }

    public void setICMSTot(IcmsTotal ICMSTot) {
        this.ICMSTot = ICMSTot;
    }
    
    
}
