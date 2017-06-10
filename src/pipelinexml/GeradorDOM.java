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
             * FIM DOS ELEMENTOS PERTENCENTES AS INFORMACOES DE IDENTIFICACAO DA NFe
             * 
             */

            // Elemento Informações do emissor da Nota Fiscal
            Element emit = doc.createElement("emit");
            infNFe.appendChild(emit);

            // Elemento Informações do destinatário Nota Fiscal Eletronica
            Element det = doc.createElement("det");
            infNFe.appendChild(det);

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
