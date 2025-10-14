// TierPolicyCreator.java  (Creator — ★ 팩토리 메서드 보유)
package factory.method;

import java.math.BigDecimal;
import strategy.Booking;

public abstract class TierPolicyCreator {
    // ★ 어떤 등급에 어떤 정책 객체를 줄지 “하위 클래스”가 결정
    protected abstract TierPolicy createPolicy(Tier tier);

    public BigDecimal applyDiscount(BigDecimal base, Booking b) {
        TierPolicy policy = createPolicy(b.tier());
        return policy.applyDiscount(base, b);
    }
}
