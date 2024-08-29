import java.util.*;
class secondLargest{
    public static void main(String[] args) {
        int maxi=-1000,smaxi=-2000;
        int s[]={1,2,9,7,8};
        for(int i=0;i<5;i++){
            if(s[i]>maxi){
                maxi=s[i];
            }
        }
        // System.out.printf("largest number is:%d",maxi);
        for(int i=0;i<5;i++){
            if(s[i]>smaxi && s[i]<maxi){
                smaxi=s[i];
            }
        }
        System.out.printf("Second largest number is:%d",smaxi);
    }
}