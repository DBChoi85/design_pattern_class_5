package factory.method;

import java.math.BigDecimal;
import strategy.Booking;

// ===== Concrete Products =====
class NormalPolicy implements TierPolicy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price, Booking b) {
        return price; // 할인 없음
    }
}
