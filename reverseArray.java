import java.util.*;
class reverseArray{
    public static void main(String[] args) {
        int s[]={1,2,3,4,5};
        int size=s.length;
        int n[]=new int[size];
        for(int i=5-1,j=0;i>=0;i--,j++){
            n[j]=s[i];
        }
        for(int i=0;i<s.length;i++){
            System.out.print(n[i]);
        }
    }
}