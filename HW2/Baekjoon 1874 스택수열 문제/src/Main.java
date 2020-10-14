import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   int n=scanner.nextInt();
   int [] stack= new int[n+1];
   int [] arr= new int[n+1];
   int index=1;
   ArrayList <String> arl=new ArrayList();
   int top=0;
   
   
   for(int i=1; i<=n; i++) {
	   arr[i]=scanner.nextInt();
   }
	   
      for(int i=1; i<=n; i++) {
	   stack[++top]=i;
	   arl.add("+");
	   
	   while(top!=0 && stack[top]==arr[index]) {
		   top--;
		   arl.add("-");
		   index++;
		   
	   }
	}
      if(top==0) {
    	  for(String s :arl) {
    		  System.out.println(s);
    	  }
      }else {
    	  System.out.println("NO");
      }
      scanner.close();
    }
}