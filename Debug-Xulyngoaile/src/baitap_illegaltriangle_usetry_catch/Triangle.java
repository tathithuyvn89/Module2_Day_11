package baitap_illegaltriangle_usetry_catch;

public class Triangle {
    int side1;
    int side2;
    int side3;

    public Triangle() {
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) throws Exception {
        if (side1<=0){
            throw new Exception("The side must be Interger bigger than Zero");
        } else {
            this.side1 = side1;
        }
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) throws Exception {
        if (side2<=0){
            throw new Exception("The side must be Interger bigger than Zero");
        } else {
            this.side2 = side2;
        }
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) throws Exception {
        if (side3<=0){
            throw new Exception("The side must be Interger bigger than Zero");
        } else if(getSide1()+getSide2()<=side3) {
            throw new Exception("The side 3 must be less than sum of the side 1 and side 2");
        } else {
            this.side3 = side3;
        }
    }

}
