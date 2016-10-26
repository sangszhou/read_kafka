package play;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinszhou on 10/20/16.
 */
public class Test {

    public static int method(List<String> list) {
        System.out.println("invoke method(List<String> list)");
        return 1;
    }

    public static int method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list)");
        return 1;
    }

    public static void main(String[] args) {
        method(new ArrayList<String>());
        method(new ArrayList<Integer>());
    }

}
