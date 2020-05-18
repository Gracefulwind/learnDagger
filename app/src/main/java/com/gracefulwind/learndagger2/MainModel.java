package com.gracefulwind.learndagger2;

import javax.inject.Inject;

/**
 * @ClassName: MainModel
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/15 17:15
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/15 17:15
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class MainModel implements MainContract.Model {

    String from = "MainModel";

    @Inject
    public MainModel() {
        System.out.println("from default inject!!");
        from = "default inject!";
    }


    public MainModel(String from) {
        this.from = from;
        System.out.println("inject!!");
    }
}
