import java.util.*;
class opriv{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the product name: ");
String Prod_name=sc.nextLine();
System.out.println("Enter the price: ");
double price=sc.nextInt();
System.out.println("Enter the quantity: ");
int quantity=sc.nextInt();
System.out.println("Enter the discount %: ");
int discount=sc.nextInt();
double a=price*quantity;
double b=(a*discount)/100.0;
double total=a-b;
System.out.println(" your discount is: "+b);
System.out.println("your final bill amount is:"+total);

}
}