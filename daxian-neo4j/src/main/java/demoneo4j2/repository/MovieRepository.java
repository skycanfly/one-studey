package demoneo4j2.repository;

import com.example.demoneo4j2.bean.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * @Author: daxian
 * @Date: 2022/12/5 21:10
 */
@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    Movie findByTitle(@Param("title") String title);

    Collection<Movie> findByTitleLike(@Param("title") String title);

    @Query("MATCH (m:Movie)<-[r:ACTED_IN]-(a:Person) RETURN m,r,a LIMIT $limit")
    Collection<Movie> findAllLimitBy(@Param("limit") int limit);
}