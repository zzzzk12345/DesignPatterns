package zhongjiezhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
