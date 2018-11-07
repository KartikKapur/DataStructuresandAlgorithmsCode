package Final;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Problem 4 of practice final
 * Some of these methods are just used for testing purposes
 */
public class Museum {
    public int totalRooms;
    public int totalHalls;
    public LinkedList<LinkedList<Hall>> adj;
    public Room entrance;

    public Museum(Room[] rooms) {
        this.totalRooms = rooms.length;
        this.totalHalls = 0;
        adj = new LinkedList();
        for (int room = 0; room < rooms.length; room++) {
            adj.add(room, rooms[room].adjacentHall);
        }
        entrance = rooms[0];
    }

    public void addHall(Hall h) {
        Room r1 = h.from();
        Room r2 = h.to();
        adj.get(r1.order).add(h);
        adj.get(r2.order).add(h);
        totalHalls++;
    }

    public Iterable<Hall> adj(int v) {
        return adj.get(v);
    }

    public int degree(int v) {
        return adj.get(v).size();
    }

    public void steal() {
        ArrayList<Room> visited = new ArrayList<>();
        Room r = goIn(visited);
        goOut(r, visited);
    }

    public Room goIn(ArrayList<Room> visited) {
        Room r = entrance;
        boolean stolegem = false;
        while (!stolegem) {
            visited.add(r);
            r.beenTo = true;
            if (r.hasGem) {
                stolegem = true;
                break;
            }
            Hall minHall = new Hall(new Room(0, false, 0), new Room(0, false, 0), Double.MAX_VALUE);
            for (int i = 0; i < adj.get(r.order).size(); i++) {
                Hall curr = adj.get(r.order).get(i);
                if (curr.length < minHall.length && !((curr.from().beenTo) && curr.to().beenTo)) {
                    minHall = curr;
                }
            }
            if (r.order == minHall.from().order) {
                r = minHall.to();
            } else {
                r = minHall.from();
            }
        }
        return r;
    }

    public void goOut(Room r, ArrayList<Room> visited) {
        int bound = visited.size();
        while (r != entrance) {
            Room closestroom = null;
            double dist = Double.MAX_VALUE;
            int currentlimit = bound;
            for (Hall neighborhall : adj.get(r.order)) {
                if (neighborhall.howFar() < dist) {
                    Room neighborroom;
                    if (neighborhall.to() == r) {
                        neighborroom = neighborhall.from();
                    } else {
                        neighborroom = neighborhall.to();
                    }
                    for (int index = 0; index < currentlimit; index++) {
                        if (neighborroom == visited.get(index)) {
                            bound = index;
                            closestroom = neighborroom;
                            dist = neighborhall.howFar();
                        }
                    }
                }
            }
            r = closestroom;
        }
    }

}
