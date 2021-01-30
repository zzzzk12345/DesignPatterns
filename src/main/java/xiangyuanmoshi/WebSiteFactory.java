package xiangyuanmoshi;

import java.util.HashMap;

/**
 * @author zhangkai
 * @date 30/1/21
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> flyweights = new HashMap();

    // 获得网站分类
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    // 获得网站分类总数
    public int getWebSiteCount() {
        return flyweights.size();
    }
}
