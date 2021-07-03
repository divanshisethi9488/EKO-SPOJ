public class EOK {
	
	static int countWood(int height, int arr[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=height) {
				continue;
			}
			else {
				sum+=(arr[i]-height);
			}
		}
		return sum;
	}
	
	static void findHeight(int arr[], int wood) {
		
		int low=0, high=arr[0], res=-1;
		int n=arr.length;
		for(int i=1;i<n;i++) {
			high=Math.max(high, arr[i]);
		}
		
		while(low<=high) {
			int mid= (low+high)>>1;
			if(countWood(mid, arr, n)>=wood) {
				res=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		
		}
		System.out.print("Optimal height of sawblade should be "+res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trees[]= {4,42,40,26,46};
		int wood= 20;
		findHeight(trees, wood);
	}

}
