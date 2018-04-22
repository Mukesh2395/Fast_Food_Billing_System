
package Bean;

public class CoffeeBean {

    public static void setBrown_coffee(String brown_coffee) {
        CoffeeBean.brown_coffee = brown_coffee;
    }

    public static void setBlack_coffee(String black_coffee) {
        CoffeeBean.black_coffee = black_coffee;
    }

    public static void setLatte_coffee(String latte_coffee) {
        CoffeeBean.latte_coffee = latte_coffee;
    }

    public static void setAmericano_coffee(String americano_coffee) {
        CoffeeBean.americano_coffee = americano_coffee;
    }

    public static void setHocha_coffee(String hocha_coffee) {
        CoffeeBean.hocha_coffee = hocha_coffee;
    }

    public static void setCappachino_coffee(String cappachino_coffee) {
        CoffeeBean.cappachino_coffee = cappachino_coffee;
    }
    public static String brown_coffee,black_coffee,latte_coffee,americano_coffee,hocha_coffee,cappachino_coffee;

    public static String getBrown_coffee() {
        return brown_coffee;
    }

    public static String getBlack_coffee() {
        return black_coffee;
    }

    public static String getLatte_coffee() {
        return latte_coffee;
    }

    public static String getAmericano_coffee() {
        return americano_coffee;
    }

    public static String getHocha_coffee() {
        return hocha_coffee;
    }

    public static String getCappachino_coffee() {
        return cappachino_coffee;
    }

}
