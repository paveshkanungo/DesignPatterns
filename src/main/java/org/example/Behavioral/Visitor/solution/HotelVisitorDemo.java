package org.example.Behavioral.Visitor.solution;

import org.example.Behavioral.Visitor.solution.elements.DeluxeRoom;
import org.example.Behavioral.Visitor.solution.elements.IRoom;
import org.example.Behavioral.Visitor.solution.elements.StandardRoom;
import org.example.Behavioral.Visitor.solution.elements.SuiteRoom;
import org.example.Behavioral.Visitor.solution.visitors.HouseKeepingVisitor;
import org.example.Behavioral.Visitor.solution.visitors.IRoomVisitor;
import org.example.Behavioral.Visitor.solution.visitors.PricingVisitor;
import org.example.Behavioral.Visitor.solution.visitors.RoomServiceVisitor;

// Usage
public class HotelVisitorDemo {
    public static void main(String[] args) {
        System.out.println("\n###### Visitor Design Pattern Demo ######");

        // Create different room types(elements) - Standard, Deluxe, Suite
        IRoom[] rooms = {
                new StandardRoom("101"),
                new DeluxeRoom("201", true),
                new SuiteRoom("301", 3),
                new StandardRoom("102"),
                new DeluxeRoom("202", false)
        };

        // Calling Visitors on elements
        System.out.println("\n==> Housekeeping Service");
        IRoomVisitor housekeeping = new HouseKeepingVisitor();
        for (IRoom room : rooms) {
            room.accept(housekeeping);
        }

        System.out.println("\n==> Room Service");
        IRoomVisitor roomService = new RoomServiceVisitor("Breakfast");
        rooms[0].accept(roomService);  // Deliver to standard room
        rooms[1].accept(roomService);  // Deliver to deluxe room
        rooms[2].accept(roomService);  // Deliver to suite

        System.out.println("\n==> Revenue Calculation");
        PricingVisitor pricing = new PricingVisitor();
        for (IRoom room : rooms) {
            room.accept(pricing);
        }
        System.out.println("Total Revenue: Rs." + pricing.getTotalRevenue());
    }
}
