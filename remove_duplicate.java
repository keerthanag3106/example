//remove duplicate
import java.util.*;
class remove_duplicate{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size");
        int n=sc.nextInt();
        int s[]=new int[n];
        System.out.print("enter array");
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        //s={2,3,4,5,7,7,5}
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length-1;j++){
                if(s[i]==s[j]){
                    s[j]=-1;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s[i]!=-1){
                cnt++;
            }
        }
        int ind=0;
        int res[]=new int[cnt];
        System.out.println("result is");
        for(int i=0;i<n;i++){
            if(s[i]!=-1){
            res[ind++]=s[i];
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.print(res[i]+" ");
        }
    }
}