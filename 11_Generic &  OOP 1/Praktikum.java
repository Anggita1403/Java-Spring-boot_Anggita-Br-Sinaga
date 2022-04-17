public class anggi {
    public static void main(String[] args) {
        Cat cat = new Cat("Hitam", 4);
        cat.show_identity();
    }
}

class Cat {
    private String fur_color;
    private Integer num_of_leg;

    public Integer getNum_of_leg() {
        return num_of_leg;
    }

    public String getFur_color() {
        return fur_color;
    }

    public void setNum_of_leg(Integer num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    public Cat(String fur_color, Integer num_of_leg) {
        this.fur_color = fur_color;
        this.num_of_leg = num_of_leg;
    }

    public void show_identity(){
        System.out.print("Saya Kucing dengan detail, Warna bulu " + fur_color );
        System.out.println(" dengan jumlah kaki : " + num_of_leg );
    }

}
