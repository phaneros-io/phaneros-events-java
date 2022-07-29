/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.phaneros.events.spi.alpha;

import io.humainary.events.Events;
import io.humainary.events.Events.Emitter;
import io.humainary.substrates.Substrates.Environment;
import io.humainary.substrates.Substrates.Name;
import io.humainary.substrates.Substrates.Type;
import io.humainary.substrates.sdk.AbstractContext;

import static io.humainary.events.Events.Emitter.TYPE;

final class Context
  extends AbstractContext< Emitter, Environment >
  implements Events.Context {

  Context (
    final Environment environment,
    final Producer< ? extends Emitter, Environment > producer
  ) {

    super (
      environment,
      producer
    );

  }

  @Override
  protected Type type () {

    return
      TYPE;

  }


  @Override
  public Emitter emitter (
    final Name name
  ) {

    return
      instrument (
        name
      );

  }

}
