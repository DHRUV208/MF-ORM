import java.util.ArrayList;
import java.util.List;

public class practice {
public static int recur(int n)
{
    if(n<=10)
    {return n*2;}
    else
        return recur(recur(n/3));
}
public static boolean recurMethod(String str)
{
    if(str.length()<=1)
    {
        return true;
    }
    else if(str.substring(0,1).compareTo(str.substring(1,2))>0)
    {
        return recurMethod(str.substring(1));
    }
    else {
        return false;
    }
}
public static int mystery(int[] nums, int v, int numVals)
{
    int k =0;
    if(v== nums[numVals-1])
    {
        k=1;
    }
    if(numVals==1)
        return k;
    else
    {
        return k+ mystery(nums,v,numVals-1);
    }
}
public static ArrayList<Integer> match (ArrayList<Integer> numList,int key)
{
    ArrayList<Integer> returnList = new ArrayList<Integer>();
    int i =0;
    while(i<numList.size())
    {
        int num = numList.get(i);
        if(num%key==0)
        {
            numList.remove(i);
            returnList.add(num);
        }
        i++;
    }
    return returnList;
}
public static void main(String[] args)
{
    System.out.println(recur(27));
    System.out.println(recurMethod("edcba"));

    List<String> students = new ArrayList<String>();
    students.add("Alex");
    students.add("Bob");
    students.add("Carl");
    for (int i = 0; i <students.size(); i++) {
        System.out.print(students.set(i,"Alex")+" ");
    }
    System.out.println();
    for (String str:students
         ) {
        System.out.print(str+" ");
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(2);
    list.add(10);
    list.add(20);
    list.add(16);
    System.out.println(match(list,5));
}

}
