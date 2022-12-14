package demoneo4j2.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: daxian
 * @Date: 2022/12/8 00:23
 */
public class main {
    public static void main(String[] args) {
        //图谱
        List<TestDemo> list1 = new ArrayList<>();
        TestDemo t1 = new TestDemo();
        t1.setStart(1);
        t1.setEnd(2);
        t1.setInim(10);
        list1.add(t1);
        TestDemo t2 = new TestDemo();
        t2.setStart(1);
        t2.setEnd(3);
        t2.setInim(20);
        list1.add(t2);
        TestDemo t3 = new TestDemo();
        t3.setStart(2);
        t3.setEnd(3);
        t3.setInim(30);
        list1.add(t3);

        List<TestDemo> list2 = new ArrayList<>();
        TestDemo t4 = new TestDemo();
        t4.setStart(1);
        t4.setEnd(2);
        t4.setInim(10);
        list2.add(t4);
        TestDemo t5 = new TestDemo();
        t5.setStart(4);
        t5.setEnd(5);
        t5.setInim(20);
        list2.add(t5);
        TestDemo t6 = new TestDemo();
        t6.setStart(2);
        t6.setEnd(3);
        t6.setInim(30);
        list2.add(t6);


        List<TestDemo> collect = list1.stream().map(x -> {
            list2.stream().filter(y -> (
                    (x.getStart() == y.getStart()) &
                            (x.getEnd() == y.getEnd())
            )).forEach(z -> {
                x.setInim(x.getInim() + 1);
            });
            return x;
        }).collect(Collectors.toList());


        ArrayList<Object> objects = new ArrayList<>();


    }
}
