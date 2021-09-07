
/** 
 * @author Alain Louzeiro Mota
 * @version 1.0 
 */

package PROTECAO;

import java.io.IOException;
import javax.swing.JOptionPane;

public class EXTENCAODES{
    
private static String pendrive = "G";    
        
   public EXTENCAODES(){//Construtor 
                    
}
   

public void PENF(){
    EXTENCAODES.UnidadeF();
}

private static void UnidadeF (){

String TAKEOWN1 = "/f \"/" + pendrive + ":\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"" + pendrive + ":\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"" + pendrive + ":\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"" + pendrive + ":\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"" + pendrive + ":\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"" + pendrive + ":\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"" + pendrive + ":\\*.*\" /S /D /L";
         
String DEL1 = "del /Q \"" + pendrive + ":\\*.lnk\"";
String DEL2 = "del /Q \"" + pendrive + ":\\*.vbs\"";

String RD1 = "rd /S /Q \"" + pendrive + ":\\.Trashes\"";
String RD2 = "rd /S /Q \"" + pendrive + ":\\.Dtrashes\"";           

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {   
 ex.printStackTrace(); 
 } 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "Atalhos removidos!");
System.exit(0);

}//FIM DO MÉTODO DESISTALAÇÃO


}



