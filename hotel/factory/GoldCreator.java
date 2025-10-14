package factory;

import java.math.BigDecimal;

// ===== Concrete Creators =====

class GoldCreator extends TierPolicyCreator {
    @Override
    protected TierPolicy createPolicy() {
        return new GoldPolicy();
    }
}
