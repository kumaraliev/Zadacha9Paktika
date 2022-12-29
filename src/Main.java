public class Main {
    public static void main(String[] args) {


        int[] array = new int[100];

        for (int i = 10; i < array.length; i+=10) {
                 array[i]=i;

            if (array[i] % 3 == 0) {
                array[i] = 333333;

            }
            array[array.length / 2] = -1;
            System.out.println(array[i] + ",");
        }
    }
}