package kyu8;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
        return op == "+" ? v1 + v2 : op == "-" ? v1 - v2 : op == "*" ? v1 * v2 : v1 / v2;
    }
}
