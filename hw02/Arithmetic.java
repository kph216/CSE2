////////////////////////////////////////////////////////////////////////
// Kyle Hughes
// 9/9/14
// hw02
// Purpose: Compute the cost of items bought at Walmart,
// including PA sales tax

//define class
public class Arithmetic{
    
//add main method
public static void main(String[] args) {
    //input variables
    int nSocks=3; //Number of pair of socks
    double sockCost$=2.58; //Cost per pair of socks
    int nGlasses=6;  //Number of drinking glasses
    double glassCost$=2.29; //Cost per glass
    int nEnvelopes=1;  //Number of boxes of envelopes
    double envelopeCost$=3.25; //Cost per box of envelopes
    double taxPercent=0.06; //sales tax in PA
    double totalSockCost$, SockTax$; //total cost of socks
    double totalGlassCost$, GlassTax$; //total cost of glasses
    double totalEnvelopeCost$, EnvelopeTax$; //total cost of envelopes
    double totalCost$; //Total cost of purchases (before tax)
    double totalPaid$; //Total actually paid including tax
    //equations
    totalSockCost$=nSocks*sockCost$;
    SockTax$=nSocks*sockCost$*taxPercent;
    totalGlassCost$=nGlasses*glassCost$;
    GlassTax$=nGlasses*glassCost$*taxPercent;
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    EnvelopeTax$=nEnvelopes*envelopeCost$*taxPercent;
    totalCost$=(totalSockCost$*totalGlassCost$*totalEnvelopeCost$);
    totalPaid$=(totalSockCost$+SockTax$)*(totalGlassCost$+GlassTax$)*
    (totalEnvelopeCost$+EnvelopeTax$);
    //conversion to make decimals into .00
    double totalCost2$= totalCost$*100.00;
    double totalPaid2$= totalPaid$*100.00;
    int i=(int)totalCost2$;
    int j=(int)totalPaid2$;
    double totalCost3$=i/100.00;
    double totalPaid3$=j/100.00;
        //print out the outpu data
        System.out.println("Total Cost of Socks was $" +(totalSockCost$)+
        " with a sales tax of $" +(SockTax$)+ "."); 
        System.out.println("Total Cost of Glasses was $" +(totalGlassCost$)+ 
        " with a sales tax of $" +(GlassTax$)+ "."); 
        System.out.println("Total Cost of Envelopes was $" +(totalEnvelopeCost$)+ 
        " with a sales tax of $" +(EnvelopeTax$)+ ".");
        System.out.println("Total Cost of Item's was $" +(totalCost3$)+ ".");
        System.out.println("Total Cost of Item's + Tax was $" +(totalPaid3$)+ ".");
 } //end of main method
} // end of class