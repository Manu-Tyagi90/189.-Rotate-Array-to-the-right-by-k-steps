public class Solution{
public static void rotateByK(int [] arr, int k){
int n = arr.length;
if(k>n) k%=n;
reverse(arr,0,n-1);
reverse(arr,0,k-1);
reverse(arr,k,n-1);
}
private static void reverse(int[] arr, int start, int end){
while(start<end){
arr[start] ^= arr[end];
arr[end] ^= arr[start];
arr[start] ^= arr[end];
start++;
end--;
}
}
}
