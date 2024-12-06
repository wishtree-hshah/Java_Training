public class CloningExample {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int clonedArr[] = arr.clone();
        for(int i=0;i<clonedArr.length;i++){
            clonedArr[i] += i+1;
            System.out.print(clonedArr[i] + " ");
        }
        System.out.println();
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
