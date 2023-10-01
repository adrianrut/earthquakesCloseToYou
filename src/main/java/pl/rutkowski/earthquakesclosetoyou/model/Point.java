package pl.rutkowski.earthquakesclosetoyou.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Point implements Comparable<Point> {
    private double lat;
    private double lon;
    private String title;
    private double distanceBetween;

    public int compareTo(Point o) {
        return Double.compare(this.distanceBetween, o.distanceBetween);
    }

}
