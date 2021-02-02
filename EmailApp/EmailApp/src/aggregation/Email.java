/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.Date;

/**
 *
 * @author Fadi
 */
public class Email {
    private String sender;
    private String destination;
    private boolean withAttachement;
    private int nbFiles;
    private Date dateStamp;
    public Email(){
        
     }
    public Email(String sender, String destination, boolean attach){
        this.sender=sender;
        this.destination=destination;
        this.withAttachement=attach;
        if(this.withAttachement==true){
            this.nbFiles=1;//or call addAttachement() to increment the number of files
        }
        else
            this.nbFiles=0;
        this.dateStamp=new Date();
        
    }
    public String getSender(){
        return this.sender;
    }
    
    public String getDestination(){
        return this.destination;
    }
    public boolean withAttachement(){
        return this.withAttachement;
    }
    public void addAttachement(){
 
     if(this.nbFiles<5)
     {  this.nbFiles++;
      this.withAttachement=true;
     }
     
    }
    public void removeAttachement(){
        if(this.withAttachement==true){
            { nbFiles--;
                if(this.nbFiles==0) 
                    this.withAttachement=false;
            }
            
        }
    }
    public void print(){
        System.out.println("Email, From: "+this.getSender() +" To: "+this.destination);
        System.out.println("\t Created on "+this.dateStamp);
      
        if(this.withAttachement==true){
            System.out.println("\tThe number of attached files is "+this.nbFiles);
        }
        else
            System.out.println("\t Email with no attachement");
    }
}
