//find the missing number in an integer array,this prg finds the missing number in an array cotaining numbers from 1 to n.
//1 2 3 5 6
import java.util.*;
class missing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n-1];
        int sum=0,orgsum=0;
        int k;
        for(int i=0;i<n-1;i++){
            s[i]=sc.nextInt();
        }
        for(int i=0;i<s.length;i++){
            sum=sum+s[i];
        }
        for(int i=1;i<n+1;i++){
            orgsum=orgsum+i;
        }
        if(sum!=orgsum){
            k=orgsum-sum;
            System.out.printf("The misisng number is:"+k);
        }

    }
}
//remove duplicate element from an array//
//to merge 2 integer arrays by altering their elements
//count the frequency of elements in an integer array//
//search for an element in array
//reverse an array
//2nd largest element in an integer array