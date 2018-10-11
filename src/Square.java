public class Square {

    int a = 1;
    int b = 1;

    public int getArea(){
        return a*b;
    }
    public int getPerimeter(){
        return
        a + a + b + b;
    }

    public Square() {
    }

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

}

// A = 1, B =1  (Result:  area = 1, perimeter = 4)
//A = 5, B = 10 (Result:  area = 50, perimeter = 30)
//A = 10000, B = 0 (Result:  area = 0, perimeter = 0)
//A = 6, B = -4 (Result:  area = ?, perimeter = ?)