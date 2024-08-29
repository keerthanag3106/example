import java.util.*;
class Merge2ArrayAlternate{
    public static void main(String[] args) {
        int p[]={1,2,3,4,5};
        int q[]={6,7,5,8,9,4};
        int res[]=new int[p.length+q.length];
        int ind=0,i=0,j=0;
        while(i<p.length && j<q.length){
            res[ind]=p[i];
            ind++;
            i++;
            res[ind]=q[j];
            ind++;
            j++;
        }
        while(i<p.length){
            res[ind++]=p[i++];
        }
        while(j<q.length){
            res[ind++]=q[j++];
        }
        for(int num:res)
            System.out.print(num+" ");
    }
}