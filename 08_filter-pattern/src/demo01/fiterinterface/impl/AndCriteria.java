package demo01.fiterinterface.impl;

import demo01.fiterinterface.Criteria;
import demo01.pojo.Person;

import java.util.List;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:43 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons=criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
