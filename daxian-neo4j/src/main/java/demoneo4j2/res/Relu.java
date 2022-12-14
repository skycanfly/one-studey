package demoneo4j2.res;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: daxian
 * @Date: 2022/12/5 23:54
 */
@Data
public class Relu implements Serializable {

    private Long id;
    /**
     * 亲密度
     */
    private Integer intimacy;
}
