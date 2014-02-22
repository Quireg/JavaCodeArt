import java.util.ArrayList;


public class Container {
    private static ArrayList<Figure> figures;

    public Container(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public static Figure findMaxPerimetr(){
        Figure result = figures.get(0);
        for (int i = 0; i < figures.size() ; i++) {
            if(figures.get(i).calcPerimetr() > result.calcPerimetr()){
                result = figures.get(i);
            }
        }

        return result;
    }
    public Figure findMaxSquare(){
        Figure result = figures.get(0);
        for (int i = 0; i < figures.size() ; i++) {
            if(figures.get(i).calcSquare() > result.calcSquare()){
                result = figures.get(i);
            }
        }

        return result;
    }
}
