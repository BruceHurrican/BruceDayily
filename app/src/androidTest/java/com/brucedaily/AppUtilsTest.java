/*
 * BruceHurrican
 *  Copyright (c) 2016.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *     This document is Bruce's individual learning the android demo, wherein the use of the code from the Internet, only to use as a learning exchanges.
 *     And where any person can download and use, but not for commercial purposes.
 *     Author does not assume the resulting corresponding disputes.
 *     If you have good suggestions for the code, you can contact BurrceHurrican@foxmail.com
 *     本文件为Bruce's个人学习android的作品, 其中所用到的代码来源于互联网，仅作为学习交流使用。
 *     任和何人可以下载并使用, 但是不能用于商业用途。
 *     作者不承担由此带来的相应纠纷。
 *     如果对本代码有好的建议，可以联系BurrceHurrican@foxmail.com
 */

package com.brucedaily;

//import org.junit.Assert;

import android.util.Log;

import com.bruceutils.utils.LogUtils;
import com.bruceutils.utils.logdetails.LogDetails;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by BruceHurrican on 16/9/13.
 */
public class AppUtilsTest extends TestCase {

    //    @org.junit.Before
    public void setUp() throws Exception {

    }

    //    @org.junit.After
    public void tearDown() throws Exception {

    }

    //    @org.junit.Test
    public void testFloat2StringPrice() throws Exception {
        Assert.assertEquals("33", AppUtils.float2StringPrice(33f));
        Log.i("安卓单元测试", "testFloat2StringPrice 方法执行成功");
        LogDetails.i("安卓单元测试");
        LogUtils.i("安卓单元测试2");
    }

    //    @org.junit.Test
    public void testStr2strPrice() throws Exception {
        Assert.assertEquals("54,333.46", AppUtils.str2strPrice("54333.4565f"));
    }

    //    @org.junit.Test
    public void testIsPriceValid() throws Exception {
        Assert.assertTrue(AppUtils.isPriceValid("33.43"));
    }

    //    @org.junit.Test
    public void testOperatorDBfile() throws Exception {
    }
}