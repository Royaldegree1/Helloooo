
public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a;//preincrement = first increment--> assign
		
		System.out.println(b);//11
		System.out.println(a);//10
		
		int c=10;
		int d=c++;//postincrement = first assign--> increment
		
		System.out.println("Value of d is " +d);//10
		System.out.println("Value of c is " +c);//11
		
		int q=100;
		
		int e=q--;
		
		System.out.println("Value of e is " +e);//100
		System.out.println("Value of q is " +q);//99
		
		
		
		

	}

}
