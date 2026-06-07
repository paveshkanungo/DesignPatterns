package org.example.Behavioral.Mediator;

public class Definition {
    void definitionMediatorPattern(){
        /*
        *   The Mediator design pattern is a behavioral pattern that defines a mediator object that
        *   encapsulates the behavior of how a set of objects(components) interact. It promotes loose
        *   coupling by not allowing these objects from referring to each other explicitly but allows them
        *   to interact through mediator object upon respective state changes/updates.
        *
        *   Real life Examples:
        *   Online Auction System
        *   Bidder1, Bidder2, Bidder3, these interacts with Auction House, they do not interact explicitly
        *
        *   Airline Management System
        *   Plane1, Plane2, Plane3, these interacts with Air Traffic Controller, they do not interact explicitly
        *
        *   Structure of Mediator Pattern
        *   Let’s understand the Online Auction System using Online Auction System Example
        *   Mediator Interface ( AuctionMediator ): Defines the contract for communication between bidders. Methods include:
        *   registerBidder() - Add bidders to the auction
        *   placeBid() - Process bids from bidders
        *   closeAuction() - End the auction and announce winner
        *
        *   Concrete Mediator ( AuctionHouse ): Implements Mediator Interface behaviors and maintains references to all bidders.
        *   Tracks the highest bid and bidder and encapsulates the core bidding logic of interaction.
        *   Validates bids and notifies all participants upon appropriate state changes in bidders(components).
        *
        *   Colleague/Component Interface ( IColleague ): Abstract class or Interface representing the components (colleagues/bidders/auction participants)
        *   that vary independently.
        *   Holds reference to the mediator (not to other bidders).
        *   Declares contracts for performing operations (placing bids and receiving notifications).
        *
        *   Concrete Colleague/Component ( Bidder ):
        *   Defines methods for performing operations (actual bidder implementation).
        *   This class communicates only with the mediator.
        *   Receives notifications about updates/state changes.
        *
        *
        * */
    }
}
