package TH1;

public class SecondDeEqual extends FirstDeEqual{
    private float c;

    public SecondDeEqual(float a, float b, float c) {
        super(a, b);
        this.c = c;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public String result2(){
        float a = this.getA();
        float b = this.getB();
        if(a == 0 && b != 0 && c != 0) {
            this.setA(b);
            this.setB(c);
            return super.result();
        }
        if(a != 0) {
            float delta = b*b - 4*(a*c);
            if(delta < 0) return "PT vo nghiem";
            if(delta == 0) return Float.toString(-b/(2*a));
            if (delta > 0 ) {
              return Float.toString((float) (-b+Math.sqrt(delta))/(2*a))
               + " , " + Float.toString((float)(-b-Math.sqrt(delta))/(2*a));
            }
        }
        return "PT nhap vao sai!";
    }
}
