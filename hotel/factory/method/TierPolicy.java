package factory.method;

import java.math.BigDecimal;
import strategy.Booking;

// ===== Product =====
interface TierPolicy {
    BigDecimal applyDiscount(BigDecimal price, Booking b);
}
