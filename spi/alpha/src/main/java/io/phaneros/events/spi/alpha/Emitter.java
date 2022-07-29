/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.phaneros.events.spi.alpha;

import io.humainary.events.Events;
import io.humainary.substrates.Substrates.Environment;
import io.humainary.substrates.Substrates.Inlet;
import io.humainary.substrates.sdk.AbstractInstrument;

import java.util.function.Supplier;

final class Emitter
  extends AbstractInstrument< Environment >
  implements Events.Emitter {

  Emitter (
    final Inlet< Environment > inlet
  ) {

    super (
      inlet
    );

  }


  @Override
  public void emit () {

    inlet.emit (
      environment ()
    );

  }


  @Override
  public void emit (
    final Environment override
  ) {

    inlet.emit (
      environment ()
        .override (
          override
        )
    );

  }

  @Override
  public void emit (
    final Supplier< ? extends Environment > supplier
  ) {

    inlet.emit (
      supplier
    );

  }

}
