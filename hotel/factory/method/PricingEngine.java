// PricingEngine.java
package factory.method;

import java.math.BigDecimal;
import strategy.*;

public class PricingEngine {
    private PricingStrategy pricing;           // 전략(베이스 요금)
    private TierPolicyCreator tierCreator;     // 팩토리 메서드(등급 할인)

    public PricingEngine(PricingStrategy pricing, TierPolicyCreator tierCreator) {
        this.pricing = pricing;
        this.tierCreator = tierCreator;
    }
    public void setPricing(PricingStrategy p)      { this.pricing = p; }
    public void setTierCreator(TierPolicyCreator c){ this.tierCreator = c; }

    public BigDecimal quote(Booking b) {
        BigDecimal base = pricing.quote(b);                  // 1) 전략
        return tierCreator.applyDiscount(base, b);           // 2) 팩토리-생성 정책으로 할인
    }
}

