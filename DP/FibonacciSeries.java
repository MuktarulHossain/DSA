import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int   dp[] = new int[n+1];
         for (int i = 0; i <= dp.length; i++) {
         dp[i]=-1;
    
    }
    FibonacciSeries obj=new FibonacciSeries();
    System.out.println(obj.fibonacci(n, dp)) ;
    }
   int  fibonacci(int n, int dp[]){

    
    if( dp[0]==0 || dp[1]==1)
    return 0;

   
    if(dp[n]!=-1)
    return dp[n];

    dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
    return dp[n];


   }
    
}
