package latarnie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/**
 *
 * @author Lenovo
 */
public class Latarnie {

    static int col;
    static int row;
    static Pole[][] tab;
    File plik;

    public static void main(String[] args) throws FileNotFoundException {

        //z_pliku();
//        File plik = new File("aaa.txt");
//        Scanner in = new Scanner(plik);
//       // byte b = in.nextByte();
//        // System.out.println((char)b);
//        int licznik = 0;
//        while (in.hasNextLine()) {
//            String pom = in.nextLine();
//            licznik++;
//        }
//        int licznik1 = 0;
//        in = new Scanner(plik);
//        while (in.hasNextLine()) {
//            StringTokenizer token = new StringTokenizer(in.nextLine(), " ");
//            while (token.hasMoreElements()) {
//                //licznik1 = token.countTokens();
//                String a = token.nextToken();
//                //tab[licznik].list.add(Integer.parseInt(token.nextToken()));
//                licznik1++;
//            }
//
//        }
//        col = licznik1 / licznik;
//        row = licznik;
//
//        int col1 = licznik1 / licznik;
//        int row1 = licznik;
//
//        //System.out.println("Kolumny:" + col);
//        //System.out.println("Wiersze" + row);
//
//        Pole[][] tab = new Pole[12][12];
//        int i = 0;
//        int j = 1;
//
//        for (int k = 0; k < 12; k++) {
//            for (int l = 0; l < 12; l++) {
//                tab[l][k] = new Pole(0,0, false);
//
//            }
//
//        }
//
//        in = new Scanner(plik);
//        while (in.hasNextLine()) {
//            StringTokenizer token = new StringTokenizer(in.nextLine(), " ");
//            while (token.hasMoreElements()) {
//                for (i = 1; i < col + 1; i++) {
//                    int a = Integer.parseInt(token.nextToken());
//                    tab[i][j] = new Pole(a,a, false);
//                }
//            }
//            if (in.hasNextLine()) {
//                j++;
//            }
////        }
//        Pole[][] tab = new Pole[12][12];
//        for (int k = 0; k < 12; k++) {
//            for (int l = 0; l < 12; l++) {
//                tab[l][k] = new Pole(0,0, false);
//
//            }
//
//        }
//        
//        wczytywanie(tab);
////////////////////////////////////////////////////////////////////////////////////////
////     for(i=0;i<row;i++)
////     {
////         for (j = 0; j < col; j++) {
////             if(i==0 || j== 0)
////             tab[i][j] = new Pole(0,false);            
////         }
////     }
//        for (int i = 1; i < row + 1; i++) {
//            for (int j = 1; j < col + 1; j++) {
//                System.out.print(tab[j][i].pole + " ");
//            }
//            System.out.println("");
//        }
////System.out.println(col);
//        
//        System.out.println("/////////////////////////////");
//        pokrycie(tab);
//
////        for (i = 1; i < row + 1; i++) {
////            for (j = 1; j < col + 1; j++) {
////                System.out.print(tab[j][i].pokryte + " ");
////            }
////            System.out.println("");
////        }
////        
//        //System.out.println(czy_pokryte(tab));
//        usuwanie(tab);
//        
//         for (int i = 1; i < row + 1; i++) {
//            for ( int j = 1; j < col + 1; j++) {
//                System.out.print(tab[j][i].latarnia + " ");
//            }
//            System.out.println("");
//        }
         //pokrycie(tab);
         
         
//         System.out.println(czy_pokryte(tab));
//          for (i = 1; i < row + 1; i++) {
//            for (j = 1; j < col + 1; j++) {
//                System.out.print(tab[j][i].pokryte + " ");
//            }
//            System.out.println("");
//        }
//
//          System.out.println("////////////////////////////////////////////////");
          
          
//           for (i = 1; i < row + 1; i++) {
//            for (j = 1; j < col + 1; j++) {
//                System.out.print(tab[j][i].pokryte + " ");
//            }
//            System.out.println("");
//        }
//           System.out.println(czy_pokryte(tab));
         
         Teren teren = new Teren();
         teren.setVisible(true);
         
//           for (int ii = 1; ii < row +1; ii++) {
//              for (int jj = 1; jj < col+1; jj++) {
//                  Teren.cos[jj][ii].setEnabled(false);
//                 if(tab[jj][ii].pole ==1)
//                 {
//                  //System.out.println(Latarnie.tab.length);
//                     Teren.cos[jj][ii].setVisible(true);
//                     if(tab[jj][ii].latarnia == 1)
//                     {
//                         Teren.cos[jj][ii].setSelected(true);
//                         //Teren.cos[jj][ii].setEnabled(false);
//                     }
//                     else{
//                         //Teren.cos[jj][ii].setVisible(false);
//                     }
//                 }
//                 
//             }
//            
//        }
        
    }

     static void wyswietlanie(Pole[][] tab)
         {
              for (int i = 1; i < 11; i++) {
              for (int j = 1; j < 11; j++) {
                 if(tab[j][i].pole ==1)
                 {
                  //System.out.println(Latarnie.tab.length);
                     if(tab[j][i].latarnia == 1)
                     {
                         Teren.cos[j][i].setSelected(true);
                     }
                     else
                     {
                         Teren.cos[j][i].setSelected(false);
                     }
                     Teren.cos[j][i].setVisible(true);
                     Teren.cos[j][i].setEnabled(false);
                 }
                 else
                 {
                     Teren.cos[j][i].setVisible(false);
                 }
                 
             }
            
        }
         }
    
    
    
    static void pokrycie(Pole[][] tab) {
        for (int j = 1; j < 11; j++) {
            for (int i = 1; i < 11; i++) {
                if (tab[i][j].pole == 1 && (tab[i][j].latarnia==1 ||tab[i][j - 1].latarnia == 1 || tab[i][j + 1].latarnia == 1 || tab[i - 1][j].latarnia == 1
                        || tab[i + 1][j].latarnia == 1 || tab[i - 1][j - 1].latarnia == 1 || tab[i + 1][j + 1].latarnia == 1
                        || tab[i + 1][j - 1].latarnia == 1 || tab[i - 1][j + 1].latarnia == 1)) {
                    tab[i][j].pokryte = true;
                }
                else
                {
                    tab[i][j].pokryte = false;
                }

            }

        }

        //System.out.println(tab[0][0].wartosc);
    }

    static int czy_pokryte(Pole[][] tab) {
        int warunek = 1;
    
        for (int j = 1; j < 11; j++) {
            for (int i = 1; i < 11; i++) {
               // if (tab[i][j].pole == 1 && tab[i][j].pokryte == true) {
                //    warunek = 1;
              //  } else 
            if (tab[i][j].pole == 1 && tab[i][j].pokryte == false) {
                    //System.out.println(i);
                    warunek = 0;
                    break;
                }
            }

        }
        return warunek;
    }
    
    public static void usuwanie(Pole[][] tab){
    for (int j= 1; j < 11; j++) {
            for (int i = 1; i < 11; i++) {
                if(tab[i][j].latarnia == 1)
                {
                tab[i][j].latarnia = 0;
                pokrycie(tab);
                if(czy_pokryte(tab) == 0)
                tab[i][j].latarnia =1 ;    
            }
            }
            
            }    
    }
    
    
    
    static void wczytywanie(Pole[][] tab) throws FileNotFoundException
    {
       JFileChooser fileChooser = new JFileChooser();
//fileChooser.showOpenDialog(this);
    //File selectedFile = fileChooser.getSelectedFile();
    //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
Scanner in = null;
File plik = null;
fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
      //  final JFileChooser fc = new JFileChooser();
       if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
       {
          plik =  fileChooser.getSelectedFile();//new File("aaa.txt");
          in = new Scanner(plik);
       }
        
       // byte b = in.nextByte();
        // System.out.println((char)b);
        int licznik = 0;
        while (in.hasNextLine()) {
            in.nextLine();
            licznik++;
        }
        int licznik1 = 0;
        in = new Scanner(plik);
        while (in.hasNextLine()) {
            StringTokenizer token = new StringTokenizer(in.nextLine(), " ");
            while (token.hasMoreElements()) {
                //licznik1 = token.countTokens();
                token.nextToken();
                //tab[licznik].list.add(Integer.parseInt(token.nextToken()));
                licznik1++;
            }

        }
        col = licznik1 / licznik;
        row = licznik;

        int col1 = licznik1 / licznik;
        int row1 = licznik;

        //System.out.println("Kolumny:" + col);
        //System.out.println("Wiersze" + row);

        
        int i = 0;
        int j = 1;

        System.out.println(row);
        System.out.println(col);
        System.out.println(licznik1);
        System.out.println(licznik);
        in = new Scanner(plik);
        while (in.hasNextLine()) {
            StringTokenizer token = new StringTokenizer(in.nextLine(), " ");
            while (token.hasMoreElements()) {
                for (i = 1; i < col+1; i++) {  /////////////////////////////////////////+1
                    int a = Integer.parseInt(token.nextToken());
                    tab[i][j] = new Pole(a,a, false);
                }
            }
            if (in.hasNextLine()) {
                j++;
            }
        }
    }
    
    
   
    
}
