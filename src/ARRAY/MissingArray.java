package ARRAY;

public class MissingArray {
    static int missingNumber(int arr[]){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int number=arr[arr.length-1];
        int numberSum=(number*(number+1))/2;
        int missingNumber=numberSum-sum;
       return missingNumber;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(missingNumber(arr));
    }
}
