package com.semanticsquare.asm.asm4;

public class IRUtil {

  public static int getFrequencyCount(String term, String doc) {
    term = term.toLowerCase();
    doc = doc.toLowerCase();

    int length = term.length();

    int frequencyCount = 0;
    
    int index = doc.indexOf(term);

    do  {
      frequencyCount++;
      doc = doc.substring(index + length);
      index = doc.indexOf(term);
    } while (index >= 0);

    return frequencyCount;
    
  }

  public static double termFrequency(String term, String doc) {
    int frequencyCount =  getFrequencyCount(term, doc);

    String[] sp = doc.split(" ");
    int totalTermCount = sp.length;

    return (double) frequencyCount/totalTermCount;

  }

  public static void main(String[] args) {
    String doc = "a java is javascrip jd as";
    String term = "Java";

    System.out.println(getFrequencyCount(term, doc));

    System.out.println(termFrequency(term, doc));

  }

}