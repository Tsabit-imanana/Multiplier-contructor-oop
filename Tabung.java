class Tabung {
    private double radius, tinggi;

    public Tabung() {
        this.radius = 1.0;
        this.tinggi = 1.0;
    }

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }
}
