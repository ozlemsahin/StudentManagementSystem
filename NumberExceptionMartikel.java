
package studentenmanagementsystem2;


public class NumberExceptionMartikel extends Exception{
    public NumberExceptionMartikel(){
        super("Es gibt noch ein Student mit gleiche MartikelNummer.");
    }
}
