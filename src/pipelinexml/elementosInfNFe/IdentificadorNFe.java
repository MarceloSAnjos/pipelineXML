/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe;

/**
 *
 * @author maeda
 */
public class IdentificadorNFe {

    /**
     *
     * INICIO DO TRECHO DE IDENTIFICAÇÃO DA NOTA FISCAL OBS: NESTE TRECHO SÃO
     * OBSERVADAS AS VARIÁVEIS QUE COMPÕEM ESPECIFICAMENTE A PARTE DE
     * IDENTIFICAÇÃO DA NOTA FISCAL.
     *
     */
    public IdentificadorNFe() {
    }
    ;

    private String cUF; // Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do IBGE.
    private String cNF; // Código numérico que compõe a Chave de Acesso. Número aleatório gerado pelo emitente para cada NF-e.
    private String natOp; // Natureza da operação
    private String indPag; // Tipo de pagamento
    private String mod; // Código do modelo do Documento Fiscal. 55 = NF-e; 65 = NFC-e.
    private String serie; // Série do Documento Fiscal série normal 0-889 Avulsa Fisco 890-899 SCAN 900-999
    private String nNF; // Número do documento fiscal
    private String dhEmi; // Data e Hora de emissão do Documento Fiscal (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00
    private String dhSaiEnt; // Data e Hora da saída ou de entrada da mercadoria / produto (AAAA-MM-DDTHH:mm:ssTZD)
    private String tpNF; // Tipo do Documento Fiscal (0 - entrada; 1 - saída)
    private String idDest; // Identificador de Local de destino da operação (1-Interna;2-Interestadual;3-Exterior)
    private String cMunFG; // Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE)
    private String tpImp; // Formato de impressão do DANFE (0-sem DANFE;1-DANFe Retrato; 2-DANFe Paisagem;3-DANFe Simplificado; 4-DANFe NFC-e;5-DANFe NFC-e em mensagem eletrônica)
    private String tpEmis; // 
    /**
     * Forma de emissão da NF-e 1 - Normal; 2 - Contingência FS; 3 -
     * Contingência SCAN; 4 - Contingência DPEC; 5 - Contingência FSDA; 6 -
     * Contingência SVC - AN; 7 - Contingência SVC - RS; 9 - Contingência
     * off-line NFC-e;
     *
     */

    private String cDV; // Digito Verificador da Chave de Acesso da NF-e
    private String tpAmb; // Identificação do Ambiente: 1 - Produção 2 - Homologação
    private String finNFe; // Finalidade da emissão da NF-e: 1 - NFe normal 2 - NFe complementar 3 - NFe de ajuste 4 - Devolução/Retorno
    private String indFinal; //Finalidade final
    private String indPres;
    private String procEmi;


    /**
     * Indicador de presença do comprador no estabelecimento comercial no
     * momento da oepração (0-Não se aplica (ex.: Nota Fiscal complementar ou de
     * ajuste; 1-Operação presencial; 2-Não presencial, internet; 3-Não
     * presencial, teleatendimento; 4-NFC-e entrega em domicílio; 5-Operação
     * presencial, fora do estabelecimento; 9-Não presencial, outros) **
     */
    /**
     * Processo de emissão utilizado com a seguinte codificação: 0 - emissão de
     * NF-e com aplicativo do contribuinte; 1 - emissão de NF-e avulsa pelo
     * Fisco; 2 - emissão de NF-e avulsa, pelo contribuinte com seu certificado
     * digital, através do site do Fisco; 3- emissão de NF-e pelo contribuinte
     * com aplicativo fornecido pelo Fisco
     */
    private String verProc; // Versão do aplicativo utilizado no processo de emissão

    public IdentificadorNFe(String cUF, String cNF, String natOp, String indPag, String mod, String serie, String nNF, String dhEmi, String dhSaiEnt, String tpNF, String idDest, String cMunFG, String tpImp, String tpEmis, String cDV, String tpAmb, String finNFe, String indFinal, String indPres, String procEmi, String verProc) {
        this.cUF = cUF;
        this.cNF = cNF;
        this.natOp = natOp;
        this.indPag = indPag;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
        this.dhEmi = dhEmi;
        this.dhSaiEnt = dhSaiEnt;
        this.tpNF = tpNF;
        this.idDest = idDest;
        this.cMunFG = cMunFG;
        this.tpImp = tpImp;
        this.tpEmis = tpEmis;
        this.cDV = cDV;
        this.tpAmb = tpAmb;
        this.finNFe = finNFe;
        this.indFinal = indFinal;
        this.indPres = indPres;
        this.procEmi = procEmi;
        this.verProc = verProc;
    }

    public String getcUF() {
        return cUF;
    }

    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    public String getcNF() {
        return cNF;
    }

    public void setcNF(String cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public String getIndPag() {
        return indPag;
    }

    public void setIndPag(String indPag) {
        this.indPag = indPag;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    public String getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    public String getDhSaiEnt() {
        return dhSaiEnt;
    }

    public void setDhSaiEnt(String dhSaiEnt) {
        this.dhSaiEnt = dhSaiEnt;
    }

    public String getTpNF() {
        return tpNF;
    }

    public void setTpNF(String tpNF) {
        this.tpNF = tpNF;
    }

    public String getIdDest() {
        return idDest;
    }

    public void setIdDest(String idDest) {
        this.idDest = idDest;
    }

    public String getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(String cMunFG) {
        this.cMunFG = cMunFG;
    }

    public String getTpImp() {
        return tpImp;
    }

    public void setTpImp(String tpImp) {
        this.tpImp = tpImp;
    }

    public String getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(String tpEmis) {
        this.tpEmis = tpEmis;
    }

    public String getcDV() {
        return cDV;
    }

    public void setcDV(String cDV) {
        this.cDV = cDV;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(String finNFe) {
        this.finNFe = finNFe;
    }

    public String getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(String indFinal) {
        this.indFinal = indFinal;
    }

    public String getIndPres() {
        return indPres;
    }

    public void setIndPres(String indPres) {
        this.indPres = indPres;
    }

    public String getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(String procEmi) {
        this.procEmi = procEmi;
    }

    public String getVerProc() {
        return verProc;
    }

    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }
    
    
    
    

}