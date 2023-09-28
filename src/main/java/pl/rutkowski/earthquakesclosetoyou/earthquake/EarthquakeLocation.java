package pl.rutkowski.earthquakesclosetoyou.earthquake;


public record EarthquakeLocation(String title, int distance) implements Comparable<EarthquakeLocation> {

    @Override
    public String toString() {
        return title + " || " + distance;
    }

    @Override
    public int compareTo(EarthquakeLocation o) {
        return Integer.compare(this.distance, o.distance);
    }
}
