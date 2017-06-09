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
public class Reference {
    
    public Reference(){};
    
    private Transforms Transform;
    private String DigestMethod;
    private String DigestValue;

    public Reference(Transforms Transform, String DigestMethod, String DigestValue) {
        this.Transform = Transform;
        this.DigestMethod = DigestMethod;
        this.DigestValue = DigestValue;
    }

    public Transforms getTransform() {
        return Transform;
    }

    public void setTransform(Transforms Transform) {
        this.Transform = Transform;
    }

    public String getDigestMethod() {
        return DigestMethod;
    }

    public void setDigestMethod(String DigestMethod) {
        this.DigestMethod = DigestMethod;
    }

    public String getDigestValue() {
        return DigestValue;
    }

    public void setDigestValue(String DigestValue) {
        this.DigestValue = DigestValue;
    }
    
    
    
}
