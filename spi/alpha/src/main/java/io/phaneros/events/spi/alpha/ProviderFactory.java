/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.phaneros.events.spi.alpha;

import io.humainary.events.spi.EventsProvider;
import io.humainary.spi.Providers.Factory;

/**
 * The SPI provider factory implementation of {@link EventsProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

public final class ProviderFactory
  implements Factory< EventsProvider > {

  @Override
  public EventsProvider create () {

    return
      new Provider ();

  }

}
