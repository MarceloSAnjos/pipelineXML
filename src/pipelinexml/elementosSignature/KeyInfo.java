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
public class KeyInfo {
    
    private X509Data X509Data;

    public KeyInfo(X509Data X509Data) {
        this.X509Data = X509Data;
    }

    public X509Data getX509Data() {
        return X509Data;
    }

    public void setX509Data(X509Data X509Data) {
        this.X509Data = X509Data;
    }
    
    
    
}
