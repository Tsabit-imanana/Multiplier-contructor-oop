class Kubus {
    private double sisi;

    public Kubus() {
        this.sisi = 1.0; // Default value
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}
