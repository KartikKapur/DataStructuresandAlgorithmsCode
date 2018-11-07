package Final;

import java.util.LinkedList;
import java.util.Stack;
/**
 *Problem 6 on practice final
 */
public class TeleportMuseum {
    public int totalRooms;
    public int totalHalls;
    public LinkedList<LinkedList<Hall>> adj;
    public Room entrance;

    public TeleportMuseum(Room[] rooms) {
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
        adj.get(r1.order).add(r2.order, h);
        adj.get(r2.order).add(r1.order, h);
        totalHalls++;
    }


    public void teleportInNOut() {
        Stack<Room> s = new Stack<>();
        teleportSteal(s);
        teleportLeave(s);
    }

    public void teleportSteal(Stack s) {
        Hall[] edgeTo = new Hall[totalRooms];
        double[] distTo = new double[totalRooms];
        PQ pq = new PQ();
        for (int v = 0; v < totalRooms; v++) {
            distTo[v] = Double.MAX_VALUE;
        }
        distTo[entrance.order] = 0.0;
        pq.insert(entrance, distTo[entrance.order]);
        while (pq.size() != 0) {
            Room temp = pq.removeMin();
            temp.beenTo = true;
            s.push(temp);
            System.out.println(temp.order);
            if (temp.hasGem) {
                break;
            }
            for (Hall h : temp.adjacentHall) {
                if (h != null && !(h.from().beenTo && h.to().beenTo)){
                    relax(h, temp, distTo, edgeTo, pq);
                }
            }
        }
    }

    public void teleportLeave(Stack<Room> s) {
        while (!s.isEmpty()) {
            Room r = s.pop();
            System.out.println(r.order);
        }
        System.out.println("Out again");
    }

    public void relax(Hall h, Room temp, double[] distTo, Hall[] edgeTo, PQ pq) {
        Room r;
        if (h.from().equals(temp)) {
            r = h.to();
        } else {
            r = h.from();
        }
        if (distTo[r.order] > distTo[temp.order] + h.length) {
            distTo[r.order] = distTo[temp.order] + h.length;
            edgeTo[r.order] = h;
            if (pq.contains(r)) {
                pq.changePriority(r, distTo[r.order]);
            } else {
                pq.insert(r, distTo[r.order]);
            }

        }
    }

}
