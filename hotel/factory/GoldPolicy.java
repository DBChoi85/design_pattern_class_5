package factory;

import java.math.BigDecimal;

// ===== Concrete Products =====
class GoldPolicy implements TierPolicy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.multiply(new BigDecimal("0.90")); // 10% 할인
    }
}
