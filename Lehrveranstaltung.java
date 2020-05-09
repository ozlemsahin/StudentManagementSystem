
package studentenmanagementsystem2;


public class Lehrveranstaltung {
    String lvaName = "";
    
    public Lehrveranstaltung(String lvaName){
        this.lvaName = lvaName;
    }
    
    public String getLVAname(){
        return this.lvaName;
    }
    
    public static int checkLVA(String a){
        try{
           for(int i=0; i<3; i++){
                if(a.charAt(i) < '[' && a.charAt(i) > '@' && a.charAt(i+3) < ':' && a.charAt(i+3) > '/'){
                }  
                else {
                    throw new NumberExceptionLVA();
                }
            }
        }catch(NumberExceptionLVA e){
                return -1;
        }
        return 1;

    }
        
    }

