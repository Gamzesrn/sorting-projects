public class example3 {
    public static void main(String[]args){
        int[] array3 = {23,42,12,16,1,8,7};
        System.out.println("Sorting öncesi: ");
        printarray(array3);
        int[] sorted3 =insertionsort(array3);
        System.out.println("Sorting sonrası: ");
        printarray(sorted3);  
    }
    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
    public static int[] insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int var = array[i];
            int j = i-1;
            while(j>-1 && array[j]>var) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = var;
        }
        return array;
    }
}
