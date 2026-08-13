package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i ++)
        {
            arr[i] = sc.nextInt();
        }

        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(HashMap.Entry<Integer,Integer> mapElement : map.entrySet())
        {
            int key = mapElement.getKey();
            int value = mapElement.getValue();
            System.out.println(key+" : "+value);
        }
        sc.close();

    }
}
