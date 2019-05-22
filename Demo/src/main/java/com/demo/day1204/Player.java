package com.demo.day1204;

/**
 * @ClassName Player
 * @Auther trappedBeast
 * @Date 2018/12/6 11:43
 * @Version 1.0
 * @Description TODO
 **/
public class Player {
    private Integer id;//账户id
    private String name;//账户昵称
    private String pwd;//账户密码
    private Integer beanSum;//欢乐豆总数


    public Player(){

    }

    public Player(Integer id,String name,String pwd,Integer beanSum) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.beanSum = beanSum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getBeanSum() {
        return beanSum;
    }

    public void setBeanSum(Integer beanSum) {
        this.beanSum = beanSum;
    }


    /**
     * @Author trappedBeast
     * @Description //改变欢乐豆总数
     * @Date 2018/12/6 11:52
     * @Param [num]
     * @return java.lang.Integer
     */
    public Integer changeBeanSum(Integer num){
        this.beanSum+=num;
        return this.beanSum;
    }

}
    