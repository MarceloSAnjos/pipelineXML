/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

/**
 *
 * @author maeda
 */
public class Destinatario {
    
    private String xNome; // Razão Social ou Nome
    private String CPF; // CPF do destinatario
    private String indIEDest; // Indicador da Inscrição Estadual do destinatário

    
    public Destinatario(String xNome, String CPF, String indIEDest) {
        this.xNome = xNome;
        this.CPF = CPF;
        this.indIEDest = indIEDest;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIndIEDest() {
        return indIEDest;
    }

    public void setIndIEDest(String indIEDest) {
        this.indIEDest = indIEDest;
    }


    

}
