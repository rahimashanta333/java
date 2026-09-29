public class Main {
public static void main(String[] args) {
int number = 70;
if(isEven(number)) {
System.out.println("Even");
}
else {
System.out.println("Odd");
}
static boolean isEven(int number) {
return number % 2 == 0;
}
}
}
