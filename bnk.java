package inhertance;

import java.util.Scanner;

class bnk {
     String name;
     int ID;
     int Phone;
     private long bankTotalFund ;
     private float bankInterest ;
     
     public bnk(long bankTotalFund, float bankInterest) {
        this.bankTotalFund = bankTotalFund;
        this.bankInterest = bankInterest;
      
    }

    float checkLoan(int amount)
     {  
        if(amount<bankTotalFund)
           {
              return bankInterest;
           }
        else
          return -1;


     }
    

}
