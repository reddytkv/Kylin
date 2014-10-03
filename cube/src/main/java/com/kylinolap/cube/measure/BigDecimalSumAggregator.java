/*
 * Copyright 2013-2014 eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kylinolap.cube.measure;

import java.math.BigDecimal;

/**
 * @author yangli9
 */
public class BigDecimalSumAggregator extends MeasureAggregator<BigDecimal> {

    BigDecimal sum = new BigDecimal(0);

    @Override
    public void reset() {
        sum = new BigDecimal(0);
    }

    @Override
    public void aggregate(BigDecimal value) {
        sum = sum.add(value);
    }

    @Override
    public BigDecimal getState() {
        return sum;
    }

    @Override
    public int getMemBytes() {
        return guessBigDecimalMemBytes();
    }
}