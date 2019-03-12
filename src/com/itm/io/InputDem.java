/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itm.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Niba
 */
public class InputDem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String path = "c://Users/Niba/Desktop/ni.txt";
       File file = new File(path);
       //java.io.File file = new java.io.File(path); for direct path without import
       
if(file.exists())
{
    System.out.println("File Exists");
    System.out.println("Dir:"+file.isDirectory());
    System.out.println("Size in KB:"+(file.length()));
    
}
//stream based input operation 
FileInputStream fis = null;
//declaring fis outside try block for proper closing of fis
   try{
        fis = new FileInputStream(file);
       //opens a file resources for input operations
       //performs some task on open resources
       ///close  that resources
   
       int i;
       
       
       while((i=fis.read()) != -1){
           //-1 end of stream value
           System.out.println((char)i);
       }
   }
   catch(FileNotFoundException e){
       System.out.println(e);
   }
   catch(IOException e){
       System.out.println(e);
   }
   finally{
       
//close that resources
try{
                fis.close();
   }
   catch(IOException e){
           System.out.println(e);
           }
    }
    }
}
