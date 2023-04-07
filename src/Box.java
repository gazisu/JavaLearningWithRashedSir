public class Box {
    public static void main(String[] args) {

        Box.rightsiderightangel(5);

    }

    public static void rightsiderightangel(int size) {
        for (int row=1; row<=size;row++){
            for(int space=row; space<size; space++){
                System.out.println(" ");
            }
            for (int star=1; star<=row; star++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    }
