public class example1 {
    public static void main(String[]args){
        int[] array1 = {5,3,1,12,8,6,7};
        System.out.println("Sorting öncesi: ");
        printarray(array1);
        int[] sorted1 =selectionsort(array1);
        System.out.println("Sorting sonrası: ");
        printarray(sorted1);    
    }
    public static int[] selectionsort(int[] array)
    {        
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length; j++) {
                if(array[i]>array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j]=tmp;
                }
            }
        }
        return array;
    }
    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
}

