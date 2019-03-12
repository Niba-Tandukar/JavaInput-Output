/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itm.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Niba
 */
public class OutputDemo {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("c://Users/Niba/Desktop/dest.txt");

            //first open a file to write upon i.e ni.txt
            fis = new FileInputStream("c://Users/Niba/Desktop/src.txt");

            //then open a source file to read from i.e src.txt
            //now read data from source and write it onto dest file
            int i;
            while ((i = fis.read()) != -1 ) {
               fos.write(i);
                System.out.println((char)i);
            }
            
                
        //read data into i and write value of i into output stream
        fos.write(i);
                System.out.println((char) i);
            }
            catch(FileNotFoundException e)
                    {
           System.out.println(e);
           }
            catch(IOException e)
                    {
           System.out.println(e);
           }
        finally{
            try{
                if (fos != null){
                    fos.close();
                }
                if (fis != null){
                    fis.close();
                }
            }
            catch(IOException e){
                System.out.println(e);
            }
            
        }

    }
    }


