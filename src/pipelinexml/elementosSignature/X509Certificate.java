/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosSignature;

/**
 *
 * @author maeda
 */
public class X509Certificate {
    
    private String certificado;

    public X509Certificate(String certificado) {
        this.certificado = certificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
    
    
    
}
