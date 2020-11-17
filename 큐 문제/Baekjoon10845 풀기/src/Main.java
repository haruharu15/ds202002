import java.util.Scanner;

class Queue{
	int front_Index = 0;
	int back_Index = -1;
	int[] que;
	Queue(){
		
	}
	
	Queue(int N){
		que = new int[N];
	}
	
	public void push(int x) {
		que[++back_Index] = x;
	}
	
	public int size() {
		return back_Index - front_Index + 1;
	}
	
	public boolean isEmpty() {
		if (size()==0)
			return true;
		else
			return false;
	}
	
	public int  pop() {
		if (isEmpty())
			return -1;
		else
			return que[front_Index++];
	}
	
	public int front() {
		if (isEmpty())
			return -1;
		else
			return que[front_Index];
	}
	
	public int back() {
		if (isEmpty())
			return -1;
		else
			return que[back_Index];
	}
	
}
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Queue que = new Queue(N);
		for(int i = 0; i <N; i++) {
			String command = scanner.next();
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					que.push(x);
					break;
				case "pop":
					System.out.println(que.pop());
					break;
				case "size":
					System.out.println(que.size());
					break;
				case "empty":
					if (que.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					System.out.println(que.front());
					break;
				case "back":
					System.out.println(que.back());
					break;
			
			}
		}
		scanner.close();
	}
}
