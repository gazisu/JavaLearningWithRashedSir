import MathUtils.MathUtils;
public class Assignment {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        int sum = mathUtils.add( 34, 65);
        System.out.println("Math Result:"+sum);

        int substruction = (int) mathUtils.sub( 76, 23);
        System.out.println("Math Result:"+substruction);

        double multiplication = mathUtils.mult(34.5, 1.4);
        System.out.println("Math Result:"+multiplication);

        int Divided = (int) mathUtils.Div(89,23);
        System.out.println("Math Result:"+Divided);

    }

}
