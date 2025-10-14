package factory;

import java.math.BigDecimal;

// ===== 사용 예시 =====
public class Demo {
    public static void main(String[] args) {
        BigDecimal base = new BigDecimal("1000");

        TierPolicyCreator normal = new NormalCreator();
        TierPolicyCreator silver = new SilverCreator();
        TierPolicyCreator gold   = new GoldCreator();

        System.out.println("Normal: " + normal.apply(base));
        System.out.println("Silver: " + silver.apply(base));
        System.out.println("Gold  : " + gold.apply(base));
    }
}
