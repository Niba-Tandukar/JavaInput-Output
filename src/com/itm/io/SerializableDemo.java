/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itm.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Niba
 */
public class SerializableDemo {
    public static void main(String [] args){
        Employee e = new Employee();
        e.setId(1001);
        e.setName("NIba tandukar");
        e.setSalary(1500);
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            fos = new FileOutputStream("c://Users/Niba/Desktop/employee.txt");
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(e);
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        finally{
            try{
            if(oos!=null){
  
                oos.close();
            }
           if(fos != null){
               fos.close();
           }
            }catch(IOException ex){
                    System.out.println(ex);
                    }
            
    }
   
        
    }
}
