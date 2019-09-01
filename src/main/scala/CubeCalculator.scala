object CubeCalculator {
  def cube(x: Int) = {
    if (x < 0) {
      0
    } else {
      x * x * x
    }
  }
}
