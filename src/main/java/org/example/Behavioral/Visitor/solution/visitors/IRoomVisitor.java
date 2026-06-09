package org.example.Behavioral.Visitor.solution.visitors;

import org.example.Behavioral.Visitor.solution.elements.DeluxeRoom;
import org.example.Behavioral.Visitor.solution.elements.StandardRoom;
import org.example.Behavioral.Visitor.solution.elements.SuiteRoom;

public interface IRoomVisitor {
    void visitStandardRoom(StandardRoom room);
    void visitDeluxeRoom(DeluxeRoom room);
    void visitSuiteRoom(SuiteRoom room);
}
