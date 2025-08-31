import java.util.*;
class loop5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println(" enter a value");
int i=0,a;
while(true){
a=sc.nextInt();
if(a<0){
break;
}
i=i+a;
}
System.out.println("the sum is "+i);
}

}
