package com.zc.dao;

import com.zc.tool.JdbcTool;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName BaseDao
 * @Auther trappedBeast
 * @Date 2019/4/28 10:31
 * @Version 1.0
 * @Description TODO
 **/
@Slf4j
public abstract class BaseDao<T> {
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private JdbcTool jdbcTool=null;
    /**
     * @Author trappedBeast
     * @Date 2019/4/28 9:58
     * @Description //数据库更新
     */
    public int executeUpdate(String sql, T[] ts){
        jdbcTool=JdbcTool.getSingleJdbcTool();
        conn=jdbcTool.getConnection();
        int flag=-1;
        try {
            ps=conn.prepareStatement(sql);
            setParameter(ps,ts);
            flag=ps.executeUpdate();
            return flag;
        } catch (SQLException e) {
            log.error("数据库操作出现异常",e);
        }finally {
            jdbcTool.disConnection(rs,ps,conn);
        }
        return flag;
    }

    /**
     * @Author trappedBeast
     * @Date 2019/4/28 10:12
     * @Description //TODO
     */

    public List<T> executeQuery(String sql, T[] ts){
        jdbcTool=JdbcTool.getSingleJdbcTool();
        conn=jdbcTool.getConnection();
        try {
            ps=conn.prepareStatement(sql);
            setParameter(ps,ts);
            rs=ps.executeQuery();
            return rsToList(rs);
        } catch (SQLException e) {
            log.error("数据库查询出现异常",e);
        }finally {
            jdbcTool.disConnection(rs,ps,conn);
        }
        return null;
    }

    public abstract List<T> rsToList(ResultSet rs)throws SQLException;

    /**
     * @Author trappedBeast
     * @Date 2019/4/28 10:00
     * @Description //设置参数
     */

    private void setParameter(PreparedStatement ps, T[] ts){
        if(null!=ts){
            for (int i = 0;i<ts.length;i++)
            {
                try {
                    ps.setObject(i+1,ts[i]);
                } catch (SQLException e) {
                    log.error("参数插入出现异常",e);
                }
            }
        }
    }




}
    