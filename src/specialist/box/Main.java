package specialist.box;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = {
                new Box(10, 1, 1),
                new Box(1, 10, 10),
                new Box(2, 2, 2)
        };

        Arrays.sort(boxes);

        for (Box box : boxes) {
            System.out.println(box);
        }
        //1. inner class
/*
        Box.CompareByA cmp = new Box(0,0,0).new CompareByA();
        Arrays.sort(boxes,cmp);
*/
        //2. static class
/*
        System.out.println("static");
        Arrays.sort(boxes, new Box.CompareByA());
*/

//3,4. local class
//        Arrays.sort(boxes, Box.compareByA());

        //5 Анонимный ккласс
/*         Arrays.sort(boxes, new Comparator<Box>() {
             @Override
             public int compare(Box b1, Box b2) {
                 return b1.getA() - b2.getA();
             }
         });*/

        //6 лямбда выражения
         Arrays.sort(boxes, (Box b1, Box b2) -> b1.getA() - b2.getA());

        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}
