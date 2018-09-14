package $package$

import org.scalatest.prop.TableDrivenPropertyChecks._

class ExampleSpec extends Spec {

  "Wibble" in {

    val examples = Table(
      ("input", "output"),
      (1, 2),
    )

    forAll(examples) { (in, out) =>
      in + 1 shouldBe out
    }
  }
}
