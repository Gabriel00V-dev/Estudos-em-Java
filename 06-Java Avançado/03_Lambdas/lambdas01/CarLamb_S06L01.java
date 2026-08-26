public class CarLamb_S06L01 {
    private String name = "Audi";
    private String color;
    private int year;
    
    public CarLamb_S06L01(String color, int year) {
        this.color = color;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "CarParam_S06L01 [name=" + name + ", color=" + color + ", year=" + year + "]";
    }
}
