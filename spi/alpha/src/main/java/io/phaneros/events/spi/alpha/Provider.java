/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.phaneros.events.spi.alpha;

import io.humainary.events.Events;
import io.humainary.events.spi.EventsProvider;
import io.humainary.substrates.sdk.AbstractContextProvider;

/**
 * The SPI implementation of {@link EventsProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

final class Provider
  extends AbstractContextProvider< Events.Emitter, Events.Context >
  implements EventsProvider {

  Provider () {
    super (
      environment ->
        new Context (
          environment,
          Emitter::new
        )
    );
  }

}
