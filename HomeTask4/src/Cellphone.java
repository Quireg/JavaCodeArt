/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 20.03.14
 * Time: 2:44
 * To change this template use File | Settings | File Templates.
 */
public class Cellphone extends Good {
    private int ram;
    private String os;
    private int diagonal;
    private boolean video;

    public Cellphone(String model, int weight, int cost, String manufacturer, int goodid, int ram, String os, int diagonal, boolean video) {
        super(model, weight, cost, manufacturer, goodid);
        this.ram = ram;
        this.os = os;
        this.diagonal = diagonal;
        this.video = video;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
}
