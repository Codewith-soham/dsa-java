class LargestArray{

    public static void main(String[] args){
        int arr1[] = {2,3,5,1,4,6};
        int n = arr1.length;
        int largest = arr1[0];
        for(int i=1 ; i< n ; i++){
            if(arr1[i] > largest){
                largest = arr1[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    
    }
}

//time complexity: O(n) where n is the number of elements in the array
//space complexity: O(1) as we are using only a constant amount of space

