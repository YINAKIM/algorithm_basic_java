package chap01;

//3개의 정수값을 입력하고 최대값 구하기

class Max3{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구한다");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int a = stdIn.nextInt();
        System.out.println("c의 값 : "); int a = stdIn.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
    }
}