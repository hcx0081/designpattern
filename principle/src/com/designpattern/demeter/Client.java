package com.designpattern.demeter;

/**
 * {@code @description:}
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人类
        Agent agent = new Agent();
        // 创建明星类
        Star star = new Star();
        star.setName("张三");
        agent.setStar(star);
        // 创建粉丝类
        Fans fans = new Fans();
        fans.setName("李四");
        agent.setFans(fans);
        // 创建公司类
        Company company = new Company();
        company.setName("腾讯");
        agent.setCompany(company);

        agent.meeting();// 明星和粉丝见面
        agent.business();// 明星和公司洽谈
    }
}