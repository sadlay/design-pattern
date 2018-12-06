package demo01.fiterinterface;

import demo01.pojo.Person;

import java.util.List;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:16 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
