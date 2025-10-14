// Demo.java
package factory.method;

import java.math.BigDecimal;
import strategy.*;

public class Demo {
    public static void main(String[] args) {
        Booking deluxe3N_gold = new Booking(RoomType.DELUXE, 3, 1, 1, Tier.GOLD); 

        PricingEngine engine = new PricingEngine(
                new PeakSeasonStrategy(new BigDecimal(1.35)),     
                new DefaultTierCreator()
        );

        BigDecimal total = engine.quote(deluxe3N_gold);   
        System.out.println("TOTAL = " + total);           
    }
}
