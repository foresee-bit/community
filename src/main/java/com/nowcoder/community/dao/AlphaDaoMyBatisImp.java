package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author duanwu
 * @date 2021/12/23 - 12:46
 */
@Repository
@Primary
public class AlphaDaoMyBatisImp implements AlphaDao{
    @Override
    public String select() {
        return "Mybatis";
    }
}
