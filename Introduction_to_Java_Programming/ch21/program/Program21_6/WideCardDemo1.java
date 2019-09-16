public class WideCardDemo1 {
  public static void main(String[] args) {
    GenericStack<Integer> intStack = new GenericStack<Integer>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(-2);
    System.out.print("The max number is " + max(intStack));
  }

  public static double max(GenericStack<? extends Number> stack) {
    double max = stack.pop().doubleValue();

    while (!stack.isEmpty()) {
      double value = stack.pop().doubleValue();
      if (max < value)
        max = value;
    }

    return max;
  }
}