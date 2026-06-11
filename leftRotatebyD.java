//left rotating array by d places
public class leftRotatebyD{
    public static void main(String[] args){
        //brute force approach
        int[] a = {1,2,3,4,5,6,7};
        int d = 3;
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = a[i];
        }

        //shifting
        for(int i = d; i<a.length;i++){
            a[i-d] = a[i];
        }

        //copying first temp at back
        for(int i=0;i<d;i++){
            a[a.length-d+i] = temp[i];
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}