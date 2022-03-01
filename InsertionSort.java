public class InsertionSort {
    public static void printArray(String[] arr) {
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] arr = {"Mango", "Grapes", "Plum", "Watermelon", "Apple"};
        for(int i =1; i<arr.length; i++) {
            String current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j].compareToIgnoreCase(current) > 0)  {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}