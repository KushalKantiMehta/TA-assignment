import java.util.Scanner;
public class Question2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float budget=0;
		int num=0;
		//arrays to store data
		String name[]=new String[200];
		float quantity[]=new float[200];
		float price[]=new float[200];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i>=0;i++) 
		{
			
		System.out.println("Enter your Budget :");
	    budget=sc.nextFloat();
	    
	        if (budget!=0) {
	    	   break;
	           }
	         else {
	    	System.out.println("Budget is : 0");
	          }
		}
	   for(int j=0 ; j>=0;j++) {
			
			int choice;
			System.out.println("1. Add an item.");
			System.out.println("2. Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			if(choice==1) {
				Scanner scanner =new Scanner(System.in);
				
				float tempprice;
				float tempquantity;
				System.out.println("Enter product :");
				String tempname=scanner.nextLine();
				System.out.println("Enter Quantity :");
				tempquantity=sc.nextFloat();
				System.out.println("Enter Price :");
				tempprice=sc.nextFloat();
			
				for(int k=0;k<=name.length;k++) {
					String tempname1=name[k];
					
					if (tempname.equalsIgnoreCase(tempname1)){
						float temp1=price[k];
						float temp=budget+temp1;
						if(tempprice>=temp) {
							System.out.println("Can't buy this product :"+tempname+" (Because budget left is :"+budget+")");
							System.out.println("No changes made");
						    System.out.println("Amount left : "+budget);
							
							break;
						}else {
							quantity[k]=tempquantity;
							budget=budget+temp1;
							budget=budget-tempprice;
							price[k]=tempprice;
						    System.out.println("Amount left : "+budget);
							break;
						}
							
						
					}
					else {
						if(tempprice>=budget) {
							System.out.println("Can't buy this product :"+tempname+" (Because budget left is :"+budget+")");
							break;
						}else {
							name[num]=tempname;
							quantity[num]=tempquantity;
							price[num]=tempprice;
                            num++;
                            budget=budget-tempprice;
                            System.out.println("Amount left : "+budget);
                            break;
					         }
						}
	
			}
				}
			else if (choice ==2) {
				for (int b=0;b<=name.length;b++) {
					if(name[b]==null) {
						break;
					}
					else {
						if(price[b]<=budget) {
							System.out.println("Amount left can buy "+name[b]);
						}
					}
				}
				break;
			}
			else {
				System.out.println("Invalid input, Enter again");
			}
		
	   }
	   System.out.println("GROCERY LIST is ");
	   System.out.println("Product name		Quanity		Price ");
	   for(int a=0;a<=name.length;a++){
		   if(name[a]==null) {
			   break;
		   }
		   else {
			   System.out.println(name[a]+"\t\t\t"+quantity[a]+"\t\t\t"+price[a]);
		   }
	   }
	
		
	}
	
}



