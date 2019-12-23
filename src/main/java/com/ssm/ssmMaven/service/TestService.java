package com.ssm.ssmMaven.service;

import com.ssm.ssmMaven.bean.TestBean;
import com.ssm.ssmMaven.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @date 2019/9/20 - 10:12
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<TestBean> selectAll(){
       return testMapper.selectAllBean();
    }
}
