package studentenmanagementsystem2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StudentenManagementSystem2 {
    private static Set<String> martikelCheck = new HashSet<>();
   
    public static void main(String[] args) {
      
      Universitaet uni = new Universitaet();
       
      int operation = 0;
      
      while(operation < 16){
            System.out.println("Welche Operation moechten Sie durchfuehren?");
            System.out.println("1- Student hinzufuegen");
            System.out.println("2- Studenten auflisten");
            System.out.println("3- Student suchen");
            System.out.println("4- Studentinfo bearbeiten");
            System.out.println("5- Student loeschen");
            System.out.println("6- Dozent hinzufuegen");
            System.out.println("7- Dozent auflisten");
            System.out.println("8- Dozent suchen");
            System.out.println("9- Dozentinfo bearbeiten");
            System.out.println("10- Dozent loeschen");
            System.out.println("11- LVA hinzufuegen");
            System.out.println("12- LVA auflisten");
            System.out.println("13- LVA suchen");
            System.out.println("14- LVAinfo bearbeiten");
            System.out.println("15- LVA loeschen");

            System.out.println("16- Programm beenden");
            
            
            
            Scanner r = new Scanner(System.in);
            operation = r.nextInt();
      
      
      
      switch(operation){
          
        case 1 : 
              // neu Student erstellen
            
            Scanner b = new Scanner(System.in);
            System.out.println("Geben Sie die Martikelnummer");
            String k = b.nextLine();
            System.out.println("Geben Sie die Name");
            String l = b.nextLine();
            System.out.println("Geben Sie die Nachname");
            String m = b.nextLine();
            Studenten s = new Studenten(k,l,m);   
            if(s.checkStudent(k)== 1){
                uni.getList1().add(s);
            }
            
           
            break;
              
        case 2: 
              // alle Studenten auflisten
            for (int i = 0; i < uni.getList1().size(); i++) {
	    s = (Studenten) uni.getList1().get(i);
            System.out.println("Name ist : " + s.getName());
            System.out.println("Nachname ist : " + s.getNachame());
            System.out.println("Martikelnummer ist : " + s.getMartikel());
            }
            
            break;
               
               
        case 3:
              // Student suchen
            System.out.println("Welche Student moechten Sie suchen? " );   
            System.out.println("Bitte geben Sie die Martikelnummer " );  
            Scanner v = new Scanner(System.in);
             for(int i = 0; i<uni.getList1().size(); i++){
                 s = (Studenten) uni.getList1().get(i);
                 if(s.getMartikel().equals(v.nextLine())){
                    System.out.println("Sie haben den Student gefunden");
                 }
                 else{
                    System.out.println("Es gibt kein Student, der diese Martikelnummer hat."); 
                 }
             }
             
            break;
                 
             
           
            
     
        case 4:
               // Studentinformationen bearbeiten 
                
            break; 
                
                
        case 5:
                //student löschen
             System.out.println("Welche Student moechten Sie loeschen? " );   
             System.out.println("Bitte geben Sie die Martikelnummer" );  
             Scanner a = new Scanner(System.in);
             for(int i = 0; i<uni.getList1().size(); i++){
                 s = (Studenten) uni.getList1().get(i);
                 if(s.getMartikel().equals(a.nextLine())){
                     uni.getList1().remove(i);
                    System.out.println("Sie haben den Student geloest");
                 }
                 else{
                    System.out.println("Es gibt kein Student, der diese Martikelnummer hat."); 
                 }
             }
             
            break;
            
            
            
        case 6:
            //Dozent Hinzufugen
            Scanner p = new Scanner(System.in);
            System.out.println("Geben Sie die TC-Nummer");
            String c = p.nextLine();
            System.out.println("Geben Sie die Name");
            String d = p.nextLine();
            System.out.println("Geben Sie die Nachname");
            String e = p.nextLine();
            Dozenten doz = new Dozenten(c,d,e);
            if(doz.checkDozent(c)== 1){
                uni.list2.add(doz);
            }
            
            break;
            
        case 7:
            //Dozent auflisten
            for (int i = 0; i < uni.getList2().size(); i++) {
	    doz = (Dozenten) uni.getList2().get(i);
            System.out.println("Name ist : " + doz.getName());
            System.out.println("Nachname ist : " + doz.getNachame());
            System.out.println("TC-nummer ist : " + doz.getTCnummer());
            }
            
            break;
            
            
        case 8: 
            //Dozent suchen
            System.out.println("Welche Dozent moechten Sie suchen? " );   
            System.out.println("Bitte geben Sie die TC-Nummer " );  
            Scanner t = new Scanner(System.in);
             for(int i = 0; i<uni.getList2().size(); i++){
                 doz = (Dozenten) uni.getList2().get(i);
                 if(doz.getTCnummer().equals(t.nextLine())){
                    System.out.println("Sie haben den Dozent gefunden");
                 }
                 else{
                    System.out.println("Es gibt kein Dozent, der diese TC-Nummer hat."); 
                 }
             }
             
            break;
            
            
        case 9:
            //Dozentinfo bearbeiten
            
            break;
            
        case 10:
            //Dozent loeschen
             System.out.println("Welche Dozent moechten Sie loeschen? " );   
             System.out.println("Bitte geben Sie die TC-Nummer" );  
             Scanner y = new Scanner(System.in);
             for(int i = 0; i<uni.getList2().size(); i++){
                 s = (Studenten) uni.getList2().get(i);
                 if(s.getMartikel().equals(y.nextLine())){
                     uni.getList1().remove(i);
                    System.out.println("Sie haben den Dozent geloest");
                 }
                 else{
                    System.out.println("Es gibt kein Dozent, der diese TC-Nummer hat."); 
                 }
             }
             
            break;
            
        case 11:
            //LVA Hinzufugen
            Scanner o = new Scanner(System.in);
            System.out.println("Bitte Geben Sie die Lehrveransaltungname.");
            String name = o.nextLine();
            Lehrveranstaltung lva = new Lehrveranstaltung(name);
            if(lva.checkLVA(name) == 1){
                System.out.println("Sie haben die Lehrveranstaltung hinzufügt.");
                uni.list3.add(lva); 
            }
            else{
                System.out.println("ungueltige Lehrveranstaltungsname.");
            }
           break;
                
           
            
            
        case 12:
            //LVA auflisten
            for(int i=0; i< uni.list3.size(); i++){
                lva = (Lehrveranstaltung) uni.getList3().get(i);
                System.out.println("Name von LVA : " + lva.getLVAname());
            }
            
            break;
            
        case 13: 
            //LVA suchen
             System.out.println("Welche Lehrveranstaltung moechten Sie suchen? " );   
            System.out.println("Bitte geben Sie die Name " );  
            Scanner x = new Scanner(System.in);
            String na = x.nextLine();
             for(int i = 0; i<uni.getList3().size(); i++){
                 lva = (Lehrveranstaltung) uni.getList3().get(i);
                 if(lva.getLVAname().equals(na)){
                    System.out.println("Sie haben die Lehrveranstaltung gefunden");
                 }
                 else{
                    System.out.println("Es gibt kein Lehrveranstaltung,die diese Name hat."); 
                 }
             }
             
            break;
            
            
        case 14:
            //LVA bearbeiten
            
            break;
            
        case 15:
            //LVA loeschen    
            System.out.println("Welche Lehrveranstaltung moechten Sie loeschen? " );   
            System.out.println("Bitte geben Sie die Name" );  
            Scanner u = new Scanner(System.in);
            String nam = u.nextLine();
           for(int i = 0; i<uni.getList3().size(); i++){
                 lva = (Lehrveranstaltung) uni.getList3().get(i);
                 if(lva.getLVAname().equals(nam)){
                     uni.getList3().remove(i);
                    System.out.println("Sie haben den Lehrveranstaltung geloest");
                 }
                 else{
                    System.out.println("Es gibt keine Lehrveranstaltung,die diese Name hat."); 
                 }
             }
             
            break;
            
            
        case 16:
            
          }
          
      
          
      }
      
      
       
    }
      

      
    }
    