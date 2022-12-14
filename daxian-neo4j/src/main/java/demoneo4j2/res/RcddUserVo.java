package demoneo4j2.res;

import com.example.demoneo4j2.bean.RcddUser;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: daxian
 * @Date: 2022/12/5 23:32
 */
@Data
public class RcddUserVo implements Serializable {
    //{
    //  "identity": 68,
    //  "labels": [
    //    "RcddUser"
    //  ],
    //  "properties": {
    //"nc": "chenxiao"
    //  }
    //}
    private Integer identity;
    private String [] labels;
    private RcddUser properties;
}
