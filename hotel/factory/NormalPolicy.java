package factory;

import java.math.BigDecimal;

// ===== Concrete Products =====
class NormalPolicy implements TierPolicy {
    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price; // 할인 없음
    }
}
