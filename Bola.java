class Bola {
    private double radius;

    public Bola() {
        this.radius = 1.0; // Default value
    }

    public Bola(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
