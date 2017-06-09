/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.corpoNFe;


import pipelinexml.elementosInfNFe.Destinatario;
import pipelinexml.elementosInfNFe.DetalhesNFe;
import pipelinexml.elementosInfNFe.Emitente;
import pipelinexml.elementosInfNFe.IdentificadorNFe;
import pipelinexml.elementosInfNFe.InformacaoAdicionalNFe;
import pipelinexml.elementosInfNFe.TotalNFe;
import pipelinexml.elementosInfNFe.TransporteNFe;

/**
 *
 * @author maeda
 */
public class infNFe {
    
    public infNFe(){};
    
    private IdentificadorNFe ide;
    private Emitente emit;
    private Destinatario dest;
    private DetalhesNFe det;
    private TotalNFe total;
    private TransporteNFe transp;
    private InformacaoAdicionalNFe infAdic;
    
    
    

    public infNFe(IdentificadorNFe ide, Emitente emit, Destinatario dest, DetalhesNFe det, TotalNFe total, TransporteNFe transp, InformacaoAdicionalNFe infAdic) {
        this.ide = ide; //OK
        this.emit = emit; // OK
        this.dest = dest;// OK
        this.det = det; // OK
        this.total = total;
        this.transp = transp;
        this.infAdic = infAdic;
    }
    
    

    public IdentificadorNFe getIde() {
        return ide;
    }

    public void setIde(IdentificadorNFe ide) {
        this.ide = ide;
    }

    public Emitente getEmit() {
        return emit;
    }

    public void setEmit(Emitente emit) {
        this.emit = emit;
    }

    public Destinatario getDest() {
        return dest;
    }

    public void setDest(Destinatario dest) {
        this.dest = dest;
    }

    public DetalhesNFe getDet() {
        return det;
    }

    public void setDet(DetalhesNFe det) {
        this.det = det;
    }

    public TotalNFe getTotal() {
        return total;
    }

    public void setTotal(TotalNFe total) {
        this.total = total;
    }

    public TransporteNFe getTransp() {
        return transp;
    }

    public void setTransp(TransporteNFe transp) {
        this.transp = transp;
    }

    public InformacaoAdicionalNFe getInfAdic() {
        return infAdic;
    }

    public void setInfAdic(InformacaoAdicionalNFe infAdic) {
        this.infAdic = infAdic;
    }
    
    
    
}
