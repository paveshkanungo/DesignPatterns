package org.example.Behavioral.Visitor.solution.elements;

import org.example.Behavioral.Visitor.solution.visitors.IRoomVisitor;

// Element interface - represents rooms(elements) that can be visited
public interface IRoom {
    void accept(IRoomVisitor visitor);
}
