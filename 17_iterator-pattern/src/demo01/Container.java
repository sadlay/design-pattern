package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:22 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public interface Container<E> {
    Iterator<E>  getIterator();
}
