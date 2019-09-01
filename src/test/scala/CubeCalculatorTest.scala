import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("TestCubeCalculatorInput3ShouldBe27") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("TestCubeCalculatorInput0ShouldBe0") {
    assert(CubeCalculator.cube(0) === 0)
  }

  test("TestCubeCalculatorInput-1ShouldBe0") {
    assert(CubeCalculator.cube(-1) === 0)
  }
}