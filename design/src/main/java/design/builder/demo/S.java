package design.builder.demo;

public class S {
    private Integer  a;
    private Integer  b;
    private Integer  c;

    public S(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public S(SBuilder sBuilder) {
        this.a = sBuilder.getA();
        this.b = sBuilder.getB();
        this.c = sBuilder.getC();
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }
}
