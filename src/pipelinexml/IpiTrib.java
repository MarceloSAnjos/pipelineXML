/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

/**
 *
 * @author maeda
 */
public class IpiTrib {
    
    private String CST;
    private String vBC;
    private String pIPI;
    private String vIPI;

    public IpiTrib(String CST, String vBC, String pIPI, String vIPI) {
        this.CST = CST;
        this.vBC = vBC;
        this.pIPI = pIPI;
        this.vIPI = vIPI;
    }

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpIPI() {
        return pIPI;
    }

    public void setpIPI(String pIPI) {
        this.pIPI = pIPI;
    }

    public String getvIPI() {
        return vIPI;
    }

    public void setvIPI(String vIPI) {
        this.vIPI = vIPI;
    }
    
    
    
}
