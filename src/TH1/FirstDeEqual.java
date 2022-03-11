package TH1;

public class FirstDeEqual {
    private float a,b;

    public FirstDeEqual(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public String result(){
        if (a == 0 && b == 0) return "PT vo so nghiem";
        if (a == 0) return "PT vo nghiem";
        return Float.toString(-b/a);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
