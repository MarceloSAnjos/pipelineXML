/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml.elementosInfNFe.InformacaoAdicional;

/**
 *
 * @author maeda
 */
public class InformacaoComplementar {

    private String infCpl;

    public InformacaoComplementar() {
        this.infCpl = "Conf.lei 12741/12 a carga trib.do prod.desta NF, e aprox.36% "
                + "/ Pedido: 18004452493  Pedido interno: 392529513 / "
                + "Condicoes de Pagto:  MASTERCARD = 254,40 / B.C.ICMS Dest: R$ 254,40 "
                + "/ V.T.ICMS UF Rem: R$ 9,16 / V.T.ICMS UF Dest: R$ 6,11";
    }

    public String getInformacaoCompl() {
        return infCpl;
    }

    public void setInformacaoCompl(String informacaoCompl) {
        this.infCpl = informacaoCompl;
    }

}
