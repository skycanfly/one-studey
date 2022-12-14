package demoneo4j2.repository;


import demoneo4j2.bean.RelationUser;
import demoneo4j2.res.RelationUserVo;
import demoneo4j2.res.RelationVo;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;
import java.util.List;

/**
 * @Author: daxian
 * @Date: 2022/12/5 21:49
 */

public interface RelationUserRepository extends Neo4jRepository<RelationUser, Long> {
    @Query("MATCH (a:RcddUser)<-[la:relationUser]-(b:RcddUser) return a,la,b ")
    List<RelationUserVo> findAllLimitBy();
    @Query("MATCH (a:RcddUser)<-[la:ACTED_IN]-(b:RcddUser) return la ")
    Collection<RelationVo> findAlls();
}
