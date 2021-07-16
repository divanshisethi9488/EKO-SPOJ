
import java.util.*;
class Pair{
	int value,index;
	Pair(int v, int i){
		value=v;
		index=i;
	}
}

public class wineTrading {
	public static void findWork(int arr[]) {
		ArrayList<Pair> buy= new ArrayList<>();
		ArrayList<Pair> sell= new ArrayList<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>0)
				buy.add(new Pair(arr[i],i));
			else
				sell.add(new Pair(arr[i],i));
		}
		
		int ans=0;
		int i=0,j=0;
		while(i<buy.size() && j<sell.size()) {
			int x= Math.min(buy.get(i).value, -sell.get(j).value);
			buy.get(i).value-=x;
			sell.get(j).value+=x;
			int diff= Math.abs(buy.get(i).index-sell.get(j).index);
			ans+=(x*diff);
			if(buy.get(i).value==0)
				i++;
			if(sell.get(j).value==0)
				j++;
		}
		System.out.print("Total amount of work is "+ans);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,-4,1,-3,1};
		findWork(arr);
	}

}

