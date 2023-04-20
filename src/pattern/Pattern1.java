package pattern;

import javax.swing.*;

public class Pattern1 {
    public static void main(String[] args) {
        //Pattern1 box = null;
        Box.createHorizontalBox ();
    }
   public static void pattern1(int size){
        for (int row=1; row<=size; row++){
            for (int space=1; space<row; space++){
                System.out.println(" x ");
            }
        }
   }
}
