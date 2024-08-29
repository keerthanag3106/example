import java.util.*;
class frequency_array{
    public static void main(String[] a){
        int s[]={1,2,2,3,3,4,2,5,6,2};
        for(int i=0;i<s.length;i++){
            int cnt=1;
            if(s[i]==-1) continue;
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    cnt=cnt+1;
                    s[j]=-1;
                }
                // if(cnt>1){
                //     System.out.println(s[j]);
                //     break;
                // }           
            }
            System.out.println(s[i] + " occurs " + cnt + " times");     
        }


    }
}