package web.model;

public class Car {
    private String model;
    private int series;
    private String bodywork;

    public Car(String model, int series, String bodywork) {
        this.model = model;
        this.series = series;
        this.bodywork = bodywork;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBodywork() {
        return bodywork;
    }

    public void setBodywork(String bodywork) {
        this.bodywork = bodywork;
    }
}
