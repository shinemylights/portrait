package com.lxy.portrait;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lxy
 * @date 2024/4/18 23:01
 */
// Example ClusteringResult class (you can adapt this to your actual data structure)
public class ClusteringResult {
    private BigDecimal low;
    private BigDecimal mid;
    private BigDecimal high;

    ClusteringResult(){}

    ClusteringResult(String result){
        String[] strs = result.split(",");
        BigDecimal[] nums = new BigDecimal[3];

        int i=0;
        for (String str : strs) {
            nums[i++] = new BigDecimal(str);
        }
        List<BigDecimal> list = Arrays.asList(nums);
        Collections.sort(list);
        low=list.get(0);
        mid=list.get(1);
        high=list.get(2);

    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public BigDecimal getHigh() {
        return high;
    }
    // Other getters and setters
}