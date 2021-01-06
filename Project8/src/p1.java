//백준 1003
//동적 계획법
//피보나치
//뭔가 문제를 잘 못 이해하고 있는 듯..
import java.io.*;

public class p1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =  Integer.parseInt(br.readLine());
		
		int f[] = new int[1000];
		int arr[] = new int[1000];
		int arr0[] = new int[1000];
		int arr1[] = new int[1000];
		
		for(int j=0; j<t; j++) {
			int n = Integer.parseInt(br.readLine());
			arr[j]=n;
			//int zero = 0;
			//int one = 0;
				for(int i=0; i<=n; i++) {
					
					
					if(i==0)
						f[0]=0;
					else if (i==1)
						f[1]=1;
					else {
						
						f[i]=f[i-1]+f[i-2];
					}
					
					if(n==0) {
						arr0[0]=1;
						arr1[0]=0;
					}
					else if(n==1) {
						arr0[1]=0;
						arr1[1]=1;
					}
					else {
						arr0[n]=1;
						arr1[n]=n-1;
					}
					
				}
				
				//System.out.println(arr0[n]+" "+arr1[n]);
		
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(arr0[arr[i]]+" "+arr1[arr[i]]);
		}
		
		br.close();
		
	}

}
