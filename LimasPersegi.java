class LimasPersegi {
    private double sisi, tinggi;

    public LimasPersegi() {
        this.sisi = 1.0;
        this.tinggi = 1.0;
    }

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.pow(sisi, 2) * tinggi;
    }
}
