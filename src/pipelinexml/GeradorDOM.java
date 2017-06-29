/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author maeda
 */
public class GeradorDOM {

    public GeradorDOM() {

        geraXML();
    }

    public static void geraXML() {
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Elemento raiz
            Document doc = docBuilder.newDocument();
            Element raizXML = doc.createElement("nfeProc");
            doc.appendChild(raizXML);

            // Elemento Nota Fiscal Eletronica
            Element NFe = doc.createElement("NFe");
            raizXML.appendChild(NFe);

            // Elemento Informações da Nota Fiscal Eletronica
            Element infNFe = doc.createElement("infNFe");
            NFe.appendChild(infNFe);

            /**
             *
             * ELEMENTOS PERTENCENTES AS INFORMACOES DE IDENTIFICACAO DA NFe
             *
             */
            // Elemento de Identificacao da Nota Fiscal Eletronica
            Element ide = doc.createElement("ide");
            infNFe.appendChild(ide);

            Element cUF = doc.createElement("cUF");
            cUF.appendChild(doc.createTextNode("31"));
            ide.appendChild(cUF);

            Element cNF = doc.createElement("cNF");
            cNF.appendChild(doc.createTextNode("53395773"));
            ide.appendChild(cNF);

            Element natOp = doc.createElement("natOp");
            natOp.appendChild(doc.createTextNode("VENDA DE MERCADORIAS"));
            ide.appendChild(natOp);

            Element indPag = doc.createElement("indPag");
            indPag.appendChild(doc.createTextNode("0"));
            ide.appendChild(indPag);

            Element mod = doc.createElement("mod");
            mod.appendChild(doc.createTextNode("55"));
            ide.appendChild(mod);

            Element serie = doc.createElement("serie");
            serie.appendChild(doc.createTextNode("11"));
            ide.appendChild(serie);

            Element nNF = doc.createElement("nNF");
            nNF.appendChild(doc.createTextNode("336326"));
            ide.appendChild(nNF);

            Element dhEmi = doc.createElement("dhEmi");
            dhEmi.appendChild(doc.createTextNode("2016-11-03T15:42:56-02:00"));
            ide.appendChild(dhEmi);

            Element dhSaiEnt = doc.createElement("dhSaiEnt");
            dhSaiEnt.appendChild(doc.createTextNode("2016-11-03T16:42:20-02:00"));
            ide.appendChild(dhSaiEnt);

            Element tpNF = doc.createElement("tpNF");
            tpNF.appendChild(doc.createTextNode("1"));
            ide.appendChild(tpNF);

            Element idDest = doc.createElement("idDest");
            idDest.appendChild(doc.createTextNode("2"));
            ide.appendChild(idDest);

            Element cMunFG = doc.createElement("cMunFG");
            cMunFG.appendChild(doc.createTextNode("3125101"));
            ide.appendChild(cMunFG);

            Element tpImp = doc.createElement("tpImp");
            tpImp.appendChild(doc.createTextNode("1"));
            ide.appendChild(tpImp);

            Element tpEmis = doc.createElement("tpEmis");
            tpEmis.appendChild(doc.createTextNode("1"));
            ide.appendChild(tpEmis);

            Element cDV = doc.createElement("cDV");
            cDV.appendChild(doc.createTextNode("8"));
            ide.appendChild(cDV);

            Element finNFe = doc.createElement("finNFe");
            finNFe.appendChild(doc.createTextNode("1"));
            ide.appendChild(finNFe);

            Element indFinal = doc.createElement("indFinal");
            indFinal.appendChild(doc.createTextNode("1"));
            ide.appendChild(indFinal);

            Element indPres = doc.createElement("indPres");
            indPres.appendChild(doc.createTextNode("2"));
            ide.appendChild(indPres);

            Element ProcEmi = doc.createElement("ProcEmi");
            ProcEmi.appendChild(doc.createTextNode("0"));
            ide.appendChild(ProcEmi);

            Element verProc = doc.createElement("verProc");
            verProc.appendChild(doc.createTextNode("ABACOS V50B0070"));
            ide.appendChild(verProc);

            /**
             *
             * FIM DOS ELEMENTOS PERTENCENTES AS INFORMACOES DE IDENTIFICACAO DA
             * NFe
             *
             */
            // Elemento Informações do emissor da Nota Fiscal
            Element emit = doc.createElement("emit");
            infNFe.appendChild(emit);

            Element CNPJ = doc.createElement("CNPJ");
            CNPJ.appendChild(doc.createTextNode("09339936000973"));
            emit.appendChild(CNPJ);

            Element xNome = doc.createElement("xNome");
            xNome.appendChild(doc.createTextNode("NS2.COM INTERNET S.A."));
            emit.appendChild(xNome);

            Element xFant = doc.createElement("xFant");
            xFant.appendChild(doc.createTextNode("NETSHOES"));
            emit.appendChild(xFant);

            Element enderEmit = doc.createElement("enderEmit");
            emit.appendChild(enderEmit);

            Element xLgr = doc.createElement("xLgr");
            xLgr.appendChild(doc.createTextNode("Rua Margarida Pinto"));
            enderEmit.appendChild(xLgr);

            Element nro = doc.createElement("nro");
            nro.appendChild(doc.createTextNode("742"));
            enderEmit.appendChild(nro);

            Element xCpl = doc.createElement("xCpl");
            xCpl.appendChild(doc.createTextNode("Pavilhao B"));
            enderEmit.appendChild(xCpl);

            Element xBairro = doc.createElement("xBairro");
            xBairro.appendChild(doc.createTextNode("Bairro dos Pires"));
            enderEmit.appendChild(xBairro);

            Element cMun = doc.createElement("cMun");
            cMun.appendChild(doc.createTextNode("3125101"));
            enderEmit.appendChild(cMun);

            Element xMun = doc.createElement("xMun");
            xMun.appendChild(doc.createTextNode("EXTREMA"));
            enderEmit.appendChild(xMun);

            Element UF = doc.createElement("UF");
            UF.appendChild(doc.createTextNode("MG"));
            enderEmit.appendChild(UF);

            Element CEP = doc.createElement("CEP");
            CEP.appendChild(doc.createTextNode("37649920"));
            enderEmit.appendChild(CEP);

            Element cPais = doc.createElement("cPais");
            cPais.appendChild(doc.createTextNode("1058"));
            enderEmit.appendChild(cPais);

            Element xPais = doc.createElement("xPais");
            xPais.appendChild(doc.createTextNode("BRASIL"));
            enderEmit.appendChild(xPais);

            Element IE = doc.createElement("IE");
            IE.appendChild(doc.createTextNode("0025541260019"));
            emit.appendChild(IE);

            Element IEST = doc.createElement("IEST");
            IEST.appendChild(doc.createTextNode("812014011117"));
            emit.appendChild(IEST);

            Element CRT = doc.createElement("CRT");
            CRT.appendChild(doc.createTextNode("3"));
            emit.appendChild(CRT);

            /**
             *
             * FIM DAS INFORMAÇÕES DE EMISSOR DA NOTA FISCAL
             *
             */
            // Elemento Informações do destinatário Nota Fiscal Eletronica
            Element dest = doc.createElement("dest");
            infNFe.appendChild(dest);

            Element CPF = doc.createElement("CPF");
            CPF.appendChild(doc.createTextNode("11111111111"));
            dest.appendChild(CPF);

            xNome.appendChild(doc.createTextNode("Kakaroto"));
            dest.appendChild(xNome);

            Element enderDest = doc.createElement("enderDest");
            dest.appendChild(enderDest);

            Element xLgr2 = doc.createElement("xLgr");
            xLgr2.setTextContent("RUA ZICA");
            enderDest.appendChild(xLgr2);

            Element nro2 = doc.createElement("nro");
            nro2.appendChild(doc.createTextNode("666"));
            enderDest.appendChild(nro2);

            Element xCpl2 = doc.createElement("xCpl");
            xCpl2.appendChild(doc.createTextNode("Proximo ao local de entrega - complemento"));
            enderDest.appendChild(xCpl2);

            Element xBairro2 = doc.createElement("xBairro");
            xBairro2.appendChild(doc.createTextNode("Tinga"));
            enderDest.appendChild(xBairro2);

            Element cMun2 = doc.createElement("cMun");
            cMun2.appendChild(doc.createTextNode("3510500"));
            enderDest.appendChild(cMun2);

            Element xMun2 = doc.createElement("xMun");
            xMun2.appendChild(doc.createTextNode("CARAGUATATUBA"));
            enderDest.appendChild(xMun2);

            Element UF2 = doc.createElement("UF");
            UF2.appendChild(doc.createTextNode("SP"));
            enderDest.appendChild(UF2);

            Element CEP2 = doc.createElement("CEP");
            CEP2.appendChild(doc.createTextNode("11660970"));
            enderDest.appendChild(CEP2);

            Element cPais2 = doc.createElement("cPais");
            cPais2.appendChild(doc.createTextNode("1058"));
            enderDest.appendChild(cPais2);

            Element xPais2 = doc.createElement("xPais");
            xPais2.appendChild(doc.createTextNode("BRASIL"));
            enderDest.appendChild(xPais2);

            Element indIEDest = doc.createElement("indIEDest");
            indIEDest.appendChild(doc.createTextNode("9"));
            dest.appendChild(indIEDest);

            /**
             *
             * FIM DAS INFORMAÇOES DO DESTINATARIO DA NOTA FISCAL
             *
             */
            // Elemento de detalhe da nota fiscal
            Element det = doc.createElement("det");
            Attr att = doc.createAttribute("nItem");
            att.setTextContent("1");
            det.setAttributeNode(att);

            infNFe.appendChild(det);

            // ELEMENTO PRODUTOS
            Element prod = doc.createElement("prod");
            det.appendChild(prod);

            Element cProd = doc.createElement("cProd");
            cProd.appendChild(doc.createTextNode("D13-4427-793-45"));
            prod.appendChild(cProd);

            Element cEAN = doc.createElement("cEAN");
            cEAN.appendChild(doc.createTextNode("4057284362269"));
            prod.appendChild(cEAN);

            Element NCM = doc.createElement("NCM");
            NCM.appendChild(doc.createTextNode("64041100"));
            prod.appendChild(NCM);

            Element CFOP = doc.createElement("CFOP");
            CFOP.appendChild(doc.createTextNode("6108"));
            prod.appendChild(CFOP);

            Element uCom = doc.createElement("uCom");
            uCom.appendChild(doc.createTextNode("PAR"));
            prod.appendChild(uCom);

            Element qCom = doc.createElement("qCom");
            qCom.appendChild(doc.createTextNode("1"));
            prod.appendChild(qCom);

            Element vUnCom = doc.createElement("vUnCom");
            vUnCom.appendChild(doc.createTextNode("239.9000"));
            prod.appendChild(vUnCom);

            Element vProd = doc.createElement("vProd");
            vProd.appendChild(doc.createTextNode("239.90"));
            prod.appendChild(vProd);

            Element cEANTrib = doc.createElement("cEANTrib");
            cEANTrib.appendChild(doc.createTextNode("4057284362269"));
            prod.appendChild(cEANTrib);

            Element uTrib = doc.createElement("uTrib");
            uTrib.appendChild(doc.createTextNode("PAR"));
            prod.appendChild(uTrib);

            Element qTrib = doc.createElement("qTrib");
            qTrib.appendChild(doc.createTextNode("1"));
            prod.appendChild(qTrib);

            Element vUnTrib = doc.createElement("vUnTrib");
            vUnTrib.appendChild(doc.createTextNode("239.9000"));
            prod.appendChild(vUnTrib);

            Element vFrete = doc.createElement("vFrete");
            vFrete.appendChild(doc.createTextNode("14.50"));
            prod.appendChild(vFrete);

            Element indTot = doc.createElement("indTot");
            indTot.appendChild(doc.createTextNode("1"));
            prod.appendChild(indTot);

            /**
             *
             * FIM DO ELEMENTO DE DETALHE DA NOTA FISCAL
             *
             */
            // Elemento Informações do total da Nota Fiscal Eletronica
            Element total = doc.createElement("total");
            infNFe.appendChild(total);

            // Elemento Informações da transportadora do produto vendido na Nota Fiscal Eletronica
            Element transp = doc.createElement("transp");
            infNFe.appendChild(transp);

            // Elemento Informações Adicionais da Nota Fiscal Eletronica
            Element infAdic = doc.createElement("infAdic");
            infNFe.appendChild(infAdic);

            /**
             * FIM DA ESTRUTURA BASICA DE INFORMACOES DA NFe
             */
            //=================================================================
            /**
             * INICIO DAS PROPRIEDADES DA ASSINATURA DIGITAL
             */
            // Elemento Assinatura Digital da Nota Fiscal Eletronica
            Element Signature = doc.createElement("Signature");
            NFe.appendChild(Signature);

            /**
             * FIM DAS PROPRIEDADES DA ASSINATURA DIGITAL
             */
            //=================================================================
            /**
             * INICIO DAS PROPRIEDADES DO PROTOCOLO DA NOTA FISCAL
             */
            // Elementos relativos as Informações do protocolo de geração da Nota Fiscal Eletronica
            Element protNFe = doc.createElement("protNFe");
            NFe.appendChild(protNFe);

            // Elemento
            Element infProt = doc.createElement("infProt");
            protNFe.appendChild(infProt);

            // Tipo de Ambiente da venda
            Element tpAmb = doc.createElement("tpAmb");
            infProt.appendChild(tpAmb);

            // Versão do aplicativo do Ambiente da venda
            Element verAplic = doc.createElement("verAplic");
            infProt.appendChild(verAplic);

            // Data e hora do recebimento do protocolo de geração da nota fiscal
            Element dhRecbto = doc.createElement("dhRecbto");
            infProt.appendChild(dhRecbto);

            // Numero de protocolo de geração da nota fiscal
            Element nProt = doc.createElement("nProt");
            infProt.appendChild(nProt);

            // Chave da geração da nota fiscal
            Element digVal = doc.createElement("digVal");
            infProt.appendChild(digVal);

            // Código de status de geração da nota fiscal
            Element cStat = doc.createElement("cStat");
            infProt.appendChild(cStat);

            // Motivo do protocolo de geração da nota fiscal
            Element xMotivo = doc.createElement("xMotivo");
            infProt.appendChild(xMotivo);

            /**
             * FIM DAS PROPRIEDADES DE PROTOCOLO DA NOTA FISCAL
             */
            // =================================================================
            // set attribute to staff element
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            infNFe.setAttributeNode(attr);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("testeDOM.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);

            System.out.println("File saved!");

            /**
             * GERAÇÃO DE NOTA FISCAL MANUALMENTE
             */
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
