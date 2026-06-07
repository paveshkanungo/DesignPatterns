package org.example.Behavioral.Mediator;

// Mediator Interface
public interface AuctionMediator {
    void registerBidder(IColleague bidder);
    void placeBid(IColleague bidder, double bidAmount);
    void closeAuction();
}
