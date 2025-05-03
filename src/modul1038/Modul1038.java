/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1038;

/**
 *
 * @author Hiddd
 */
public class Modul1038 {

  
    
    public static void main(String[] args) {
       
      int data [][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};
      
      int JumlahElemen = 0; 
      int TotalElemen = 0; 
     
      for (int z = 0; z < data.length; z++){
      for (int x = 0; x < data[0].length; x++){
        System.out.print(data[z][x] + " ");
        JumlahElemen += data [z][x];
        TotalElemen ++;
      }      
          System.out.println("\n");  
          
    } 
      double RataRata = (double) JumlahElemen / TotalElemen;
        System.out.println("Rata rata dari Array diatas adalah\n"+ RataRata);
    
    }
}

