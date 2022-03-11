package TH1;

public class MyCal {

    public float add  (float a, float b){
        return a+b;
    }

    public float sub  (float a, float b){
        return a-b;
    }

    public float mul  (float a, float b){
        return a*b;
    }

    public float div  (float a, float b){
        return a/b;
    }

    public float min (float a, float b){
        if (a < b) return a;
        else return b;
    }

    public float max (float a, float b){
        if (a > b) return a;
        else return b;
    }

}
