import java.util.*;
public class pickingChicks {
	
	public static void findCountOfChicks(int n, int k, int b, int time, int x[], int v[]) {
		int count=0,swaps=0,not_possible=0;
		
		for(int i=n-1;i>=0;i--) {
			int dist_req= b-x[i];
			int dist_pos= v[i]*time;
			if(dist_pos>=dist_req) {
				count++;
				if(not_possible>0)
					swaps+=not_possible;
			}
			else {
				not_possible++;
			}
			if(count>=k)
				break;
		}
		
		if(count>=k)
			System.out.print("Possible, swaps needed "+swaps);
		else
			System.out.print("Not possible");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; 		//no. of chicks
		int k=3; 		//required chicks
		int b=10; 		// location of barn
		int time=5; 	//time allowed
		
		int x[]= {0, 2, 5, 6,7}; //position of chicks 
		int v[]= {1, 1, 1, 1, 4}; //speed of chicks
		
		findCountOfChicks(n,k,b,time,x,v);
		

	}

}
