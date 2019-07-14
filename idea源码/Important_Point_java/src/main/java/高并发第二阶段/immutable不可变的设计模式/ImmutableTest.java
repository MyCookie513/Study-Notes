package 高并发第二阶段.immutable不可变的设计模式;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableTest {
    private final int age;
    private final String name ;
    private final List<String >  list;

    public ImmutableTest(int age, String name, List<String> list) {
        this.age = age;
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    /**
     * 这里的list对象可以被一些线程拿去然后可以进行更改，
     * 如果想是不可变的  return Collections.unmodifiableList(list);
     * @return
     */
    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }

    public int getAge() {
        return age;
    }






}
