package demoneo4j2.repository;

import com.example.demoneo4j2.bean.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author: daxian
 * @Date: 2022/12/5 21:10
 */
public interface PersonRepository extends Neo4jRepository<Person, Long> {

    Person findByName(String name);

}
