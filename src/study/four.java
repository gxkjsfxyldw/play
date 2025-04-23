package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class four {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);
    }

}
