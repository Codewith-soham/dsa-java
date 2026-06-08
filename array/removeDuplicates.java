import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {

        //brute approach     hashset --> no duplicate values,fast insert delete and lookup does not maintain insertion order can store null value 
        int[] a = {1,1,2,2,3,3,4,4};

        HashSet<Integer> set = new HashSet<>();
        
        for(int num: a){
            set.add(num);
        }

        int index = 0;

        for(int num: set){
            a[index++] = num;
        }

        System.out.println("Number of unique elements = " + index);

        for(int i=0; i< index; i++){
            System.out.println(a[i] + " ");
        }

        //optimal approach

        int j = 0;
        for(int k = 1; k < a.length; k++){
            if(a[k]!=a[j]){
                j++;
                a[j] = a[k];
            }
        }

        int uniqueCount = j + 1;

        System.out.println("Unique numbers " + uniqueCount);

        for(int l = 0; l < uniqueCount; l++){
            System.out.println(a[l] + " ");
        }
    }
}
