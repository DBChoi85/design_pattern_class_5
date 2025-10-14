// com/example/hotel/strategy/Booking.java
package strategy;

import factory.method.Tier;

public final class Booking {
    private final RoomType roomType;
    private final int nights;
    private final int adults;
    private final int children;
    private final Tier tier;

    public Booking(RoomType roomType, int nights, int adults, int children, Tier tier) {
        if (nights <= 0) throw new IllegalArgumentException("nights must be > 0");
        if (adults < 0 || children < 0) throw new IllegalArgumentException("people must be >= 0");
        this.roomType = roomType;
        this.nights = nights;
        this.adults = adults;
        this.children = children;
	this.tier = tier;
    }

    public RoomType roomType() { return roomType; }
    public int nights() { return nights; }
    public int adults() { return adults; }
    public int children() { return children; }
    public Tier tier() { return tier; }
}
