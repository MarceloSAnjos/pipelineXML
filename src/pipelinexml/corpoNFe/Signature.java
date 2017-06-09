/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.corpoNFe;

import pipelinexml.elementosSignature.KeyInfo;
import pipelinexml.elementosSignature.SignatureValue;
import pipelinexml.elementosSignature.SignedInfo;

/**
 *
 * @author maeda
 */
public class Signature {
    
    private SignedInfo SignedInfo;
    private SignatureValue SignatureValue;
    private KeyInfo KeyInfo;

    public Signature(SignedInfo SignedInfo, SignatureValue SignatureValue, KeyInfo KeyInfo) {
        this.SignedInfo = SignedInfo;
        this.SignatureValue = SignatureValue;
        this.KeyInfo = KeyInfo;
    }

    public SignedInfo getSignedInfo() {
        return SignedInfo;
    }

    public void setSignedInfo(SignedInfo SignedInfo) {
        this.SignedInfo = SignedInfo;
    }

    public SignatureValue getSignatureValue() {
        return SignatureValue;
    }

    public void setSignatureValue(SignatureValue SignatureValue) {
        this.SignatureValue = SignatureValue;
    }

    public KeyInfo getKeyInfo() {
        return KeyInfo;
    }

    public void setKeyInfo(KeyInfo KeyInfo) {
        this.KeyInfo = KeyInfo;
    }
    
    
    
    
    
}
