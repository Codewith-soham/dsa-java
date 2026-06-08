class secondLargest {
    public static void main(String[] args) {
        //better approach
        
        int[] arr = {3, 5, 7, 2, 8};
        int n = arr.length;

        int largest = arr[0];
        int slargest = -1;

        for(int i = 0; i< n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);

        for(int j = 0; j<n ; j++){
            if(arr[j] > slargest && arr[j]!= largest){
                slargest = arr[j];
            }
        }

        System.out.println(slargest);

        //optimal approach
        int[] arr2 = {1 , 2, 4, 7, 7, 5};

        int n1 = arr2.length;

        int llargest = arr2[0];
        int sslargest = -1; //take INT_MIN if negative numbers in array

        for(int i = 0 ; i < n1 ; i++){
            if(arr2[i] > llargest ){
                sslargest = llargest;
                llargest = arr2[i];
            }
            else if(arr2[i] < llargest && arr2[i] > sslargest){
                sslargest = arr2[i];
            }
        }

        System.out.println(llargest);
        System.out.println(sslargest);
    }
}
