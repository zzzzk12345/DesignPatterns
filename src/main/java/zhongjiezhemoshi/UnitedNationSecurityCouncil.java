package zhongjiezhemoshi;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class UnitedNationSecurityCouncil extends UnitedNations {
    private USA usa;
    private Iraq iraq;

    public USA getUsa() {
        return usa;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public Iraq getIraq() {
        return iraq;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country colleague) {
        if (colleague == usa) {
            iraq.getMessage(message);
        } else {
            usa.getMessage(message);
        }
    }
}
