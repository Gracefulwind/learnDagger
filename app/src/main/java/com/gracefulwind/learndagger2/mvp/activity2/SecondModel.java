package com.gracefulwind.learndagger2.mvp.activity2;

import javax.inject.Inject;

/**
 * @ClassName: SecondModel
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 10:42
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 10:42
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class SecondModel implements SecondContract.Model {

    String from = "null";


    @Inject
    public SecondModel() {
        System.out.println("SecondModel default ");
        this.from = "default";
    }

    public SecondModel(String from) {
        System.out.println("SecondModel inject ");
        this.from = from;
    }

//-----------------------------------------------------------------------------------------------------
    @Override
    public void getData() {
        System.out.println("get data from == " + from);
    }


}
