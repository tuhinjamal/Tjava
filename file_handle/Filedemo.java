/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_handle;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class Filedemo {
    
    public static void main(String[] args) {
        String name;
        
            Scanner input = new Scanner(System.in);
            System.out.println(" type 1 to create file \n 2 to create directory \n 3 delete file folder \n 4 delete a file");   
          
            int n = input.nextInt();
                
                int choice =n;
                
                switch(choice){
          
                    
                    
                    case 1:
                        try{
                            System.out.println("input file name");
                             name = input.next();
                            File file = new File("C:/Users/tuhin/Desktop/"+name); 
                            file.createNewFile();
                            
                        }catch(IOException e){
                        
                            System.out.println(e);
                        }
                        break;
                    case 2:
                         String nm = input.next();
            
            File dir = new File("C:/Users/tuhin/Desktop/"+nm);
                        
                        dir.mkdir();
                        System.out.println("has been created");
                        break;
                    case 3:
                        System.out.println("enter folder name that you want to delete");
                         String nmm = input.next();
                        File dirr = new File("C:/Users/tuhin/Desktop/"+nmm);
            
           
                        dirr.delete();
                        System.out.println(dirr.getName()+" Folder has been deleted");    
                        break;
                        
                    case 4:
                        System.out.println("input file name that you want to delete");
                        name = input.next();
                           File myObj = new File("C:/Users/tuhin/Desktop/"+name); 
                             if (myObj.delete()) { 
                            System.out.println("Deleted the file: " + myObj.getName());
                        } else {
                      System.out.println("Failed to delete the file.");
                      } 
  }
                           
                }
                
            
        
                
                    
         
                            
        }
   
    
    
    
    
        

