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

            //Elemento Imposto
            Element imposto = doc.createElement("imposto");
            det.appendChild(imposto);

            Element ICMS = doc.createElement("ICMS");
            imposto.appendChild(ICMS);

            Element ICMS00 = doc.createElement("ICMS00");
            ICMS.appendChild(ICMS00);

            Element orig = doc.createElement("orig");
            orig.appendChild(doc.createTextNode("0"));
            ICMS00.appendChild(orig);

            Element CST = doc.createElement("CST");
            CST.appendChild(doc.createTextNode("00"));
            ICMS00.appendChild(CST);

            Element modBC = doc.createElement("modBC");
            modBC.appendChild(doc.createTextNode("3"));
            ICMS00.appendChild(modBC);

            Element vBC = doc.createElement("vBC");
            vBC.appendChild(doc.createTextNode("254.40"));
            ICMS00.appendChild(vBC);

            Element pICMS = doc.createElement("pICMS");
            pICMS.appendChild(doc.createTextNode("12.00"));
            ICMS00.appendChild(pICMS);

            Element vICMS = doc.createElement("vICMS");
            vICMS.appendChild(doc.createTextNode("30.53"));
            ICMS00.appendChild(vICMS);

            // Relativo ao IPI da nota
            Element IPI = doc.createElement("IPI");
            imposto.appendChild(IPI);

            Element cEnq = doc.createElement("cEnq");
            cEnq.appendChild(doc.createTextNode("999"));
            IPI.appendChild(cEnq);

            Element IPITrib = doc.createElement("IPITrib");

            IPI.appendChild(IPITrib);

            Element CST2 = doc.createElement("CST");
            CST2.appendChild(doc.createTextNode("0.00"));
            IPITrib.appendChild(CST2);

            Element vBC2 = doc.createElement("vBC");
            vBC2.appendChild(doc.createTextNode("254.40"));
            IPITrib.appendChild(vBC2);
            
            Element pIPI = doc.createElement("pIPI");
            pIPI.appendChild(doc.createTextNode("0.00"));
            IPITrib.appendChild(pIPI);
            
            Element vIPI = doc.createElement("vIPI");
            vIPI.appendChild(doc.createTextNode("0.00"));
            IPITrib.appendChild(vIPI);
            
            /**
             * FIM DAS INFORMACOES DO IPI
             */
            
            // Informação referente ao PIS
            
            Element PIS = doc.createElement("PIS");
            imposto.appendChild(PIS);
            
            
            Element PISAliq =  doc.createElement("PISAliq");
            PIS.appendChild(PISAliq);
            
            
            Element CSTPIS = doc.createElement("CST");
            CSTPIS.appendChild(doc.createTextNode("01"));
            PISAliq.appendChild(CSTPIS);
            
            Element vBCPIS = doc.createElement("vBC");
            vBCPIS.appendChild(doc.createTextNode("254.40"));
            PISAliq.appendChild(vBCPIS);
            
            Element pPIS = doc.createElement("pPIS");
            pPIS.appendChild(doc.createTextNode("1.65"));
            PISAliq.appendChild(pPIS);
            
            Element vPIS = doc.createElement("vPIS");
            vPIS.appendChild(doc.createTextNode("4.20"));
            PISAliq.appendChild(vPIS);
            
            /**
             * FIM DAS INFORMACOES REFERENTES AO PIS
             */
            
            // INICIO DAS INFORMACOES REFERENTES AO COFINS
            
            Element COFINS = doc.createElement("COFINS");
            imposto.appendChild(COFINS);
            
            
            Element COFINSAliq =  doc.createElement("COFINSAliq");
            COFINS.appendChild(COFINSAliq);
            
            Element CSTCOFINS = doc.createElement("CST");
            CSTCOFINS.appendChild(doc.createTextNode("01"));
            COFINSAliq.appendChild(CSTCOFINS);
            
            Element vBCCOFINS = doc.createElement("vBC");
            vBCCOFINS.appendChild(doc.createTextNode("254.40"));
            COFINSAliq.appendChild(vBCCOFINS);
            
            Element pCOFINS = doc.createElement("pCOFINS");
            pCOFINS.appendChild(doc.createTextNode("7.60"));
            COFINSAliq.appendChild(pCOFINS);
            
            Element vCOFINS = doc.createElement("vCOFINS");
            vPIS.appendChild(doc.createTextNode("19.33"));
            COFINSAliq.appendChild(vPIS);
            
            /**
             * FIM DOS ELEMENTOS DO COFINS
             */
            
            // INICIO DAS INFORMAÇOES DO ICMS NO ESTADO DO DESTINATARIO
            
            Element ICMSUFDest = doc.createElement("ICMSUFDest");
            imposto.appendChild(ICMSUFDest);
            
            Element vBCUFDest = doc.createElement("vBCUFDest");
            vBCUFDest.appendChild(doc.createTextNode("254.50"));
            ICMSUFDest.appendChild(vBCUFDest);
            
            Element pFCUFDest = doc.createElement("pFCPUFDest");
            pFCUFDest.appendChild(doc.createTextNode("0.00"));
            ICMSUFDest.appendChild(pFCUFDest);
            
            Element pICMSUFDest = doc.createElement("pICMSUFDest");
            pICMSUFDest.appendChild(doc.createTextNode("18.00"));
            ICMSUFDest.appendChild(pICMSUFDest);
            
            Element pICMSInter = doc.createElement("pICMSInter");
            pICMSInter.appendChild(doc.createTextNode("12.00"));
            ICMSUFDest.appendChild(pICMSInter);
            
            Element pICMSInterPart = doc.createElement("pICMSInterPart");
            pICMSInterPart.appendChild(doc.createTextNode("40.00"));
            ICMSUFDest.appendChild(pICMSInterPart);
            
            Element vFCPUFDest = doc.createElement("vFCPUFDest");
            vFCPUFDest.appendChild(doc.createTextNode("0.00"));
            ICMSUFDest.appendChild(vFCPUFDest);
            
            Element vICMSUFDest = doc.createElement("vICMSUFDest");
            vICMSUFDest.appendChild(doc.createTextNode("6.11"));
            ICMSUFDest.appendChild(vICMSUFDest);
            
            Element vICMSUFRemet = doc.createElement("vICMSUFRemet");
            vICMSUFRemet.appendChild(doc.createTextNode("9.16"));
            ICMSUFDest.appendChild(vICMSUFRemet);
            
            /**
             * FIM DAS INFORMACOES DO ICMS INTER
             */
            
            /**
             * FIM DAS INFORMACOES DE IMPOSTO DA NOTA FISCAL
             * 
             */
            
            Element infAdProd = doc.createElement("infAdProd");
            infAdProd.appendChild(doc.createTextNode("EAN 4057284362269  - Preto+Prata"));
            det.appendChild(infAdProd);
            
            /**
             *
             * FIM DO ELEMENTO DE DETALHE DA NOTA FISCAL
             *
             */
            
            
            
            // Elemento Informações do total da Nota Fiscal Eletronica
            Element total = doc.createElement("total");
            infNFe.appendChild(total);
            
            Element ICMSTot = doc.createElement("ICMSTot");
            total.appendChild(ICMSTot);
            
            Element vBCTot = doc.createElement("vBC");
            vBCTot.appendChild(doc.createTextNode("254.40"));
            ICMSTot.appendChild(vBCTot);
            
            Element vICMSTot = doc.createElement("vICMS");
            vICMSTot.appendChild(doc.createTextNode("30.53"));
            ICMSTot.appendChild(vICMSTot);
            
            Element vICMSDeson = doc.createElement("vICMSDeson");
            vICMSDeson.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vICMSDeson);
            
            Element vFCPUFDest2 = doc.createElement("vFCPUFDest");
            vFCPUFDest2.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vFCPUFDest2);
            
            Element vICMSUFDest2 = doc.createElement("vICMSUFDest");
            vICMSUFDest2.appendChild(doc.createTextNode("6.11"));
            ICMSTot.appendChild(vICMSUFDest2);
            
            Element vICMSRemet = doc.createElement("vICMSRemet");
            vICMSRemet.appendChild(doc.createTextNode("9.16"));
            ICMSTot.appendChild(vICMSRemet);
            
            Element vBCST = doc.createElement("vBCST");
            vBCST.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vBCST);
            
            Element vST = doc.createElement("vST");
            vST.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vST);
            
            Element vProd2 = doc.createElement("vProd");
            vProd2.appendChild(doc.createTextNode("239.90"));
            ICMSTot.appendChild(vProd2);
            
            Element vFrete2 = doc.createElement("vFrete");
            vFrete2.appendChild(doc.createTextNode("14.50"));
            ICMSTot.appendChild(vFrete2);
            
            Element vSeg = doc.createElement("vSeg");
            vSeg.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vSeg);
            
            Element vDesc = doc.createElement("vDesc");
            vDesc.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vDesc);
            
            
            Element vII = doc.createElement("vII");
            vII.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vII);
            
            Element vIPI2 = doc.createElement("vIPI");
            vIPI2.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vIPI2);
            
            
            Element vPIS2 = doc.createElement("vPIS");
            vPIS2.appendChild(doc.createTextNode("4.20"));
            ICMSTot.appendChild(vPIS2);
            
            
            Element vCOFINS2 = doc.createElement("vCOFINS");
            vCOFINS2.appendChild(doc.createTextNode("19.33"));
            ICMSTot.appendChild(vCOFINS2);
            
            
            Element vOutro = doc.createElement("vOutro");
            vOutro.appendChild(doc.createTextNode("0.00"));
            ICMSTot.appendChild(vOutro);
            
            
            Element vNF = doc.createElement("vNF");
            vNF.appendChild(doc.createTextNode("254.40"));
            ICMSTot.appendChild(vNF);
            
            
            

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
