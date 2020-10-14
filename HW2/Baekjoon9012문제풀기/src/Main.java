import java.util.Scanner;
public class Main {
	public static boolean isValid (String ps) {
		char [] stack= new char[50];
		int top=-1;
		
		for(int i=0;i<ps.length();i++) {
			char ch = ps.charAt(i);
			
			if(ch == '(' ) {
				
				stack[++top] = ch;
			}
			else if(ch == ')') {
				
				if(top == -1 || stack[top] != '(') return false;
					
				top--;
			}
		}
		return top==-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   int n = scanner.nextInt();
	
	for(int i = 1; i <= n; i++) {
	
		String ps = scanner.next();
		
		if(isValid(ps)) System.out.println("YES");
		else System.out.println("NO");
	}
	scanner.close();	
	}

}
