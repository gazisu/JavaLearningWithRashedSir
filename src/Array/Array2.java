package Array;
//one dimensional array
public class Array2 {
    public static void main(String[] args) {


        int s[] = {5,6,2,7,10,1,9,33};

   int sum=0;

        for(int index = 0; index < s.length; index++) {

            System.out.println(+s[index]);
            sum += s[index];
        }
        System.out.println("Total: "+sum);
    }

}
