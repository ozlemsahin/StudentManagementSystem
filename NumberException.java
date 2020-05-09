
package studentenmanagementsystem2;


public class NumberException extends Exception{
   
    public NumberException(){
        super("Diese Martikelnummer soll 7 Zahle enthalten.");
    }
    
    public NumberException(String a){
        super(a);
    }
}
