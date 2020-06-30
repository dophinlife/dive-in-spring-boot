package com.imooc.diveinspringboot.service;

/**
 * 计算类
 *
 * @author guangp
 * @since 2020/6/30
 */
public interface CalculateService {
    /**
     * 从多个证书 sum 求和
     *
     * @param values 多个整数
     * @return 和
     */
    int sum(int... values);
}
