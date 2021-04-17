public class Area {
    public Area(){

    }

    public int circle_area(int r){
        double c_area = r * r * 3.14;
        return (int) c_area;
        //return 0;
    }

    public int rectangle_area(int h, int l){
        double r_area = h * l;
        //return (int) r_area;
        return 0;
    }

    public int triangle_area(int h, int b){
        double t_area = (h * b)/2.0;
        //return (int) t_area;
        return 0;
    }
}
