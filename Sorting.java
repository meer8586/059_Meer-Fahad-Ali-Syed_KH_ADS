import java.util.*;

public class Sorting{
	void insertionSort(int a1[], int n){
		int element = a1[n-1];
		for(int i=n-2; i>=0; i--){
			if(a1[i] > element){
				a1[i+1]= a1[i];
				display(a1);
			}
			else{
				a1[i+1] = element;
				display(a1);
				break;
			}
			if(i==0 && a1[i] > element){
				a1[i] = element;
				display(a1);
			}
		}
	}
	void display(int a1[]){
		for(int i=0; i<a1.length; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Sorting s = new Sorting();
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		System.out.println("Enter Elements");
		int a1[] = new int[n];
		for(int i=0; i<n; i++){
			a1[i] = sc.nextInt();
		}
		s.insertionSort(a1, n);
		
	}
}