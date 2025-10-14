package factory;

import java.math.BigDecimal;

// ===== Concrete Products =====
class SilverPolicy implements TierPolicy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.multiply(new BigDecimal("0.95")); // 5% 할인
    }
}
