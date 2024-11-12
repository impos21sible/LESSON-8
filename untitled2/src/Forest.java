public class Forest {

    static String color ;
    public String setSeason(String newSeason){
        if (newSeason.equals("зима") ) {
            color = "белый";
        }
        else {
            color = "серо-рыжий";
        }
        return color;


    }
}
