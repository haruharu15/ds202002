import java.util.Random;
import java.util.Scanner;
public class Main {
	static void stackqueue(int n, int que[], int stack[]) {
		int head=0;
		int tail=0;
		int top=-1;
		int count=0;
		
		
		while( head != tail ) {
			while(top==-1)
			if(que[head]>stack[top]) {
				int tmp=stack[top];		
			    que[tail] = tmp;				
			    tail = (tail+1)%(n);
				count++;
			}
		    
			}
			
			int v = que[head];				
			head = (head+1)%(n);
			System.out.println(v);
			count++;
		
		
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    Random rand = new Random();
    int[] que = new int[n];
    int[] stack=new int[n];
	
	for(int i=0;i<n;i++) {
		que[i] = rand.nextInt(10000);
		stack[i]=rand.nextInt(10000);
	}
	}

}
