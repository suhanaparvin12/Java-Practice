import java.util.Scanner;
public class BruteForcePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();
            int end = sc.nextInt();
        int i,j,sum=0,temp;
            boolean flag = false;
            for(i=start;i<end;i++){
                if(i < 0){
                    temp=-(i);
                }
                else{
                    temp=i;
                }
                flag = true;
                if(temp<2) flag=false;
                for(j=2;j<temp;j++){ 
                  if(temp%j==0){
                    flag = false;
                    break;
                  } 
                }
                if(flag==true){
                    System.out.print(i+" ");
                    sum+=i;
                  }
            }
            System.out.println();
            System.out.println(sum);
    }
}
