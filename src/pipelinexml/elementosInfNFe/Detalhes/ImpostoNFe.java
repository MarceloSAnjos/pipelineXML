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
public class ImpostoNFe {
    
    private IcmsNFe ICMS;
    private IpiNFe IPI;
    private PisNFe PIS;
    private CofinsNFe COFINS;
    private IcmsUfDest ICMSUFDest;

    public ImpostoNFe(IcmsNFe ICMS, IpiNFe IPI, PisNFe PIS, CofinsNFe COFINS, IcmsUfDest ICMSUFDest) {
        this.ICMS = ICMS;
        this.IPI = IPI;
        this.PIS = PIS;
        this.COFINS = COFINS;
        this.ICMSUFDest = ICMSUFDest;
    }

    public IcmsNFe getICMS() {
        return ICMS;
    }

    public void setICMS(IcmsNFe ICMS) {
        this.ICMS = ICMS;
    }

    public IpiNFe getIPI() {
        return IPI;
    }

    public void setIPI(IpiNFe IPI) {
        this.IPI = IPI;
    }

    public PisNFe getPIS() {
        return PIS;
    }

    public void setPIS(PisNFe PIS) {
        this.PIS = PIS;
    }

    public CofinsNFe getCOFINS() {
        return COFINS;
    }

    public void setCOFINS(CofinsNFe COFINS) {
        this.COFINS = COFINS;
    }

    public IcmsUfDest getICMSUFDest() {
        return ICMSUFDest;
    }

    public void setICMSUFDest(IcmsUfDest ICMSUFDest) {
        this.ICMSUFDest = ICMSUFDest;
    }
    
    
    
    
}
