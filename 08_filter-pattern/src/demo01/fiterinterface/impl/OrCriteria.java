package demo01.fiterinterface.impl;

import demo01.fiterinterface.Criteria;
import demo01.pojo.Person;

import java.util.List;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 10:54 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems=criteria.meetCriteria(persons);
        List<Person> oherCriteriaItems=otherCriteria.meetCriteria(persons);
        for (Person person : oherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
