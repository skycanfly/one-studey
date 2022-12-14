package demoneo4j2.repository;


import demoneo4j2.bean.RcddUser;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @Author: daxian
 * @Date: 2022/12/5 21:50
 */
@Repository
public interface RcddUserRepository extends Neo4jRepository<RcddUser, Long> {

    //   @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT $limit")
    //    Collection<Movie> findAllLimitBy(@Param("limit") int limit);
    @Query("MATCH (a:RcddUser)<-[r:ACTED_IN]-(b:RcddUser) return a,b LIMIT $limit")
    Collection<RcddUser>  findAllLimitBy(@Param("limit") int limit);
}
