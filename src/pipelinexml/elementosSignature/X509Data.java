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
public class X509Data {
    
    private X509Certificate X509Certificate;

    public X509Data(X509Certificate X509Certificate) {
        this.X509Certificate = X509Certificate;
    }

    public X509Certificate getX509Certificate() {
        return X509Certificate;
    }

    public void setX509Certificate(X509Certificate X509Certificate) {
        this.X509Certificate = X509Certificate;
    }
    
    
    
}
