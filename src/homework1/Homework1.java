package homework1;


import static homework1.MiniJava.*;

public class Homework1 {
    public static void main(String[] args) {
        //TODO program the right way to have the same out put as Chan.
        int x;
        int y;
        int result;

        x = readInt("insert the first number");
        y = readInt("insert the second number");

        if (x <= 0 || y <= 0) {
            write("no result");
            return;

        } else while (x != y) {
            if (x < y) y = y - x;
            else x = x - y;
        }
        write("result: " + x);


    }
}
