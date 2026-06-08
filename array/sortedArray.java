public class sortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;

        for(int i =1 ; i< n; i++){
            if(a[i] > a[i-1]){
                
            }else{
                System.out.println("Array is not sorted");
            }
        }
        System.out.println("Array is sorted");
    }
}
