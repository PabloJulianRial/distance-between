package org.example;

public class Utility {

    public static int convertLat(double lat) {
        return (int) ((lat * 111));
    }

    public static int convertLon(double lon, double lat) {
        double longDistanceFactor = Math.cos(Math.toRadians(lat));
        return (int) (lon * 111 * longDistanceFactor);
    }
}
