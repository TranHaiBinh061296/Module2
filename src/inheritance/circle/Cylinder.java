package inheritance.circle;

public class Cylinder extends Circle{
    private double chieucao = 3.0;

    public Cylinder() {
    }
    public Cylinder(double chieucao, String color, double radius) {
        super(radius, color);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    public double getVolumetric() {
        return 2*Math.PI*getRadius()*chieucao;
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao là: "
                + getChieucao()
                + " à lớp con của "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.9, "xanh", 3.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolumetric());
    }
}
