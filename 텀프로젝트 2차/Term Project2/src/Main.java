import java.util.Scanner;
import java.util.Random;
public class Main {
	static long sum(int []v, int k) {
		long s = 0;
		int start=0;
		int last=0;
		for(int i=1;i<=k;i++) {
			if(v[i]>=start && v[i]<=last)
			s += i;		
		}
		return s;
	}
	static void sort(int[] v, int n, int k) {
		int start=0;
		int last=0;
		for(int i=0; i< k; i++) {
			int min=v[0];
			int max=v[0];
			
			for(int j=0; j<v.length; j++) {
	    		if(v[j]>=start && v[j]<=last) {
                    if(v[j] < v[min]) min=j;{
                    	
                    }
                    int t = v[j];
    				v[j] = v[min];
    				v[min] = t;
	    			
    				if(v[j] > v[max]) v[j]=max;{
	    				
	    			}
	    			
					v[j] = v[max];
					v[max] = t;
	    			System.out.print(v[j] + " ");
	    			}
	    		
	    		System.out.print("구간" + v[j]+ "의 최댓값은" +  max +  " 최소값은 " + min + " 합계는 "+ sum(v,k) + " ");
	    		}
	    		
	    		
	    	}

		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    System.out.println("N과 K를 입력하세요");
    int n=scanner.nextInt();
    int k=scanner.nextInt();
    int start=0;
    int last=0;
    Random rand = new Random();
    int [] v=new int[n];
    for(int i=0; i < n; i++ ) {
		v[i] =rand.nextInt(100)+1;
		}
    for(int i=0; i<k; i++) {
    	start=rand.nextInt(100)+1;
    	if(start<=last) {
    	last=rand.nextInt(100)+1;
    	}
  
    }
    long t = System.currentTimeMillis();
	sort(v, n, k);
	
	t = System.currentTimeMillis() - t;
	
	
	System.out.println("");
	System.out.println("elapsed time : "+t+"ms");
}
}