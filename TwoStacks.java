class TwoStacks{
	 int[] arr;
	 int size;
	 int top1, top2;
	
	TwoStacks(int size){
		this.size = size;
		arr = new int[size];
		top1 = size/2 +1;
		top2 = size/2;
	}
	
	void push1(int val){
		if(top1 > 0){
			top1--;
		arr[top1] = val;
		}
		else{
			
			return;
		}
	}
	
	 void push2(int val){
		if(top2 < size-1){
			top2++;
			arr[top2] = val;
		}
		else{
			return;
		}
	}
	
	 int pop1(){
		if(top1 <= size/2){
			int val = arr[top1];
			top1++;
			return val;
		}
		else{
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	
	 int pop2(){
		if(top2 >= size/2+1){
			int val = arr[top2];
			top2--;
			return val;
		}
		else{
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 1;
	}
	
	
	public static void main(String [] args){
		TwoStacks ts = new TwoStacks(5);
		ts.push1(5);
		ts.push2(10);
		
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		ts.push2(40);
		
		System.out.println("Popped element from stack1 is "+ts.pop1());
		
		System.out.println("Popped element form stack2 is "+ts.pop2());
	}
}