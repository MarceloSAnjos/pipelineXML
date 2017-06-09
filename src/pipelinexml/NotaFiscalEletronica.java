/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import pipelinexml.corpoNFe.Signature;
import pipelinexml.corpoNFe.infNFe;
import pipelinexml.elementosInfNFe.Destinatario;
import pipelinexml.elementosInfNFe.Detalhes.CofinsAliq;
import pipelinexml.elementosInfNFe.Detalhes.CofinsNFe;
import pipelinexml.elementosInfNFe.Detalhes.Icms00;
import pipelinexml.elementosInfNFe.Detalhes.IcmsNFe;
import pipelinexml.elementosInfNFe.Detalhes.IcmsUfDest;
import pipelinexml.elementosInfNFe.Detalhes.ImpostoNFe;
import pipelinexml.elementosInfNFe.Detalhes.InformacaoAdicionalDet;
import pipelinexml.elementosInfNFe.Detalhes.IpiNFe;
import pipelinexml.elementosInfNFe.Detalhes.IpiTrib;
import pipelinexml.elementosInfNFe.Detalhes.PisAliquota;
import pipelinexml.elementosInfNFe.Detalhes.PisNFe;
import pipelinexml.elementosInfNFe.Detalhes.ProdutoNFe;
import pipelinexml.elementosInfNFe.DetalhesNFe;
import pipelinexml.elementosInfNFe.Emitente;
import pipelinexml.elementosInfNFe.Endereco;
import pipelinexml.elementosInfNFe.IdentificadorNFe;

/**
 *
 * @author maeda
 */
public class NotaFiscalEletronica {

  
    
    private infNFe infNFe = new infNFe();
    private Signature Signature = new Signature();
    
    
    
    public NotaFiscalEletronica(){
    
        inicializainfNFe();
    };
    
    //Inicializa as informações do objeto InfNFe
    
    public void inicializainfNFe(){
    
        IdentificadorNFe identifica = new IdentificadorNFe("31","53395773","VENDA DE MERCADORIA"
                ,"0","55","11","336326","2016-11-03T15:42:56-02:00","2016-11-03T16:42:20-02:00"
                ,"1","2","125101","1","1","8","1","1","1","2","0","ABACOS V50B0070");
        
        Endereco endereco = new Endereco("Rua Maria Margarida Pinto","72"
                ,"Pavilhao B","Bairro dos Pires","3125101","EXTREMA","MG",
                "37640920","1058","BRASIL");
        
        Emitente emitente = new Emitente("09339936000973","NS2.COM INTERNET S.A.",
                "NETSHOES",endereco,"0025541260019","813014011117","3");
        
        Destinatario destinatario = new Destinatario("1111111111","Pessoa Aleatoria", endereco,"9");
        
        Icms00 icms = new Icms00("0", "00", "3", "254.40", "12.00", "30.53");

        IpiTrib ipi = new IpiTrib("99", "0.00", "0.00", "0.00");

        PisAliquota pis = new PisAliquota("01", "254.40", "1.65", "4.20");

        CofinsAliq cofins = new CofinsAliq("01", "254.40", "7.60", "19.33");
        
        IcmsUfDest icmsufd = new IcmsUfDest("254.40","0.00","18.00","12.00","40.00","0.00","6.11","9.16");
        
        ProdutoNFe produto = new ProdutoNFe("D13-4427-793-45","4057284362269","Tenis Adidas Runway",
                "64041100","6108","PAR","1","239.9000","239.90"
                ,"4057284362269","PAR","1","239.90000","14.50","1");
        
        DetalhesNFe detalhes = new DetalhesNFe("1", produto, new ImpostoNFe(new IcmsNFe(icms),new IpiNFe("999",ipi),new PisNFe(pis),
                new CofinsNFe(cofins), icmsufd), new InformacaoAdicionalDet("EAN 4057284362269  - Preto+Prata"));
          
          
    }

    public NotaFiscalEletronica(infNFe infNFe, Signature Signature) {
        this.infNFe = infNFe;
        this.Signature = Signature;
    }

    public infNFe getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(infNFe infNFe) {
        this.infNFe = infNFe;
    }

    public Signature getSignature() {
        return Signature;
    }

    public void setSignature(Signature Signature) {
        this.Signature = Signature;
    }
    
    
   
    
    
    
}
