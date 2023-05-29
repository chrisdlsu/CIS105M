import java.util.Scanner;  // Import the Scanner class

public class Exercise01 {
    public static void main(String[] args) {
        //VARIABLES
        Scanner scAskDate = new Scanner(System.in); // scanner to ask the user
        String sDateResponse = "no response yet"; // variable to place user response in

        //asking input
        System.out.print("Give me a Date in the format of mm-dd-yy or mm-dd-yyyy ");
        sDateResponse = scAskDate.next();
        
        //TESTS
        // String testDate = "03-25-2023";
        // String length tester
        /* System.out.println(sDateResponse.length()); */

        String substrMM = sDateResponse.substring(0, 2);
        String substrDD = sDateResponse.substring(3, 5);
        String substrYY;

        // Determines with the right substring indices depending on the user's year input format
        if (sDateResponse.length() < 10) {
            substrYY = sDateResponse.substring(6, 8);
        } else {
            substrYY = sDateResponse.substring(6, 10);
        }
/* 
        String substrMM = testDate.substring(0, 2);
        String substrDD = testDate.substring(3, 5);
        String substrYY = testDate.substring(8, 10); */



        //Test substrings
/*      System.out.println(substrMM);
        System.out.println(substrDD);
        System.out.println(substrYY); */

        String MMconvert = "default";

        switch(substrMM) {
            case "01":
              MMconvert = "Jan";
              break;
            case "02":
              MMconvert = "Feb";
              break;
            case "03":
              MMconvert = "Mar";
              break;
            case "04":
              MMconvert = "Apr";
              break;
            case "05":
              MMconvert = "May";
              break;
            case "06":
              MMconvert = "Jun";
              break;
            case "07":
              MMconvert = "Jul";
              break;
            case "08":
              MMconvert = "Aug";
              break;
            case "09":
              MMconvert = "Sep";
              break;
            case "10":
              MMconvert = "Oct";
              break;
            case "11":
              MMconvert = "Nov";
              break;
            case "12":
              MMconvert = "Dec";
              break;
            default:
              // code block
              MMconvert = "Switch default";
          }



        //print the date in Mmm d, yyyy format
        //System.out.println(sMonth + " " + nDay + ", " + nYear);
        //System.out.println(MMconvert + " " + substrDD + ", 20" + substrYY);

        if (sDateResponse.length() < 10) {
          //substrYY = sDateResponse.substring(6, 8);
          System.out.println(MMconvert + " " + substrDD + ", 20" + substrYY);
        } else {
          //substrYY = sDateResponse.substring(8, 10);
          System.out.println(MMconvert + " " + substrDD + ", " + substrYY);

        }
        
        //close scanner
        scAskDate.close();
    }
}