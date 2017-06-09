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
public class Transforms {
    
    private String Transform;
    private String Transform2;

    public Transforms(String Transform, String Transform2) {
        this.Transform = Transform;
        this.Transform2 = Transform2;
    }

    public String getTransform() {
        return Transform;
    }

    public void setTransform(String Transform) {
        this.Transform = Transform;
    }

    public String getTransform2() {
        return Transform2;
    }

    public void setTransform2(String Transform2) {
        this.Transform2 = Transform2;
    }
    
    
    
}
