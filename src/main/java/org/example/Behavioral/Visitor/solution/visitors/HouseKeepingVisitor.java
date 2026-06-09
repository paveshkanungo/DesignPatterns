package org.example.Behavioral.Visitor.solution.visitors;

import org.example.Behavioral.Visitor.solution.elements.DeluxeRoom;
import org.example.Behavioral.Visitor.solution.elements.StandardRoom;
import org.example.Behavioral.Visitor.solution.elements.SuiteRoom;

// Concrete Visitor - demonstrates adding new operations easily
public class HouseKeepingVisitor implements IRoomVisitor {
    @Override
    public void visitStandardRoom(StandardRoom room) {
        System.out.println("Housekeeping: Cleaning standard room " +
                room.getRoomNumber() + " (30 minutes)");
    }

    @Override
    public void visitDeluxeRoom(DeluxeRoom room) {
        System.out.println("Housekeeping: Cleaning deluxe room " +
                room.getRoomNumber() +
                (room.hasJacuzzi() ? " including jacuzzi" : "") +
                " (45 minutes)");
    }

    @Override
    public void visitSuiteRoom(SuiteRoom room) {
        System.out.println("Housekeeping: Cleaning suite " +
                room.getRoomNumber() + " with " +
                room.getNumberOfRooms() + " rooms (90 minutes)");
    }
}
