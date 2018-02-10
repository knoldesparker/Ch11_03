import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> oldList = new LinkedList<>();
        oldList.add(1);oldList.add(1);oldList.add(2);oldList.add(0);oldList.add(4);oldList.add(5);oldList.add(6);oldList.add(8);oldList.add(8);
        oldList.add(3);oldList.add(11);oldList.add(9);oldList.add(0);oldList.add(14);oldList.add(0);oldList.add(16);
        removeEvenInRage(oldList,5,13);


    }

    public static void removeEvenInRage(LinkedList<Integer> oldList, int start, int end) {
        int index = start;
        List<Integer> tempList = oldList.subList(start, end);
        Iterator<Integer> itr = tempList.iterator();

        while (itr.hasNext()) {
            Integer odd = itr.next();
            if (odd % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(oldList);
    }
}




/*
            for (Iterator<Integer> it = oldList.iterator(); it.hasNext(); ) {
                Integer odd = it.next();
                if (odd % 2 == 0) {
                    it.remove();
                    index++;
                }
            }
*/

