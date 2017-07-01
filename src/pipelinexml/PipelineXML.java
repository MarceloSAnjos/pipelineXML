/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipelinexml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author maeda
 */
public class PipelineXML {

    /**
     * @param args the command line arguments
     */
    private static GeradorXstream geradorx;

    private static GeradorJAXB geradorj;

    private static GeradorDOM geradord;

    private static NotaCompletaNFe nfeProc = new NotaCompletaNFe();

    public static Instant inicio, fim;

    public static Duration tempoGasto;

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        geradorx = new GeradorXstream(nfeProc);

        geradorj = new GeradorJAXB();

        geradord = new GeradorDOM();

         testeXStream(100000);
        // testeJAXB();
         testeDOM(100000);

        
    }

    public static void testeXStream(int tamanho) throws IOException {
        
        String complemento;
        
        switch(tamanho){
            case 10000:
                complemento = "dezMil";
                break;
            case 100000:
                complemento = "cemMil";
                break;
            case 1000000:
                complemento = "umMilhao";
                break;
            default:
                complemento = "";
                break;
        }

        BufferedWriter out = null;

        try {
            FileWriter fstream = new FileWriter(complemento + "Xstream.csv", true); //true tells to append data.

            out = new BufferedWriter(fstream);

            for (int i = 0; i < 30; i++) {

                inicio = Instant.now();

                for (int j = 0; j < tamanho; j++) {

                    geradorx.toXMLFile(nfeProc, "notaXStream.xml");

                }

                fim = Instant.now();

                tempoGasto = Duration.between(inicio, fim);

                if (i == 0) {
                    out.write(String.valueOf(tempoGasto.toMillis()));
                } else {
                    out.write("," + String.valueOf(tempoGasto.toMillis()));
                }

            }

        } catch (Exception e) {
            System.out.println("Fim do teste");
        }

        out.close();

    }

    public static void testeJAXB(int tamanho) throws IOException {
        
        String complemento;
        
         switch(tamanho){
            case 10000:
                complemento = "dezMil";
                break;
            case 100000:
                complemento = "cemMil";
                break;
            case 1000000:
                complemento = "umMilhao";
                break;
            default:
                complemento = "";
                break;
        }

        BufferedWriter out = null;

        try {
            FileWriter fstream = new FileWriter(complemento + "JAXB.csv", true); //true tells to append data.

            out = new BufferedWriter(fstream);

            for (int i = 0; i < 30; i++) {

                inicio = Instant.now();

                for (int j = 0; j < tamanho; j++) {

                    System.out.println(j);

                    geradorj.jaxbObjectToXML(nfeProc);

                }

                fim = Instant.now();

                tempoGasto = Duration.between(inicio, fim);


                if (i == 0) {
                    out.write(String.valueOf(tempoGasto.toMillis()));
                } else {
                    out.write("," + String.valueOf(tempoGasto.toMillis()));
                }

            }

        } catch (Exception e) {
            System.out.println("Fim do teste");
        }

        out.close();

    }

    public static void testeDOM(int tamanho) throws IOException {
        
        String complemento;
        
         switch(tamanho){
            case 10000:
                complemento = "dezMil";
                break;
            case 100000:
                complemento = "cemMil";
                break;
            case 1000000:
                complemento = "umMilhao";
                break;
            default:
                complemento = "";
                break;
        }

        BufferedWriter out = null;

        try {
            FileWriter fstream = new FileWriter(complemento + "DOM.csv", true); //true tells to append data.

            out = new BufferedWriter(fstream);

            for (int i = 0; i < 30; i++) {

                inicio = Instant.now();

                for (int j = 0; j < tamanho; j++) {

                    geradord.geraXML();

                }

                fim = Instant.now();

                tempoGasto = Duration.between(inicio, fim);

                if (i == 0) {
                    out.write(String.valueOf(tempoGasto.toMillis()));
                } else {
                    out.write("," + String.valueOf(tempoGasto.toMillis()));
                }

            }

        } catch (Exception e) {
            System.out.println("Fim do teste");
        }

        out.close();

    }

}
