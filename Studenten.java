package studentenmanagementsystem2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Studenten extends Personen{
    private static Set<String> martikelCheck = new HashSet<>();
    Universitaet uni = new Universitaet();
    private String fachName= "";
    private int semesterNummer = -1;
    private int vorlesungZahl = 0;
    private int notenDurchschnitt = -1;
    
    
    public Studenten(String k){
            this.martikelNummer = k;
        
    }
    
    
    public Studenten(String k, String l, String m){
        
       
        this.martikelNummer = k;
        this.name = l;       
        this.nachname = m.toUpperCase();
   
    }
    
    
   
    public String getMartikel(){
        return this.martikelNummer;
    }

    public int checkMartikel(){
        return -1;
        
    }

   public static int checkStudent(String a){
        try {
                
                if(a.length() != 7 ){
                    throw new NumberException();
                }
                else if(a.charAt(0)=='0'){
                    throw new NumberException("erste Zahl soll kein null sein.");
                }
            }
            catch(NumberException e){
                System.out.println(e.getMessage());
                return -1;
            }
            
            try{
            if(martikelCheck.add(a)){
               
            }
            else{
                throw new NumberExceptionMartikel();    
            }
        }catch(NumberExceptionMartikel e){
            System.out.println("Es gibt noch ein Student mit gleichen MartikelNummer");
            return -1;
        }
        return 1;
    }
}
    
