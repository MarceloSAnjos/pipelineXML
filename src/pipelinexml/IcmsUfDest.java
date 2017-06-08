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
public class IcmsUfDest {
    
    private String vBCUFDest;
    private String pFCPUFDest;
    private String pICMSUFDest;
    private String pICMSInter;
    private String pICMSInterPart;
    private String vFCPUFDest;
    private String vICMSUFDest;
    private String vICMSUFRemet;

    public IcmsUfDest(String vBCUFDest, String pFCPUFDest, String pICMSUFDest, String pICMSInter, String pICMSInterPart, String vFCPUFDest, String vICMSUFDest, String vICMSUFRemet) {
        this.vBCUFDest = vBCUFDest;
        this.pFCPUFDest = pFCPUFDest;
        this.pICMSUFDest = pICMSUFDest;
        this.pICMSInter = pICMSInter;
        this.pICMSInterPart = pICMSInterPart;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
    }

    public String getvBCUFDest() {
        return vBCUFDest;
    }

    public void setvBCUFDest(String vBCUFDest) {
        this.vBCUFDest = vBCUFDest;
    }

    public String getpFCPUFDest() {
        return pFCPUFDest;
    }

    public void setpFCPUFDest(String pFCPUFDest) {
        this.pFCPUFDest = pFCPUFDest;
    }

    public String getpICMSUFDest() {
        return pICMSUFDest;
    }

    public void setpICMSUFDest(String pICMSUFDest) {
        this.pICMSUFDest = pICMSUFDest;
    }

    public String getpICMSInter() {
        return pICMSInter;
    }

    public void setpICMSInter(String pICMSInter) {
        this.pICMSInter = pICMSInter;
    }

    public String getpICMSInterPart() {
        return pICMSInterPart;
    }

    public void setpICMSInterPart(String pICMSInterPart) {
        this.pICMSInterPart = pICMSInterPart;
    }

    public String getvFCPUFDest() {
        return vFCPUFDest;
    }

    public void setvFCPUFDest(String vFCPUFDest) {
        this.vFCPUFDest = vFCPUFDest;
    }

    public String getvICMSUFDest() {
        return vICMSUFDest;
    }

    public void setvICMSUFDest(String vICMSUFDest) {
        this.vICMSUFDest = vICMSUFDest;
    }

    public String getvICMSUFRemet() {
        return vICMSUFRemet;
    }

    public void setvICMSUFRemet(String vICMSUFRemet) {
        this.vICMSUFRemet = vICMSUFRemet;
    }
    
    
    
}
