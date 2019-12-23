package com.ssm.ssmMaven.mapper;

import com.ssm.ssmMaven.bean.TestBean;
import java.util.List;

/**
 * @author shkstart
 * @date 2019/9/20 - 10:32
 */
public interface TestMapper {
    public List<TestBean> selectAllBean();
}
