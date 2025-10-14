package factory;

import java.math.BigDecimal;

// ===== Concrete Creators =====

class SilverCreator extends TierPolicyCreator {
    @Override
    protected TierPolicy createPolicy() {
        return new SilverPolicy();
    }
}
