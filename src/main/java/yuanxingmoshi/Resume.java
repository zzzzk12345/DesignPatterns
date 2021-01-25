package yuanxingmoshi;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author zhangkai
 * @date 25/1/21
 */
public class Resume implements Cloneable{
    private String name;

    private String sex;

    private String age;

    private WorkExperience workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String workDate, String company) {
        workExperience.setCompany(company);
        workExperience.setWorkDate(workDate);
    }

    @Override
    public String toString() {
        return "name: " + name + ", sex: " + sex + ", age:" + age
                + ", workInfo: " + workExperience.getWorkDate() + ", "
                + workExperience.getCompany();
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        // 调用私有的构造方法，克隆工作经历
        Resume resume = new Resume(this.workExperience);
        resume.setAge(age);
        resume.setSex(sex);
        resume.setName(name);
        return resume;
    }

    public static void main(String[] args) {
        Resume a = new Resume("张凯");
        a.setPersonalInfo("男", "24");
        a.setWorkExperience("2021", "AliPay");
        try {
            Resume b = a.clone();
            b.setWorkExperience("2022", "Tencent");
            Resume c = a.clone();
            c.setWorkExperience("2023", "ByteDance");

            System.out.println(a.toString());
            System.out.println(b.toString());
            System.out.println(c.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
