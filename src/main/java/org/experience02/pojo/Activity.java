package org.experience02.pojo;

import org.jetbrains.annotations.NotNull;

public class Activity implements Comparable<Activity>{
    private Integer start;
    private Integer end;

    public Activity(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

    @Override
    public int compareTo(@NotNull Activity o) {
        return end.compareTo(o.getEnd());
    }
}
