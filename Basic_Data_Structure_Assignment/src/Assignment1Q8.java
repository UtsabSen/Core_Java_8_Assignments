class BubbleSort{
    public int[] bubbleSort(int arr[]){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] >= arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}

public class Assignment1Q8 {
    public static void main(String[] args) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort ob = new BubbleSort();
        for (int it: ob.bubbleSort(arr)) {
            System.out.print(it + " ");
        }
    }
}
