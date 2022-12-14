package com.example.demoneo4j2;


import demoneo4j2.bean.RcddUser;
import demoneo4j2.bean.RelationUser;
import demoneo4j2.repository.MovieRepository;
import demoneo4j2.repository.RcddUserRepository;
import demoneo4j2.repository.RelationUserRepository;
import demoneo4j2.res.RelationUserVo;
import demoneo4j2.res.RelationVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@SpringBootTest()
public class DemoNeo4j2ApplicationTests {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private RcddUserRepository rcddUserRepository;
    @Autowired
    private RelationUserRepository relationUserRepository;

    @Test
    public void create() {
        RcddUser r1 = new RcddUser();
        r1.setNc("xianer");
        RcddUser r2 = new RcddUser();
        r2.setNc("chenxiao");
        RcddUser r3 = new RcddUser();
        r3.setNc("jingyi");
        RcddUser r4 = new RcddUser();
        r4.setNc("zige");
        RcddUser r5 = new RcddUser();
        r5.setNc("tianxia");

        RelationUser l1 = new RelationUser();
        l1.setIntimacy(10);
        l1.setStart(r1);
        l1.setEnd(r2);

        RelationUser l2 = new RelationUser();
        l2.setIntimacy(90);
        l2.setStart(r1);
        l2.setEnd(r3);

        RelationUser l3 = new RelationUser();
        l3.setIntimacy(30);
        l3.setStart(r1);
        l3.setEnd(r4);

        RelationUser l4 = new RelationUser();
        l4.setIntimacy(80);
        l4.setStart(r4);
        l4.setEnd(r5);


        RelationUser l5 = new RelationUser();
        l5.setIntimacy(100);
        l5.setStart(r2);
        l5.setEnd(r4);
//        relationUserRepository.save(l1);
//        relationUserRepository.save(l2);
//        relationUserRepository.save(l3);
//        relationUserRepository.save(l4);
//        relationUserRepository.save(l5);
        List<RelationUser> relationUsers = new ArrayList<>();
        relationUsers.add(l1);
        relationUsers.add(l2);
        relationUsers.add(l3);
        relationUsers.add(l4);
        relationUsers.add(l5);
        relationUserRepository.saveAll(relationUsers);

    }

    @Test
    public void delete() {
        rcddUserRepository.deleteAll();
        relationUserRepository.deleteAll();
    }
    @Test
    public void select() {
       // Iterable<RelationUser> all = relationUserRepository.findAll();

        Collection<RelationUserVo> alls1 = relationUserRepository.findAllLimitBy();
        System.out.println(alls1);
        Collection<RcddUser> alls = rcddUserRepository.findAllLimitBy(100);
       // System.out.println(alls);
        Collection<RelationVo> alls2 = relationUserRepository.findAlls();

        System.out.println(alls2);

    }

    @Test
    public void save() {

    }


}