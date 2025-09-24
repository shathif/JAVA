import java.util.*;
class array1{
public static void main(String[] args){
int[] number;
number= new int[6];
Scanner sc= new Scanner(System.in);
System.out.println("enter the 5 numbers: ");

for(int i=0;i<5;i++){
number[i]=sc.nextInt();
}
System.out.println("the nubers are: ");
for(int i=0;i<5;i++){
System.out.println(number[i]);
}
}
}