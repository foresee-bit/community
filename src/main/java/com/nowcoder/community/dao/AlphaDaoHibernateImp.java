package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author duanwu
 * @date 2021/12/23 - 12:46
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImp  implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
