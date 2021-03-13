
public class Question1 {
	
	public static void print_triangle(int n) {
		
		//for number of spaces
		int k = n-1;
		
		// for creating rows 
		for(int i=0;i<n;i++) {
			
			//printing spaces
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			
			//printing asterisk with one space to create a triangle structure.
			for(int l=0;l<=i;l++) {
			 	System.out.print("* ");
			}
			
			k=k-1; // decrementing space after each row
			System.out.println();
		}
	}
	
	public static void print_triangle_alphabet(int n) {
		
		//for number of spaces
		int k = 2*n-2;
		// ASCII code of capital A
		int a =65;
		
		// for creating rows 
		for(int i=0;i<n;i++) {
			
			//printing spaces
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			
			//printing alphabet with one space to create a triangle structure.
			
			for(int l=0;l<=i;l++) {
				// type casting ASCII value to char alphabet
				char alphabet=(char) a;
			 	System.out.print(alphabet+" ");
			 	// changing alphabet
			 	a++;
			}
			
			k=k-2; // decrementing space after each row
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        print_triangle(n);
        
        //creating some space between two pattern
        System.out.println();
        System.out.println();
        System.out.println();
        
        print_triangle_alphabet(n);
	}

}
