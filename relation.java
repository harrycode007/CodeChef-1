package Android;
import java.util.*;
 
public class relation {
   
     
    public static void main(String [] args){
    int t;//Number of test cases
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    while(t!=0){
    sc.nextLine();
    int a=sc.nextInt();
     
    int b=sc.nextInt();
     
    if(a>b){
    System.out.println(">");}
    else if(a==b){
    System.out.println("=");}
    else{
    System.out.println("<");}
    t--;
    }
    sc.close();
     
    }
    } 

