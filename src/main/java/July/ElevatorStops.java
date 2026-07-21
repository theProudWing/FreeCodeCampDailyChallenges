package main.java.July;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by: Ben Jones
 * Date:19/07/2026
 * Time:12:21
 */

public class ElevatorStops {

    /**
     * FreeCodeCamp Daily Challenge - 19-07-2026
     * <p>
     * Calculates the order of floors an elevator should visit to minimise the number of floors (distance) travelled
     * <p>
     * If tied, the elevator should go up first
     * Requested floors must be visited when the elevator passes them.
     *
     *
     * @param currentFloor      the current floor of the elevator
     * @param requestedStops    the numbers of the floors to stop at
     * @return                  an int[] of the order the elevator should travel in.
     */

    public int[] minimizedRoute(int currentFloor, int[] requestedStops){
        ArrayList<Integer> higherFloors = new ArrayList<>();
        ArrayList<Integer> lowerFloors = new ArrayList<>();

        ArrayList<Integer> travelOrder = new ArrayList<>();

        for (int floor : requestedStops){
            if (floor > currentFloor){
                higherFloors.add(floor);
            } else {
                lowerFloors.add(floor);
            }
        }

        Collections.sort(higherFloors);
        lowerFloors.sort(Collections.reverseOrder());
        System.out.println("Higher: " + higherFloors);
        System.out.println("Lower: " + lowerFloors);

        if (lowerFloors.isEmpty()){
            return higherFloors.stream().mapToInt(i->i).toArray();
        } else if (higherFloors.isEmpty()) {
            return lowerFloors.stream().mapToInt(i->i).toArray();
        }
        // If greater distance to top floor, go down first
        if (Math.abs(currentFloor - Collections.max(higherFloors)) > Math.abs(currentFloor - Collections.min(lowerFloors))){
            travelOrder.addAll(lowerFloors);
            travelOrder.addAll(higherFloors);
        } else {
            // If greater or equal distance to bottom floor, go up first
            travelOrder.addAll(higherFloors);
            travelOrder.addAll(lowerFloors);
        }

        return travelOrder.stream().mapToInt(i -> i).toArray();
    }

}
