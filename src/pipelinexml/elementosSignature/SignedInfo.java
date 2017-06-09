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
public class SignedInfo {
    
    
    public SignedInfo(){};
    
    private String CanonicalizationMethod;
    private String SignatureMethod;
    private Reference Reference;

    public SignedInfo(String CanonicalizationMethod, String SignatureMethod, Reference Reference) {
        this.CanonicalizationMethod = CanonicalizationMethod;
        this.SignatureMethod = SignatureMethod;
        this.Reference = Reference;
    }

    public String getCanonicalizationMethod() {
        return CanonicalizationMethod;
    }

    public void setCanonicalizationMethod(String CanonicalizationMethod) {
        this.CanonicalizationMethod = CanonicalizationMethod;
    }

    public String getSignatureMethod() {
        return SignatureMethod;
    }

    public void setSignatureMethod(String SignatureMethod) {
        this.SignatureMethod = SignatureMethod;
    }

    public Reference getReference() {
        return Reference;
    }

    public void setReference(Reference Reference) {
        this.Reference = Reference;
    }
    
    
    
}
