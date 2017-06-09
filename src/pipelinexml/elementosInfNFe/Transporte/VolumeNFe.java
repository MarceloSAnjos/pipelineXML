/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe.Transporte;

/**
 *
 * @author maeda
 */
public class VolumeNFe {
    
    private String qVol; //Quantidade de volumes
    private String pesoL; // Peso Liquido
    private String pesoB; // Peso Bruto

  
    public String getqVol() {
        return qVol;
    }

    public void setqVol(String qVol) {
        this.qVol = qVol;
    }

    public String getPesoL() {
        return pesoL;
    }

    public void setPesoL(String pesoL) {
        this.pesoL = pesoL;
    }

    public String getPesoB() {
        return pesoB;
    }

    public void setPesoB(String pesoB) {
        this.pesoB = pesoB;
    }

    public VolumeNFe(String qVol, String pesoL, String pesoB) {
        this.qVol = qVol;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
    }
    
    
    
    
    
}
