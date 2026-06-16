public class leftRotatebydopti {
    //optimal approach using reversal algorithm
    public static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--; 
        }
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int d = 3;
        //reverse first d elements
        reverse(a,0,d-1);
        //reverse remaining n-d elements
        reverse(a,d,a.length-1);
        //reverse whole array
        reverse(a,0,a.length-1);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
