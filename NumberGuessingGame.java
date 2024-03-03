/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oasis.infobyte;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.sql.*;
/**
 *
 * @author raksh
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int no,rno;
        int count=0;
        int attempt=5;
        Scanner s=new Scanner(System.in);
        while(attempt>0){
            Random r=new Random();
            System.out.println("Guess the no.: ");
            no=s.nextInt();
            rno=r.nextInt(100)+1;
            
            if(no==rno){
                System.out.println("Correct Answer you have credited 1 point");
                count++;
                System.out.println("So your total score is: "+count);
                System.out.println("Now you have "+(attempt-1)+"attempts");
            }
            else{
                System.out.println("Wrong prediction\n The correct answer is "+rno+" So your current score: "+count);
                System.out.println("Now you have "+(attempt-1)+" attempts");
            }
            attempt--;
        }
        
        
    }
    
}
