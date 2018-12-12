package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:59 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        nameRepository.add("Robbert");
        nameRepository.add("John");
        nameRepository.add("Julie");
        nameRepository.add("Lora");
        Iterator<String> iterator = nameRepository.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
