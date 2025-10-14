package factory.method;

public class DefaultTierCreator extends TierPolicyCreator {
    @Override
    protected TierPolicy createPolicy(Tier tier) {
        return switch (tier) {
            case NORMAL -> new NormalPolicy();
            case SILVER -> new SilverPolicy();
            case GOLD   -> new GoldPolicy();
        };
    }
}
