public class Main {
public static void main(String[] args) {
System.out.println(factorial(5));
}
static int factorial(int n) {
int result = 1;
for(int i=1;i<=n;i++) {
result *= i;
}
return result;
}
}
