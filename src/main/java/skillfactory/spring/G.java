package skillfactory.spring;

import java.util.List;
import java.util.Objects;

public class G {
    public static void main(String[] args) {
        System.out.println(contains(List.of("O", "00", "0", "OO")));
    }

    @SafeVarargs
    static <T> boolean contains(T... elements) {
        for (T t : elements) {
            if (Objects.equals(t, "O")) {
                return true;
            }
        }
        return false;
    }
}

