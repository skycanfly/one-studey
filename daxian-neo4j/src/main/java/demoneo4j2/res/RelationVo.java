package demoneo4j2.res;

import com.example.demoneo4j2.bean.RcddUser;
import lombok.Data;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.io.Serializable;

/**
 * @Author: daxian
 * @Date: 2022/12/6 00:13
 */
@QueryResult
@Data
public class RelationVo implements Serializable {


    private Long id;
    /**
     * 亲密度
     */
    private Integer intimacy;


    private RcddUser start;


    private RcddUser end;

}
