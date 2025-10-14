package factory;

import java.math.BigDecimal;

// ===== Product =====
interface TierPolicy {
    BigDecimal applyDiscount(BigDecimal price);
}
