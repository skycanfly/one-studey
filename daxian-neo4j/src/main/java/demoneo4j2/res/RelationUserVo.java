package demoneo4j2.res;


import demoneo4j2.bean.RcddUser;
import demoneo4j2.bean.RelationUser;
import lombok.Data;
import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * @Author: daxian
 * @Date: 2022/12/5 23:32
 */
@Data
@QueryResult
public class RelationUserVo {
    private RcddUser a;
    private RelationUser la;
    private RcddUser b;
}
