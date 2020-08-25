package org.maso.opensource.p3c;

import org.junit.Assert;
import org.junit.Test;

/**
 * p3c错误码单元测试
 *
 * @author tanpenggood
 */
public class ErrorCodeEnumTest {

    @Test
    public void sTest() {
        Assert.assertEquals("00000", ErrorCodeEnum.CODE_00000.getCode());
        Assert.assertEquals("A0001", ErrorCodeEnum.CODE_A0001.getCode());
        Assert.assertEquals("A0100", ErrorCodeEnum.CODE_A0100.getCode());
    }

}
