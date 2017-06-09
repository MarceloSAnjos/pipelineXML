/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.ProtocoloNota;

/**
 *
 * @author maeda
 */
public class InformacaoProtocolo {
    
    private String tpAmb;
    private String verAplic;
    private String chNFe;
    private String dhRecbti;
    private String nProt;
    private String digVal;
    private String cStat;
    private String xMotivo;

    public InformacaoProtocolo(String tpAmb, String verAplic, String chNFe, String dhRecbti, String nProt, String digVal, String cStat, String xMotivo) {
        this.tpAmb = tpAmb;
        this.verAplic = verAplic;
        this.chNFe = chNFe;
        this.dhRecbti = dhRecbti;
        this.nProt = nProt;
        this.digVal = digVal;
        this.cStat = cStat;
        this.xMotivo = xMotivo;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getVerAplic() {
        return verAplic;
    }

    public void setVerAplic(String verAplic) {
        this.verAplic = verAplic;
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public String getDhRecbti() {
        return dhRecbti;
    }

    public void setDhRecbti(String dhRecbti) {
        this.dhRecbti = dhRecbti;
    }

    public String getnProt() {
        return nProt;
    }

    public void setnProt(String nProt) {
        this.nProt = nProt;
    }

    public String getDigVal() {
        return digVal;
    }

    public void setDigVal(String digVal) {
        this.digVal = digVal;
    }

    public String getcStat() {
        return cStat;
    }

    public void setcStat(String cStat) {
        this.cStat = cStat;
    }

    public String getxMotivo() {
        return xMotivo;
    }

    public void setxMotivo(String xMotivo) {
        this.xMotivo = xMotivo;
    }
    
    
    
}
