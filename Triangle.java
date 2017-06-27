class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public String whichTriangle() {
    if (((mSideOne + mSideTwo) < mSideThree) || ((mSideOne + mSideThree) < mSideTwo) || ((mSideTwo + mSideThree) < mSideOne)) {
      return "Not a Triangle";
    } else {
      if (mSideOne == mSideTwo && mSideOne == mSideThree) {
        return "Equilateral";
      } else if ((mSideOne == mSideTwo) || (mSideOne == mSideThree) || (mSideTwo == mSideThree)) {
        return "Isosceles";
      } else {
        return "Scalene";
      }
    }
  }
}
