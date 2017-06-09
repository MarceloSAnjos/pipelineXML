/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

import pipelinexml.transporte.VolumeNFe;
import pipelinexml.transporte.TransportadoraNFe;

/**
 *
 * @author maeda
 */
public class Transporte {
    
    private TransportadoraNFe transporta;
    private VolumeNFe vol;

    public Transporte(TransportadoraNFe transporta, VolumeNFe vol) {
        this.transporta = transporta;
        this.vol = vol;
    }

    public TransportadoraNFe getTransporta() {
        return transporta;
    }

    public void setTransporta(TransportadoraNFe transporta) {
        this.transporta = transporta;
    }

    public VolumeNFe getVol() {
        return vol;
    }

    public void setVol(VolumeNFe vol) {
        this.vol = vol;
    }
    
    
    
}
