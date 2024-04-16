package org.experience03.tools;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

public class Max {
    public static <T extends Comparable<T>> T max(@NotNull T a ,@NotNull T b){
        if(a.compareTo(b) > 0){
            return a;
        }
        else return b;
    }
}
