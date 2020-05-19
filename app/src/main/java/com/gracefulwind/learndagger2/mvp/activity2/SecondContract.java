package com.gracefulwind.learndagger2.mvp.activity2;

import com.gracefulwind.learndagger2.base.IModel;
import com.gracefulwind.learndagger2.base.IView;

/**
 * @ClassName: SecondContract
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 10:05
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 10:05
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class SecondContract {

    public interface View extends IView {
        void showSecond();
    }

    public interface Model extends IModel {
        void getData();
    }

}
