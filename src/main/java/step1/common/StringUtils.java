package step1.common;

import java.util.List;

public class StringUtils {
    public static List<String> split(String str, String delimiter){
        return List.of(str.split(delimiter));
    }
}
