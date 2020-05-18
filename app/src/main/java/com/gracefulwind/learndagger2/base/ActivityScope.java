package com.gracefulwind.learndagger2.base;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @ClassName: ActivityScope
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 15:00
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 15:00
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {

}

