
package PROTECAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BUSCADOR {

    private String pendrive = "";
        
   public BUSCADOR(){//Construtor 
  
}



   public void PEN1 (){
    pendrive = "F";
    String nome = pendrive + ":\\*.*";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
                
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    catch (IOException e) {
       System.err.printf("%s.\n",e.getMessage());
       BUSCADOR AT = new BUSCADOR();
       AT.PEN2();
    }

 }//Fim do método PEN1
 
     public void PEN2 (){
    pendrive = "E";
    String nome = pendrive + ":\\*.*";
       
     try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
 
                
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    catch (IOException e) {
       System.err.printf("%s.\n",e.getMessage());
       BUSCADOR AT = new BUSCADOR();
       AT.PEN3();
    }

 }//Fim do método PEN2
 
   
 public void PEN3 (){
    pendrive = "H";
     String nome = pendrive + ":\\*.*";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
   
                
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    catch (IOException e) {
     System.err.printf("%s.\n",e.getMessage()); 
     BUSCADOR AT = new BUSCADOR();
     AT.PEN4();
     
    }

 }//Fim do método PEN3

  public void PEN4 (){
     pendrive = "G";
     String nome = pendrive + ":\\*.*";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
  
                
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    catch (IOException e) {
      System.err.printf("%s.\n",e.getMessage());
    }

    
}//Fim do método PEN4

}//Fim da Classe ATIVAÇÃO
