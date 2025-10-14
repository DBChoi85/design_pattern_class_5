package factory;

import java.math.BigDecimal;

// ===== Creator (Abstract) =====
abstract class TierPolicyCreator {
    // ★ 팩토리 메서드
    protected abstract TierPolicy createPolicy();

    public BigDecimal apply(BigDecimal basePrice) {
        TierPolicy policy = createPolicy(); // 어떤 정책을 쓸지는 서브클래스가 결정
        return policy.applyDiscount(basePrice);
    }
}
