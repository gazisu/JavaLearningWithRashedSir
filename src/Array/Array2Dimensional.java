package Array;

public class Array2Dimensional {
    public static void main(String[] args) {


        int s[][] = {
                {1,6,2,6},
                {3,6,2},
                {2,6,2,7,6,9},

        };

       for (int row = 0; row < s.length; row++){
           for (int col=0; col < s[row].length; col++){

               System.out.print(s[row][col]+" ");
           }
           System.out.println();
           //System.out.println(s[row][0]+","+s[row][1]+","+s[row][2]+","+s[row][3]);
          // System.out.println("\n");
           //System.out.println(s[row][0]+" "+s[row][1]+" "+s[row][2]+" "+s[row][3]);


       }
    }
}
