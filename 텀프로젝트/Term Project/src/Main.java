import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random r = new Random();
Scanner scanner=new Scanner(System.in);
System.out.println("N�� ���� a, b�� �Է��Ͻÿ�");
int N=scanner.nextInt();
int a=scanner.nextInt();
int b=scanner.nextInt();
int [] arr=new int[N];

for(int i=0; i<N; i++) {
	arr[i]=r.nextInt(100)+1;
	System.out.print(arr[i] + " ");
}
System.out.println();

int max=arr[0];
int min=arr[0];
int sum=0;
     
    	 for(int j=a; j<b; j++) {
    	 	    if(max<arr[j]) {
 				max=arr[j];
 			}
 			if(min>arr[j]) {
 				min=arr[j];
 			}
 			 sum +=arr[j];
 			
 			}
     

System.out.println("�ִ���" +  max +  " �ּҰ��� " + min + " �հ�� "+ sum);
scanner.close();
	}

}
