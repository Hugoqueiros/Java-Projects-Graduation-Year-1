
package pauta_alunos;

import java.io.*;

public class Ficheiro {
    
    private BufferedReader fr;
    private BufferedWriter fw;
    
    public void abreLeitura( String nomeFicheiro ) throws IOException {
        fr = new BufferedReader( new FileReader( nomeFicheiro ) );
    }
    
    public void abreEscrita( String nomeFicheiro ) throws IOException {
        fw = new BufferedWriter( new FileWriter( nomeFicheiro ) );
    }
    
    public void fechaEscrita() throws IOException {
        fw.close();
    }
    
    public String leLinha() throws IOException{
        return fr.readLine();
    }
    
     public void escreveLinha( String linha ) throws IOException{
        fw.write( linha, 0, linha.length());
        fw.newLine();
    }
}
