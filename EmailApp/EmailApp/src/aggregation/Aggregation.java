/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.Scanner;

/**
 *
 * @author Fadi
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //create a label
        Label Lexams=new Label("Music Events",3);
        //enter the email information
        for(int i=0;i<Lexams.getEmails().length;i++){
            System.out.print("Enter the sender and destination: ");
            String s=input.next();
            String d=input.next();
            
            System.out.print("Is it with attachement? [1 for yes]");
            int withAttach=input.nextInt();
            
             boolean attach;
            if(withAttach==1){
                attach=true;
            }
            else{
                attach=false;
            }
            //create an email object
            Email e=new Email(s,d,attach);
            //add or not an atatchement
            System.out.println("Do you want to add attachement? [1 for yes]");
            int add=input.nextInt();
            if(add==1)
                e.addAttachement();
            
            //add an email
             Lexams.addEmail(e);
            }//end for loop
          //count the number of emails with attachement
            System.out.println("The number of emails with attachement is "+countNbEmailWithAttachments(Lexams));    
            
            //display all the details
            Lexams.displayList();
        }
    public static int countNbEmailWithAttachments (Label L){
        int count=0;
        Email[] arrayEmails=L.getEmails();
       for(int i=0;i<arrayEmails.length;i++){
           if(arrayEmails[i].withAttachement()==true)
               count++;
       }
       return count;
    }
    
    }
        
    
    

