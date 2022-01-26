import java.util.*;

public class leetcodesample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
    }

    // public int maximumWealth(int[][] accounts) { //Richest customer wealth-easy
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < accounts.length; i++) {
    // int sum = 0;
    // for (int j = 0; j < accounts[i].length; j++)
    // sum += accounts[i][j];
    // if(sum>max) max = sum;
    // }
    // return max;

    // }
    // public int[] concat(int[] nums){//Concatenation of Array- easy
    // int n=nums.length;
    // int[] ans=new int[n];
    // int sum=0;
    // for(int i=0; i<n; i++){
    // sum+=nums[i];
    // ans[i]=sum;
    // }
    // return ans;
    // }

    // public int[] shuffle(int[]nums,int n){ //Shuffle the array -easy
    // int []arr=new int[2*n];
    // for(int i=0,j=0; i<2*n;i+=2,j++){
    // arr[i]=nums[j];
    // arr[i+1]=nums[j+n];
    // }
    // return arr;
    // }
    // public void setzeroes(int[][] matrix){ //Set Matrix zeroes-medium
    // int m=matrix.length;
    // int[][] arr=new int[m][];
    // arr=matrix;
    // for(int i=0;i<m;i++){
    // for(int j=0;j<matrix[i].length;j++){
    // if(matrix[i][j]==0)

    // }
    // }
    // }
    // public int subtractProductAndSum(int n) {// difference in product and sum
    // int dif,sum=0,pro=1;
    // int n1=n;
    // while(n1>0){
    // int d=n1%10;
    // pro*=d;
    // sum+=d;
    // n1=n1/10;
    // }
    // dif=pro-sum;

    // return dif;
    // }
    // public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    // ArrayList<Boolean> kids = new ArrayList<Boolean>(candies.length);
    // int max = candies[0];
    // for (int i = 1; i < candies.length; i++)
    // if (candies[i] >= max)
    // max = candies[i];
    // for (int i = 0; i < candies.length; i++) {
    // if (candies[i] + extraCandies >= max)
    // kids.add(true);
    // else
    // kids.add(false);
    // }

    // return kids;
    // }
    // public int numIdenticalPairs(int[] nums) {//number of good pairs
    // int gdpairs=0;
    // for(int i=0;i<nums.length;i++) {
    // for(int j=i+1;j<nums.length;j++) {
    // if(nums[i]==nums[j])gdpairs++;
    // }
    // }
    // return gdpairs;
    // }
    // public int[] smallerNumbersThanCurrent(int[] nums) {

    // int a[] = new int[nums.length];
    // a = nums;
    // Arrays.sort(nums);
    // HashSet<Integer> h = new HashSet<Integer>();
    // for (int i = 0; i < nums.length; i++) {
    // h.add(nums[i]);
    // }
    // int c = 0;

    // }
    // public boolean isValid(String s) {
    // Stack <Character> st=new Stack<Character>();
    // for(int i=0;i<s.length();i++){
    // if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
    // st.push(s.charAt(i));
    // else
    // {
    // if(st.size()==0)
    // return false;
    // else
    // { char c=st.pop();
    // if(c=='('&&s.charAt(i)==')'||c=='{'&&s.charAt(i)=='}'||c=='['&&s.charAt(i)==']')
    // continue;
    // else return false;
    // }
    // }

    // }
    // if(st.size()!=0)
    // return false;
    // else return true;
    // }
    // public int minimumDifference(int[] nums, int k) {
    // int min = Integer.MAX_VALUE;
    // if (k == 1) {
    // return 0;
    // } else {
    // Arrays.sort(nums);
    // for (int i = 0; i < nums.length - k; i++) {

    // int diff = nums[i + k-1] - nums[i];
    // if (min > diff) {
    // min = diff;
    // }

    // }
    // return min;
    // }

    // }
    // public String kthLargestNumber(String[] nums, int k) {
    // long ar[] = new long[nums.length];
    // BigInteger min = new BigInteger(ar);
    // for (int i = 0; i < ar.length; i++) {
    // ar[i] = Long.parseLong(nums[i]);
    // }
    // Arrays.sort(ar);
    // long x = ar[ar.length - k];
    // String s = "" + x;
    // return s;
    // }
    // public int[] asteroidCollision(int[] asteroids) {
    //     Stack<Integer> st = new Stack<Integer>();
    //     int n = asteroids.length;
    //     for (int i = 0; i < n; i++) {
    //         int ast = asteroids[i];
    //         if (i == 0)
    //             st.push(ast);
    //             else{
    //         if (ast > 0) {
    //             st.push(ast);
    //         } else {
    //             int lastast = st.peek();
    //             if (lastast < 0)
    //                 st.push(ast);
    //             else {
    //                 if (lastast + ast == 0)
    //                     st.pop();
    //                 else if ((lastast + ast) > 0)
    //                     continue;
    //                 else {
    //                     while(st.peek()+ast<0){
    //                     st.pop();}
    //                     st.push(ast);
    //                 }
    //             }
    //         }
    //     }
    //     }
        
    //    int size=st.size();
    //    int[] ar=new int[size]; 
    //    for(int i = 0; i < size; i++) {
    //        ar[size-1-i]=st.pop();
    //    }
    //    return ar;

    // }
//     public static int doUnion(int a[], int n, int b[], int m) 
//     {
//         HashSet<Integer> hs = new HashSet<>();
//    for(int i = 0; i < n; i++){
//        hs.add(a[i]);

//    } for(int i = 0; i < m; i++){
//     hs.add(b[i]);

// }

// return hs.size();

//     }

}
