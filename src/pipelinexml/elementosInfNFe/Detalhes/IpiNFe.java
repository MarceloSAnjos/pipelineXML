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
public class IpiNFe {
    
    private String cEnq;
    private IpiTrib IPITrib;

    public IpiNFe(String cEnq, IpiTrib IPITrib) {
        this.cEnq = cEnq;
        this.IPITrib = IPITrib;
    }

    public String getcEnq() {
        return cEnq;
    }

    public void setcEnq(String cEnq) {
        this.cEnq = cEnq;
    }

    public IpiTrib getIPITrib() {
        return IPITrib;
    }

    public void setIPITrib(IpiTrib IPITrib) {
        this.IPITrib = IPITrib;
    }
    
    
    
}
