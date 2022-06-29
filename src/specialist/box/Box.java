package specialist.box;

import java.util.Comparator;

public class Box implements Comparable<Box> {
    private int a, b, c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int volue() {
        return a * b * c;
    }

    public int getA() {
        return a;
    }

    @Override
    public int compareTo(Box rValue) {
        return Integer.compare(this.volue(), rValue.volue());
    }

    //1. внутренний(inner class)
    /*public class CompareByA implements Comparator<Box> {
        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }*/
    //2. Static class
    // static class
/*
    public static class CompareByA implements Comparator<Box> {
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }
*/
    //3. local class
/*    public static Comparator<Box> compareByA() {
        class CMP implements Comparator<Box> {
            @Override
            public int compare(Box b1, Box b2) {
                return b1.a - b2.a;
            }
        }
        return new CMP();
    }*/
    // 4.анонимный
    public static Comparator<Box> compareByA() {
       return new Comparator<Box>() {
           {
               //....нициализация экземпляром
           }
           @Override
           public int compare(Box b1, Box b2) {
               return b1.a - b2.a;
           }
       };
    }
}
