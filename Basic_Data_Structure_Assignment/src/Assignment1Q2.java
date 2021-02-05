public class Assignment1Q2 extends Assignment1Q1{
    public static int[] armstrongNumbersInRange(int min, int max){
        int[] arr = new int[1000];
        int idx = 0;
        for (int i = min; i < max; i++) {
            if (ArmstrongCheck(i)){
                arr[idx] = i;
                idx += 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        int x = 0;
        for (int it: armstrongNumbersInRange(min, max)) {
            if(it != 0) {
                System.out.println(it);
            }
        }
    }
}
