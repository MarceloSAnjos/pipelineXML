/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.detalhes;

/**
 *
 * @author maeda
 */
public class ProdutoNFe {
    
    
    private String cProd; // Código do produto ou serviço
    private String cEAN; // GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras
    private String xProd; // Descrição do produto ou serviço
    private String NCM; // Código NCM (8 posições), será permitida a informação do gênero (posição do capítulo do NCM) quando a operação não for de comércio exterior (importação/exportação) ou o produto não seja tributado pelo IPI. Em caso de item de serviço ou item que não tenham produto (Ex. transferência de crédito, crédito do ativo imobilizado, etc.), informar o código 00 (zeros) (v2.0)
    private String CFOP; // CFOP do produto
    private String uCom; // Unidade comercial 
    private String qCom; //Quantidade Comercial  do produto, alterado para aceitar de 0 a 4 casas decimais e 11 inteiros.
    private String vUnCom; // Valor unitário de comercialização  - alterado para aceitar 0 a 10 casas decimais e 11 inteiros
    private String cEANTrib; // GTIN (Global Trade Item Number) da unidade tributável, antigo código EAN ou código de barras
    private String uTrib; // Unidade Tributável
    private String qTrib; // Quantidade Tributável - alterado para aceitar de 0 a 4 casas decimais e 11 inteiros
    private String vUnTrib; // Valor unitário de tributação - - alterado para aceitar 0 a 10 casas decimais e 11 inteiros
    private String vFrete; // Valor Total do Frete
    private String indTot; // Este campo deverá ser preenchido com: 0 – o valor do item (vProd) não compõe o valor total da NF-e (vProd)  1  – o valor do item (vProd) compõe o valor total da NF-e (vProd)

    public ProdutoNFe(String cProd, String cEAN, String xProd, String NCM, String CFOP, String uCom, String qCom, String vUnCom, String cEANTrib, String uTrib, String qTrib, String vUnTrib, String vFrete, String indTot) {
        this.cProd = cProd;
        this.cEAN = cEAN;
        this.xProd = xProd;
        this.NCM = NCM;
        this.CFOP = CFOP;
        this.uCom = uCom;
        this.qCom = qCom;
        this.vUnCom = vUnCom;
        this.cEANTrib = cEANTrib;
        this.uTrib = uTrib;
        this.qTrib = qTrib;
        this.vUnTrib = vUnTrib;
        this.vFrete = vFrete;
        this.indTot = indTot;
    }


    public String getcProd() {
        return cProd;
    }

    public void setcProd(String cProd) {
        this.cProd = cProd;
    }

    public String getcEAN() {
        return cEAN;
    }

    public void setcEAN(String cEAN) {
        this.cEAN = cEAN;
    }

    public String getxProd() {
        return xProd;
    }

    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public String getCFOP() {
        return CFOP;
    }

    public void setCFOP(String CFOP) {
        this.CFOP = CFOP;
    }

    public String getuCom() {
        return uCom;
    }

    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public String getqCom() {
        return qCom;
    }

    public void setqCom(String qCom) {
        this.qCom = qCom;
    }

    public String getvUnCom() {
        return vUnCom;
    }

    public void setvUnCom(String vUnCom) {
        this.vUnCom = vUnCom;
    }

    public String getcEANTrib() {
        return cEANTrib;
    }

    public void setcEANTrib(String cEANTrib) {
        this.cEANTrib = cEANTrib;
    }

    public String getuTrib() {
        return uTrib;
    }

    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public String getqTrib() {
        return qTrib;
    }

    public void setqTrib(String qTrib) {
        this.qTrib = qTrib;
    }

    public String getvUnTrib() {
        return vUnTrib;
    }

    public void setvUnTrib(String vUnTrib) {
        this.vUnTrib = vUnTrib;
    }

    public String getvFrete() {
        return vFrete;
    }

    public void setvFrete(String vFrete) {
        this.vFrete = vFrete;
    }

    public String getIndTot() {
        return indTot;
    }

    public void setIndTot(String indTot) {
        this.indTot = indTot;
    }

}
