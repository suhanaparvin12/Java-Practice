import java.util.ArrayList;
import java.util.Scanner;
public class BruteForceSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,sum=0;
        String arr[] = sc.nextLine().split(" ");
        ArrayList<Integer> input = new ArrayList<Integer>();
        for(i=0;i<arr.length;i++){
            input.add(Integer.parseInt(arr[i]));
        }
        for(i=0;i<input.size()-1;i++){
            sum = 0;
            for(j=i;j<input.size();j++){
                //if(input.get(j)%2 !=0)
                sum+=input.get(j);
                System.out.print(input.get(j)+" ");
            }
            System.out.println("=> "+sum);
        }
    }
}
