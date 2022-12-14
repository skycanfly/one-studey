package demoneo4j2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;


/**
 * @Author: daxian
 * @Date: 2022/12/5 10:28
 */
@RelationshipEntity("relationUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelationUser {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 亲密度
     */
    private Integer intimacy;

    @StartNode
    private RcddUser start;

    @EndNode
    private RcddUser end;


}
