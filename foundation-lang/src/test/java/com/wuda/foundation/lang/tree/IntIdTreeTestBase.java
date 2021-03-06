package com.wuda.foundation.lang.tree;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class IntIdTreeTestBase {

    int rootId = Integer.MIN_VALUE / 2;

    MyTreeNode china = new MyTreeNode(1, rootId, "中国");

    MyTreeNode hunan_province = new MyTreeNode(2, 1, "湖南省");
    MyTreeNode zhangjj = new MyTreeNode(3, 2, "张家界市");
    MyTreeNode changsha = new MyTreeNode(4, 2, "长沙市");
    MyTreeNode sangzhi = new MyTreeNode(5, 3, "桑植县");

    MyTreeNode guangdong_province = new MyTreeNode(7, 1, "广东省");
    MyTreeNode guangzhou = new MyTreeNode(8, 7, "广州市");
    MyTreeNode tianhe = new MyTreeNode(12, 8, "天河区");
    MyTreeNode dongguan = new MyTreeNode(9, 7, "东莞市");

    MyTreeNode hubei_province = new MyTreeNode(10, 1, "湖北省");
    MyTreeNode yunan_province = new MyTreeNode(11, 1, "云南省");

    public List<MyTreeNode> getNodes() {
        List<MyTreeNode> list = new ArrayList<>();
        list.add(china);
        list.add(hunan_province);
        list.add(zhangjj);
        list.add(changsha);
        list.add(sangzhi);
        list.add(guangdong_province);
        list.add(guangzhou);
        list.add(dongguan);
        list.add(hubei_province);
        list.add(yunan_province);
        return list;
    }

    @Getter
    @Setter
    static class MyTreeNode implements TreeNode<Integer> {

        String name;
        private int id;
        private int pid;

        MyTreeNode(int id, int pid, String name) {
            this.id = id;
            this.pid = pid;
            this.name = name;
        }

        @Override
        public Integer getId() {
            return id;
        }

        @Override
        public Integer getPid() {
            return pid;
        }
    }
}
