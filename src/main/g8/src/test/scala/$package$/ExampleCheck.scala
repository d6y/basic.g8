package $package$

import org.scalacheck._
import org.scalacheck.Prop.forAll
//import org.scalacheck.rng.Seed

// https://gist.github.com/non/aeef5824b3f681b9cfc141437b16b014
class ExampleCheck extends Properties("List") {
  propertyWithSeed("Lists have size of zero or more", None) = forAll { 
    (xs: List[Int]) =>
      xs.length >= 0
  }
}
