import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class QueueE {
	
	Scanner scan;
	Queue<Integer> queue;
	
	int n;
	
	void insert() {
		
		scan = new Scanner(System.in);
		queue = new LinkedList<Integer>();
		
		System.out.println("Create a Queue.");
		
		System.out.println("\nEnter the number of integers you want to add to your queue.");
		n = scan.nextInt();
		
		System.out.println("Enter the Integers you want to add to your queue.");
		
		for(int i=0; i<n; i++) {
			
			queue.add(scan.nextInt());
		}		
	}
	
	void delete() {
		
		System.out.println("\nThe Queue");
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		QueueE obj = new QueueE();
		
		obj.insert();
		obj.delete();;
	}
}