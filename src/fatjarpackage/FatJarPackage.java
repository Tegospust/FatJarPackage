/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatjarpackage;

import com.ounis.convtools.ConvTools;

/**
 *
 * @author AndroidDev
 */
public class FatJarPackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // https://stackoverflow.com/questions/19150811/what-is-a-fat-jar
        // https://dzone.com/articles/how-build-fat-jar-using
        //
        //
//         do pliku build.xml wkleić zawartość pliku build_fat_jar.txt przed
//         tagiem końca głównego projektu </project> 
//         w linii: <property name="store.jar.name" value=""/>
//         w polu value wpisać nazwę pliku jaki chcemy żeby był wygenerowany 
//         BEZ ROZSZZERZENIA i zapisać
//         następnie przejść do zakładki Files, prawym klawiszem kliknąć na
//         pliku build.xml i wybrać: Run Target | Other Targets | package-for-store
//         ... i gotowe 
//         skompilowana paczka .jar zawierająca wszystkie podlinkowane biblioteki
//         znajdzie się w katalogu /store projektu głównego
        
        int value = 0;
        String svalue = "666";
        
        value = ConvTools.str2Int(svalue);
        
        System.out.printf(
         "do pliku build.xml wkleić zawartość pliku build_fat_jar.txt przed\n"+
         "końcem głównego projektu </project>\n"+
         "w linii: <property name=\"store.jar.name\" value=\"\"/>\n"+
         "w polu value wpisać nazwę pliku jaki chcemy żeby był wygenerowany\n"+
         "BEZ ROZSZZERZENIA i zapisać\n"+
         "następnie przejść do zakładki Files, prawym klawiszem kliknąć na\n"+
         "pliku build.xml i wybrać: Run Target | Other Targets | package-for-store\n"+
         "... i gotowe \n"+
         "skompilowana paczka .jar zawierająca wszystkie podlinkowane biblioteki\n"+
         "znajdzie się w katalogu /store projektu głównego\n");
        
        System.out.printf("\n(String)%s -> (int)%d\n",svalue, value);
        
    }
    
}
