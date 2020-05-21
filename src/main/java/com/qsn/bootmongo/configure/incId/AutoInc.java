package com.qsn.bootmongo.configure.incId;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解（用于标识需要自增的Field）
 *
 * <p>
 * 使用该注解时应注意， Id值不能是包装类， 否则转换类型上会出现错误
 * <p/>
 *
 * @author qiusn
 * @date 2020-05-21
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInc{
}