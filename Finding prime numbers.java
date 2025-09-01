import java.util.*;
class loop8{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n;
int c=0;
System.out.println("Enter the number: ");
n=sc.nextInt();
if(n<2){
System.out.println("this is not A prime");
}
for(int i=2;i<n;i++){
if(n%i==0){
c++;
}
}
if(c<2){
System.out.println("this is prime");
}
else{
System.out.println("this is not A prime");
}
}
}