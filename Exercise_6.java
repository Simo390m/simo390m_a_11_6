import java.util.*;

public class Exercise_6
{
    public void countUnique(List<Integer> list)
    {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        System.out.println(list.size());


    }

    public static void main(String[] args)
    {
        Exercise_6 exercise_6 = new Exercise_6();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(23);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(11);
        list.add(12);

        exercise_6.countUnique(list);




    }
}
