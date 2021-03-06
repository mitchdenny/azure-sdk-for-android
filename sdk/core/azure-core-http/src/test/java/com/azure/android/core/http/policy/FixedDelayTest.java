// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.core.http.policy;

import org.junit.jupiter.api.Test;
import org.threeten.bp.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link FixedDelay}.
 */
public class FixedDelayTest {

    @Test
    public void testNullDelay() {
        assertThrows(NullPointerException.class, () -> new FixedDelay(3, null));
    }

    @Test
    public void testNegativeMaxRetries() {
        assertThrows(IllegalArgumentException.class, () -> new FixedDelay(-1, Duration.ofSeconds(1)));
    }

    @Test
    public void testZeroDelay() {
        FixedDelay fixedDelay = new FixedDelay(3, Duration.ofSeconds(0));
        assertEquals(fixedDelay.getMaxRetries(), 3);
        assertEquals(fixedDelay.calculateRetryDelay(null, null, 2).toMillis(), 0);
    }

    @Test
    public void testFixedDelay() {
        FixedDelay fixedDelay = new FixedDelay(3, Duration.ofSeconds(1));
        assertEquals(fixedDelay.getMaxRetries(), 3);
        assertEquals(fixedDelay.calculateRetryDelay(null, null, 2).toMillis(), 1000);
    }
}
