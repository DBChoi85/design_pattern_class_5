package factory;

import java.math.BigDecimal;

// ===== Concrete Creators =====

class NormalCreator extends TierPolicyCreator {
    @Override
    protected TierPolicy createPolicy() {
        return new NormalPolicy();
    }
}
