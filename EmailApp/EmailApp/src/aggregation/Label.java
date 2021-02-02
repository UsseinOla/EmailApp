/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author Fadi
 */
public class Label {
    private String description;
    private Email[] List;
    public Label(){
        this.List=new Email[10];
    }
    public Label(String description, int nbEmails){
        this.List=new Email[nbEmails];
        this.description=description;
    }
    public Email[] getEmails(){
        return this.List;
    }
    public void addEmail(Email e){
        
        for(int i=0;i<this.List.length;i++){
            if(this.List[i]==null)
            {  this.List[i]=e;break;}
        }
    }
    public void removeEmail(Email e){
        for(int i=0;i<this.List.length;i++){
            if(this.List[i].getSender().equals(e.getSender()) && this.List[i].getDestination().equals(e.getDestination()))
            {this.List[i]=null;}
        }
    }
    public void displayList(){
        for(int i=0;i<this.List.length;i++){
            this.List[i].print();
        }
    }
}
