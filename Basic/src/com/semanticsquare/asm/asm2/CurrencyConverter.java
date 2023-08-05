package com.semanticsquare.asm.asm2;

//package com.semanticsquare.asm;

class CurrencyConverter {

  double[] exchangeRates = new double[7];
  double rupee = exchangeRates[0] = 63.0;
  double dirham = exchangeRates[1] = 3.0; // UAE
  double real = exchangeRates[2] = 3.0;  // brazilian     
  double chilean_peso = exchangeRates[3] = 595.0;
  double mexican_peso = exchangeRates[4] = 18.0;       
  double _yen = exchangeRates[5] = 107.0;
  double $australian = exchangeRates[6] = 2.0;  // australian dollar
  // int dollar;
  // int Rupee = 63;

  void printCurrencies() {

   System.out.println("rupee: " + exchangeRates[0]);   
   System.out.println("dirham: " + exchangeRates[1]);
   System.out.println("real: " + exchangeRates[2]);
   System.out.println("chilean_peso: " + exchangeRates[3]);
   System.out.println("mexican_peso: " + exchangeRates[4]);
   System.out.println("_yen: " + exchangeRates[5]);
   System.out.println("$australian: " + exchangeRates[exchangeRates.length - 1]);
   System.out.println("# exchangeRates length: " + exchangeRates.length);
  //  System.out.println("dollar: " + dollar);
  //  System.out.println("Rupee: " + Rupee);
  }

  public static void main(String[] ars) {

    CurrencyConverter cc = new CurrencyConverter();
    cc.printCurrencies();
  }


}