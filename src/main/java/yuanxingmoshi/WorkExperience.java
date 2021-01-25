package yuanxingmoshi;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    // 注意这里要重写，将clone()的protected改为public
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
