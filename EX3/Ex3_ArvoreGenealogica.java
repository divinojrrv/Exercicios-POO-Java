package PROVA_OO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex3_ArvoreGenealogica {
	
	 
    public static void CriarArquivo(String arquivo) throws IOException{
        FileWriter file = new FileWriter(arquivo, true);
    }
    
    public static void EscreverArquivo(String arquivo, String texto) throws FileNotFoundException, IOException{
        OutputStream os = new FileOutputStream(arquivo, true);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(texto);
        bw.newLine();
        bw.close();
    }
    
    public static void LerArquivo(String arquivo) throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream(arquivo);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        
        while (s!=null){
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        Mae mae = new Mae("Carmem",46);
        Pai pai = new Pai("Divino",52);
        Filho filho = new Filho ("Junior",24);
        
        CriarArquivo("arquivo_ex3_ArvoreG.txt");
        
        EscreverArquivo("arquivo_ex3_ArvoreG.txt", "Nome ----------- :  " + filho.getNome());
        EscreverArquivo("arquivo_ex3_ArvoreG.txt", "Idade ---------- :  " + filho.getIdade());
        EscreverArquivo("arquivo_ex3_ArvoreG.txt", "Nome do Mãe ---- :  " + mae.getNome());
        EscreverArquivo("arquivo_ex3_ArvoreG.txt", "Nome do Pai ---- :  " + pai.getNome());

        LerArquivo("arquivo_ex3_ArvoreG.txt");  
    }
}
