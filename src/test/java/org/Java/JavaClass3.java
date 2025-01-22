package org.Java;

import java.io.File;
import java.io.IOException;

public class JavaClass3 {
    
    public static void main(String[] args) throws IOException {
        
        File f = new File("C:\\Users\\prsha\\Desktop\\Eclipse Projects\\MavenProject\\target\\Reports\\report1.xml");
        File f1 = new File("C:\\Users\\prsha\\Desktop\\Eclipse Projects\\MavenProject\\target\\Reports\\report1.xlsx");
        File f2 = new File("C:\\Users\\prsha\\Desktop\\Eclipse Projects\\MavenProject\\target\\Reports\\report1.file");
        
        try {
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("XML File already exists.");
            }

            
        } catch (IOException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        
        try {
            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getName());
            } else {
                System.out.println("Excel File already exists.");
            }

            
        } catch (IOException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        
        try {
            if (f2.createNewFile()) {
                System.out.println("File created: " + f2.getName());
            } else {
                System.out.println("File already exists.");
            }

            
        } catch (IOException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        
        
        
    
        
        
    }}

