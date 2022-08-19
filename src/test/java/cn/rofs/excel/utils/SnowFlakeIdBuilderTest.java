package cn.rofs.excel.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rainofsilence
 * @date 2022/8/16 周二
 */
class SnowFlakeIdBuilderTest {

    @Test
    void idBuilder() {
        SnowFlakeIdBuilder sfIdBuilder = new SnowFlakeIdBuilder(1,1,1);
        for (int i = 0; i < 30; i++) {
            System.out.println(sfIdBuilder.nextId());
        }
    }
}