/**
 * Created by: Ben Jones
 * Date:26/07/2026
 * Time:09:47
 */

package main.java.July;


import java.util.*;
import java.util.List;

public class CellSignal {

    final int EXPECTED_TOWERS = 3;
    record Coordinate(int x, int y) {}

    /**
     * FreeCodeCamp Daily Challenge - 25-07-2026
     * <p>
     * Given a grid containing 3 cell tower readings, determine the location of the detected phone
     * <ul>
     *     <li>Each cell in the grid is either 0 (no tower) or a positive integer representing the distance in cells to the phone
     *     , measured in a straight line: horizontal, vertical, or diagonal.</li>
     *     <li>There is always exactly 1 solution</li>
     * </ul>
     * @param towerGrid an integer matrix representing the readings of 3 cell towers. There should be exactly 3 positive
     *                  values, representing the distance to the phone from that tower.
     * @return the [row, column] of the phone.
     */

    public int[] findPhone(int[][] towerGrid){
        // find and store value and coordinates for the tower readings (exactly 3)
        // nested for loops for row and column

        ArrayList<CellTower> towers = new ArrayList<>();

        for (int rowNum = 0; rowNum < towerGrid.length; rowNum++) {
            // For each row, find if there is a non-0 value, if so store it - this is a tower
            for (int colNum = 0; colNum < towerGrid[0].length; colNum++) {
                int value = towerGrid[rowNum][colNum]; // the found value is the distance from the tower to the phone
                if (value > 0){
                    towers.add(new CellTower(rowNum, colNum, value));
                }
            }
        }
        if (towers.size() == EXPECTED_TOWERS) {
            // Find the [row, column] that intersects the distance from each tower
            // This can be achieved by finding the intersection of coordinates the known distance from each tower.

            Set<Coordinate> set1 = new HashSet<>(towers.get(0).getPotentialLocations());
            Set<Coordinate> set2 = new HashSet<>(towers.get(1).getPotentialLocations());
            Set<Coordinate> set3 = new HashSet<>(towers.get(2).getPotentialLocations());

            Set<Coordinate> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);
            intersection.retainAll(set3);

            if (intersection.iterator().hasNext()) {
                Coordinate phoneLocation = intersection.iterator().next(); // there should be exactly one correct location
                return new int[]{phoneLocation.x(), phoneLocation.y()};
            }
        }
        return null; // Should only be reached if there are more than the expected number of towers or no solution is identified.
    }
    private static class CellTower {

        final int[] location;
        final int distanceToPhone;

        CellTower(int row, int column, int distanceToPhone){
            location = new int[] {row, column};
            this.distanceToPhone = distanceToPhone;
        }

        ArrayList<Coordinate> getPotentialLocations(){
            int x = location[0];
            int y = location[1];
            Coordinate north = new Coordinate(x, y + distanceToPhone);
            Coordinate northEast = new Coordinate(x + distanceToPhone, y + distanceToPhone);
            Coordinate east = new Coordinate(x + distanceToPhone, y);
            Coordinate southEast = new Coordinate(x + distanceToPhone, y - distanceToPhone);
            Coordinate south = new Coordinate(x, y - distanceToPhone);
            Coordinate southWest = new Coordinate(x - distanceToPhone, y - distanceToPhone);
            Coordinate west = new Coordinate(x - distanceToPhone, y);
            Coordinate northWest = new Coordinate(x - distanceToPhone, y + distanceToPhone);

            return new ArrayList<>(List.of(north, northEast, east, southEast, south, southWest, west, northWest));
        }

    }
}
