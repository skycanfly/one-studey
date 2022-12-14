package demoneo4j2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @Author: daxian
 * @Date: 2022/12/5 10:21
 */
@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RcddUser {

    @Id
    @GeneratedValue // Id自增
    private Long id;

    /**
     * 昵称
     */
    private String nc;

    /**
     * 邮箱
     */
    private String yx;

    /**
     * 手机号
     */
    private String sjh;

    /**
     * 证件号码
     */
    private String zjhm;

}
