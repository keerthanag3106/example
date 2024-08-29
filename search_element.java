import java.util.*;
class search_element{
    public static void main(String[] args){
        int s[]={1,2,3,3,8,9,7};
        Scanner sc=new Scanner(System.in);
        int srch=sc.nextInt();
        for(int i=0;i<s.length;i++){
            if(s[i]==srch)
                System.out.print(srch+"is present and its index is"+i);
        }
    }
}