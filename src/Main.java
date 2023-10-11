public class Main {
    public static void main(String[] args) {
        double[] arrDouble = new double[5];
        arrDouble[0] = 1.0;
        arrDouble[1] = 3.0;
        arrDouble[2] = 5.0;
        arrDouble[3] = 7.0;
        arrDouble[4] = 9.0;

        System.out.println(arrDouble[3]);

        System.out.println("Array double (for) left->right is: ");
        for (int i=0; i < arrDouble.length; i++) {
            System.out.println(arrDouble[i]);
        }
        System.out.println("Array double (for) right->left is: ");
        for (int i = arrDouble.length-1; i >= 0; i--) {
            System.out.println(arrDouble[i]);
        }

        System.out.println("Array double (for-each) is: ");
        for (double x : arrDouble) {
            System.out.println(x);
        }
    }
}