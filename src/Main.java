import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Makes the list that needs to be sortet in
        LinkedList<Integer> oldList = new LinkedList<>();
        //adds alot of values
        oldList.add(1);oldList.add(1);oldList.add(2);oldList.add(0);oldList.add(4);oldList.add(5);oldList.add(6);oldList.add(8);oldList.add(8);
        oldList.add(3);oldList.add(11);oldList.add(9);oldList.add(0);oldList.add(14);oldList.add(0);oldList.add(16);
        //calls the method with the parameters to the list and start and end values
        removeEvenInRage(oldList,5,13);
    }

    public static void removeEvenInRage(LinkedList<Integer> oldList, int start, int end) {
        //Makes a tempList of the old list in the selected index
        List<Integer> tempList = oldList.subList(start, end);
        //Sets the iterator to be the templist
        Iterator<Integer> itr = tempList.iterator();

        //runs while the list still have more elements and removeds the odd ones from the list
        //that have been placed in the tempList
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

