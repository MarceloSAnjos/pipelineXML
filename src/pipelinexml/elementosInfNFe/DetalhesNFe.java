/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

import pipelinexml.elementosInfNFe.Detalhes.CofinsAliq;
import pipelinexml.elementosInfNFe.Detalhes.CofinsNFe;
import pipelinexml.elementosInfNFe.Detalhes.Icms00;
import pipelinexml.elementosInfNFe.Detalhes.IcmsNFe;
import pipelinexml.elementosInfNFe.Detalhes.IcmsUfDest;
import pipelinexml.elementosInfNFe.Detalhes.InformacaoAdicionalDet;
import pipelinexml.elementosInfNFe.Detalhes.ImpostoNFe;
import pipelinexml.elementosInfNFe.Detalhes.ImpostoNFe;
import pipelinexml.elementosInfNFe.Detalhes.ImpostoNFe;
import pipelinexml.elementosInfNFe.Detalhes.InformacaoAdicionalDet;
import pipelinexml.elementosInfNFe.Detalhes.InformacaoAdicionalDet;
import pipelinexml.elementosInfNFe.Detalhes.IpiNFe;
import pipelinexml.elementosInfNFe.Detalhes.IpiTrib;
import pipelinexml.elementosInfNFe.Detalhes.PisAliquota;
import pipelinexml.elementosInfNFe.Detalhes.PisNFe;
import pipelinexml.elementosInfNFe.Detalhes.ProdutoNFe;

/**
 *
 * @author maeda
 */
public class DetalhesNFe {

    private String nItem; // Numero do item
    private ImpostoNFe imposto;
    private ProdutoNFe prod;
    private InformacaoAdicionalDet infAdProd;

    public DetalhesNFe(String nItem, ProdutoNFe produto, ImpostoNFe imposto, InformacaoAdicionalDet infAdProd) {
        this.nItem = nItem;
        this.imposto = imposto;
        this.prod = produto;
        this.infAdProd = infAdProd;
    }

   

    public String getnItem() {
        return nItem;
    }

    public void setnItem(String nItem) {
        this.nItem = nItem;
    }

    public ImpostoNFe getImposto() {
        return imposto;
    }

    public void setImposto(ImpostoNFe imposto) {
        this.imposto = imposto;
    }

    public InformacaoAdicionalDet getInfAdProd() {
        return infAdProd;
    }

    public void setInfAdProd(InformacaoAdicionalDet infAdProd) {
        this.infAdProd = infAdProd;
    }
    
    

}
