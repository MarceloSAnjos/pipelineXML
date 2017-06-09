/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

import pipelinexml.elementosInfNFe.Endereco;

/**
 *
 * @author maeda
 */
public class Emitente {

    private String CNPJ; // Número do CNPJ
    private String xNome; // Razão Social ou Nome
    private String xFant; // Nome Fantasia
    private String IE; //Inscricao Estadual do Emitente
    private String IEST; //Inscrição Estadual do Substituto Tributário
    private String CRT; // Código do Regime Tributário
    private Endereco enderEmit; // Endereco do emitente

    public Emitente() {
    }

    ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getxFant() {
        return xFant;
    }

    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getIEST() {
        return IEST;
    }

    public void setIEST(String IEST) {
        this.IEST = IEST;
    }

    public String getCRT() {
        return CRT;
    }

    public void setCRT(String CRT) {
        this.CRT = CRT;
    }

    public Endereco getEnderEmit() {
        return enderEmit;
    }

    public void setEnderEmit(Endereco enderEmit) {
        this.enderEmit = enderEmit;
    }

    public Emitente(String CNPJ, String xNome, String xFant, Endereco enderEmit, String IE, String IEST, String CRT) {
        this.CNPJ = CNPJ;
        this.xNome = xNome;
        this.xFant = xFant;
        this.enderEmit = enderEmit;
        this.IE = IE;
        this.IEST = IEST;
        this.CRT = CRT;

    }

}
