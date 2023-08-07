package ex1;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3, 5};
        int[] result = new int[a.length];
        try {
            for (int i = 0; i < a.length; i++) {
                try {
                    result[i] = a[i] / b[i];
                }catch (ArithmeticException e){
                    result[i] = 0;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            result = new int[]{0};
        }
    }
}
