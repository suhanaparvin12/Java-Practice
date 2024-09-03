import java.util.*;
public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        for(i=0;i<arr.length;i++){
            list.add(Integer.parseInt(arr[i]));
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        //first
        for(i=0;i<list.size();i++){
            if(list.get(i)>max1){
                max1 = list.get(i);
            }
        }
        //second
        for(i=0;i<list.size();i++){
            if(list.get(i)>max2 && list.get(i)!=max1){
                max2 = list.get(i);
            }
        }
        //third
        for(i=0;i<list.size();i++){
            if(list.get(i)>max3 && (list.get(i)!=max1 && list.get(i)!=max2)){
                max3 = list.get(i);
            }
        }
        System.out.println(max1 + " " + max2 + " " + max3);
    }
}
