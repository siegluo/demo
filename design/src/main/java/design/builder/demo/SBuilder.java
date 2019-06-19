package design.builder.demo;

public class SBuilder {
    private Integer a;
    private Integer b;
    private Integer c;

    private S build() {
        return new S(this);
    }

    public Integer getA() {
        return a;
    }

    public SBuilder setA(Integer a) {
        this.a = a;
        return this;
    }

    public Integer getB() {
        return b;
    }

    public SBuilder setB(Integer b) {
        this.b = b;
        return this;
    }

    public Integer getC() {
        return c;
    }

    public SBuilder setC(Integer c) {
        this.c = c;
        return this;
    }
}
