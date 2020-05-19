package com.gracefulwind.learndagger2.mvp.activity3;

import javax.inject.Inject;

/**
 * @ClassName: ThirdModel
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 16:46
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 16:46
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class ThirdModel implements ThirdContract.Model {

    String from = "null";


    public ThirdModel() {
        from = "ThirdModel";
    }

    @Inject
    public ThirdModel(ThirdActivity activity) {
        this.from = activity.getFrom();
    }

    public ThirdModel(String fromWhere) {
        this.from = fromWhere;
    }

    @Override
    public void getData() {

    }
}
