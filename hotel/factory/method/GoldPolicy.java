package factory.method;

import java.math.BigDecimal;
import strategy.Booking;

// ===== Concrete Products =====
class GoldPolicy implements TierPolicy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price, Booking b) {
        return price.multiply(new BigDecimal("0.90")); // 10% 할인
    }
}
