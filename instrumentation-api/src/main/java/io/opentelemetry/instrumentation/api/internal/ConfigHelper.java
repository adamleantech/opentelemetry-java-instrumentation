/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.internal;

/**
 * This class is used to wrap {@code ConfigPropertiesUtil} to facilitate easier test mocking.
 * This class is internal and is hence not for public use. Its APIs are unstable and can change at
 * any time.
 */
public final class ConfigHelper {
  private static final boolean ADD_BAGGAGE_TO_SPANS =
      ConfigPropertiesUtil.getBoolean("otel.instrumentation.span.add-baggage", false);

  public boolean addBaggageToSpans() {
    return ADD_BAGGAGE_TO_SPANS;
  }
}
