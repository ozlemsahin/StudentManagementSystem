package studentenmanagementsystem2;


public class Dozenten extends Personen{
    
    private String titel = "";
    private String tcNummer = "";
    
    public Dozenten (String tcNummer, String name, String nachname){
    this.tcNummer = tcNummer;
    this.name = name;
    this.nachname = nachname;
    
    
    }
    
    
    public String getTCnummer(){
        return this.tcNummer;
    }
   
    public static int checkDozent(String a){
        try{
                if(a.length() != 11){
                    throw new NumberExceptiontc();
                }
        }catch(NumberExceptiontc e){
                    System.out.println("TC Nummer soll aus 11 Zahlen bestehen.");
                    return -1;
                }
        return 1;
    }
    
}
