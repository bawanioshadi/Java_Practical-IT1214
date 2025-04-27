
import it.*;
import it.hons.*;
import amc.*;

class App1 {
    public static void main(String[] ar) {
        amc.FirstYear amcFya = new amc.FirstYear();
        it.FirstYear itFya = new it.FirstYear();
        SecondYear sy = new SecondYear();
        FourthYear itHons = new FourthYear();
        
        amcFya.display();
        itFya.display();
        sy.display();
        itHons.display();
    }
}