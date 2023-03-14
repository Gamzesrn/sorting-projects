public class example2 {
    public static void main(String []args){
    int[] array2 = {15,3,1,12,5,8,7};
        System.out.println("Sorting öncesi: ");
        printarray(array2);
        int[] sorted2 =bubblesort(array2);
        System.out.println("Sorting sonrası: ");
        printarray(sorted2);
    }
    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
    public static int[] bubblesort(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j+1]<array[j]) {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j]=tmp;
                }
            }
        }
        return array;
    }
}
